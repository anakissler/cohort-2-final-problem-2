package edu.cnm.deepdive.springdatarestpeople.person;

import edu.cnm.deepdive.springdatarestpeople.group.Group;
import edu.cnm.deepdive.springdatarestpeople.membership.Membership;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

/**
 * Represents a specific person
 */
@Entity
public class Person {


  /**
   * Saves a specific Id for a given person
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  /**
   * Generate timestamp to be used with id to reference records in the entity.
   */
  @Column(nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  @Temporal(TemporalType.TIMESTAMP)
  private Date created;

  /**
   * Map one person to many membership.
   */
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.ALL)
  private List<Membership> memberships = new LinkedList<>();

  /**
   * Map one person to many group.
   */
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.ALL)
  private List<Group> groups = new LinkedList<>();
  /**
   * Saves the name for a specific person
   */
  private String name;

  /**
   * Allows for the retrieval of the Id
   * @returns the Id
   */
  public Long getId() {
    return id;
  }

  /**
   * Saves the specific person to the database
   */
  public Person() {
  }

  /**
   * Allows for the mutation of the name
   * @param name passes in the name
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * Allows for retrieval of the name
   * @return returns the name
   */
  public String getName() {
    return name;
  }

  /**
   * Allows for the retrieval of the timestamp
   * @return returns the timestamp
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Allows for the retrieval of the memberships
   * @return returns the memberships
   */
  public List<Membership> getMemberships() {
    return memberships;
  }

  /**
   * Allows for the mutation of the memberships
   * @param memberships passes in the memberships
   */
  public void setMemberships(List<Membership> memberships) {
    this.memberships = memberships;
  }
  /**
   * Allows for the retrieval of a specific group
   * @return returns the specific group
   */
  public List<Group> getGroups() {
    return groups;
  }

  /**
   * Allows for the mutation of a specific group
   * @param groups passes in a group
   */
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }
}
