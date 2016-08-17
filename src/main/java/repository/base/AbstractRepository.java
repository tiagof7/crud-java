package repository.base;

import java.io.Serializable;

import repository.core.SpringDataRepository;

public interface AbstractRepository <E, PK extends Serializable> extends SpringDataRepository<E, PK>{

}
