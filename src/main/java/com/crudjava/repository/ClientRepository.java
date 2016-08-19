package com.crudjava.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.crudjava.entity.Client;

@RepositoryRestResource(path="client", collectionResourceRel = "client", exported=true,itemResourceRel="client")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

	
	Client findOne(Long id);

	List<Client> findByName(@Param("name") String name);
	
}
