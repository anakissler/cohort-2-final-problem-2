package edu.cnm.deepdive.springdatarestpeople.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 *  This interface provides additional methods to retrieve entities using the pagination
 *  and sorting abstraction.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

}
