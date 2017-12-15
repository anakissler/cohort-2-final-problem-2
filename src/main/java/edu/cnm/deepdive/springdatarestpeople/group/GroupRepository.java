package edu.cnm.deepdive.springdatarestpeople.group;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *  This interface provides additional methods to retrieve entities using the pagination
 *  and sorting abstraction.
 */
@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupRepository extends PagingAndSortingRepository<Group, Long> {


}
