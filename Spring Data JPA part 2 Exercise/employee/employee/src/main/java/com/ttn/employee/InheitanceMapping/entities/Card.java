package com.ttn.employee.InheitanceMapping.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class Card extends Payment {

    private String cardnumber;

}
