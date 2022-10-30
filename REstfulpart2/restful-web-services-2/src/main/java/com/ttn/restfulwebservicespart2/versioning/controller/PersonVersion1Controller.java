package com.ttn.restfulwebservicespart2.versioning.controller;

import com.ttn.restfulwebservicespart2.versioning.entity.PersonV1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/version1")
public class PersonVersion1Controller {

    @GetMapping(path = "/person")
    public PersonV1 getPersonsUsingUri(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/person/param", params = "version=1")
    public PersonV1 getPersonsUsingRequestParameters(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonsUsingCustomHeader(){
        return new PersonV1("Ayush Jain");
    }

    @GetMapping(path = "/person/accept", produces = "application/v1+json")
    public PersonV1 getPersonsUsingMimeType(){
        return new PersonV1("Ayush Jain");
    }
}
