package com.Jpa.jpapart3.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "authorname")
    private String authorName;
    @Embedded
    private Address address;
    @Column(name = "subject")
     List<String> subject = Arrays.asList("Math","English","LifeScience");
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", address=" + address +
                ", Subject=" + subject +
                '}';
    }
}
