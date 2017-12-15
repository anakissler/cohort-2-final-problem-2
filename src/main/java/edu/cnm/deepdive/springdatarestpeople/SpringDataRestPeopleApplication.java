package edu.cnm.deepdive.springdatarestpeople;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Data REST builds on top of Spring Data repositories, analyzes your application’s domain model
 * and exposes HTTP resources for aggregates contained in the model.
 */

@SpringBootApplication

public class SpringDataRestPeopleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataRestPeopleApplication.class, args);
  }
}
