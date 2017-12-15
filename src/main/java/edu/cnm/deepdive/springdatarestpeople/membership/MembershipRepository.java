package edu.cnm.deepdive.springdatarestpeople.membership;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 *  This interface provides additional methods to retrieve entities using the pagination
 *  and sorting abstraction.
 */
@RepositoryRestResource(collectionResourceRel = "memberships", path = "memberships")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {


}
