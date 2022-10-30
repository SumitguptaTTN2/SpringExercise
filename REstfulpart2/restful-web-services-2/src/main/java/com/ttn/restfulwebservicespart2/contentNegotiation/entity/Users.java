package com.ttn.restfulwebservicespart2.contentNegotiation.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter @NoArgsConstructor
public class Users {
    @NotNull
    private String userName;

    public Users(String userName) {

        this.userName = userName;
    }
}
