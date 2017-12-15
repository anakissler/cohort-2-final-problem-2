package edu.cnm.deepdive.springdatarestpeople.membership;

import edu.cnm.deepdive.springdatarestpeople.group.Group;
import edu.cnm.deepdive.springdatarestpeople.person.Person;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Represents the membership for people to belong to
 */
@Entity(name = "GroupMember")
public class Membership {

  /**
   * Saves a specific Id for a given membership
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
   * Saves a specific person to the membership
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_id")
  private Person person;

  /**
   * Saves a specific group to the membership
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "group_id")
  private Group group;

  /**
   * Allows for the retrieval of the Id
   * @returns the Id
   */
  public Long getId() {
    return id;
  }

  /**
   * Saves the membership to the database
   */
  public Membership() {
  }

  /**
   * Allows for the retrieval of the timestamp
   * @return returns the timestamp
   */
  public Date getCreated() {
    return created;
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

  /**
   * Allows for the retrieval of a specific group
   * @return returns the group
   */
  public Group getGroup() {
    return group;
  }

  /**
   * Allows for the mutation of a specific group
   * @param group passes in the group
   */
  public void setGroup(Group group) {
    this.group = group;
  }
}
