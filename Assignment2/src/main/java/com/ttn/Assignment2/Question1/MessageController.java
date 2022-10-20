package com.ttn.Assignment2.Question1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {


    @RequestMapping(method = RequestMethod.GET,path = "/message")
    public String Message()
    {
        return "Welcome to spring boot";
    }

}
