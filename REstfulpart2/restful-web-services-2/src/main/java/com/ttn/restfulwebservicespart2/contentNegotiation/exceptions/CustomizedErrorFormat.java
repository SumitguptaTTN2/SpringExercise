package com.ttn.restfulwebservicespart2.contentNegotiation.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor
public class CustomizedErrorFormat {
    private LocalDateTime timeStamp;
    private String message;

    public CustomizedErrorFormat(LocalDateTime timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }
}
