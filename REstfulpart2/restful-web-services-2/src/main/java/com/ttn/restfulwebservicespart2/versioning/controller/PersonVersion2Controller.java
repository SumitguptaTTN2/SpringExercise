package com.ttn.restfulwebservicespart2.versioning.controller;

import com.ttn.restfulwebservicespart2.versioning.entity.PersonName;
import com.ttn.restfulwebservicespart2.versioning.entity.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Version2")
public class PersonVersion2Controller {
    @GetMapping(path = "/person")
    public PersonV2 getPersonsUsingUri() {
        return new PersonV2(new PersonName("Ayush", "", "Jain"));
    }

    @GetMapping(path = "/person/param", params = "version=2")
    public PersonV2 getPersonsUsingRequestParameters() {
        return new PersonV2(new PersonName("Ayush", "", "Jain"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonsUsingCustomHeadera() {
        return new PersonV2(new PersonName("Ayush", "", "Jain"));
    }

    @GetMapping(path = "/person/accept", produces = "application/v2+json")
    public PersonV2 getPersonsUsingMimeType() {
        return new PersonV2(new PersonName("Ayush", "", "Jain"));
    }
}
