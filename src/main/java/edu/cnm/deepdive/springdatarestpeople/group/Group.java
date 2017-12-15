package edu.cnm.deepdive.springdatarestpeople.group;

import edu.cnm.deepdive.springdatarestpeople.membership.Membership;
import edu.cnm.deepdive.springdatarestpeople.person.Person;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Represents the Group specific people belong to
 */
@Entity(name = "Flowwer")
public class Group {

  /**
   * Saves a specific Id for a given group
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
   * Map one group to many memberships.
   */
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "group", cascade = CascadeType.ALL)
  private List<Membership> memberships = new LinkedList<>();
  /**
   * Saves a specific person to the group
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_id")
  private Person person;
  /**
   * Saves the given name for the group
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
   * Saves the group to the database
   */
  public Group() {
  }

  /**
   * Allows for the mutation of the name
   * @param name passes in the name
   */
  public Group(String name) {
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
   * Allows for the retrieval of a specific person
   * @return returns the person
   */
  public Person getPerson() {
    return person;
  }

  /**
   * Allows for the mutation of a specific person
   * @param person passes in the person
   */
  public void setPerson(Person person) {
    this.person = person;
  }
}

