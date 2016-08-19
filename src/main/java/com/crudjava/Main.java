package com.crudjava;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@ComponentScan
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@PropertySource("application.properties")
public class Main extends RepositoryRestMvcConfiguration {

	private static final String MY_BASE_URI_URI = "/api";

	@SuppressWarnings("deprecation")
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		config.setBasePath(MY_BASE_URI_URI);
	}

	public static void main(String[] args) throws IllegalArgumentException, IOException {

		final String baseUri = "http://localhost:" + (System.getenv("PORT") != null ? System.getenv("PORT") : "9998")
				+ "/";
		// final Map<String, String> initParams = new HashMap<String, String>();
		//
		// initParams.put("com.sun.jersey.config.property.packages","rest");
		//
		// System.out.println("Starting grizzly...");
		// SelectorThread threadSelector =
		// GrizzlyWebContainerFactory.create(baseUri, initParams);
		System.out.println(String.format("SERVIDOR INICIADO NA PORTA %s", baseUri));

		HashMap<String, Object> props = new HashMap<>();
		props.put("server.port", (System.getenv("PORT") != null ? System.getenv("PORT") : "5000"));

		new SpringApplicationBuilder().sources(Main.class).properties(props).run(args);
		// SpringApplication.run(Main.class, args);

	}

}
