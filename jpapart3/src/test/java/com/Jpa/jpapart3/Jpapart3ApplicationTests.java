package com.Jpa.jpapart3;

import com.Jpa.jpapart3.entities.Address;
import com.Jpa.jpapart3.entities.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class Jpapart3ApplicationTests {
    @Autowired
    EntityManager entityManager;
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Autowired
    AuthorRepository authorRepository;

    @Test
    void contextLoads() {
    }

    @Test
  public   void persistSubjects() {

    }

}
