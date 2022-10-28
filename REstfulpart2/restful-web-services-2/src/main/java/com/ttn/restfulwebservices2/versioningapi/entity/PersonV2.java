package com.ttn.restfulwebservices2.versioningapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class PersonV2 {
    private PersonName personName;

    public PersonV2(PersonName personName) {
        this.personName=personName;
    }
}
