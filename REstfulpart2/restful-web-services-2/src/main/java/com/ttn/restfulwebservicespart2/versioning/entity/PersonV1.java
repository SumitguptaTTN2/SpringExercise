package com.ttn.restfulwebservicespart2.versioning.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class PersonV1 {
    private String personName;

    public PersonV1(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "personName='" + personName + '\'' +
                '}';
    }
}
