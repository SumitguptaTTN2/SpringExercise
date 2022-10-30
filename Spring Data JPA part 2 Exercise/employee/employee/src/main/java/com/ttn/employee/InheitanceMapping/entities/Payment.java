package com.ttn.employee.InheitanceMapping.entities;
/*
main class
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pmode",discriminatorType = DiscriminatorType.STRING)


card
@DiscriminatorValue("cc")

check
@DiscriminatorValue("ch")

create table payment(
id int PRIMARY KEY auto_increment,
pmode varchar(2),
amount decimal(8,3) ,
cardnumber varchar(20),
checknumber varchar(20)
);
 */


/*
main class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

Need Two tables for sub classes
create table card(
id int PRIMARY KEY ,
amount decimal(8,3),
cardnumber varchar(20)
)

create table bankcheck(
id int PRIMARY KEY ,
amount decimal(8,3),
checknumber varchar(20)
)
 */

/*
@Inheritance(strategy = InheritanceType.JOINED)

In subclasses
@PrimaryKeyJoinColumn(name = "id")

create table payment(
id int PRIMARY KEY auto_increment,
amount decimal(8,3)
);

create table card(
id int ,
cardnumber varchar(20),
 FOREIGN KEY (id)
REFERENCES payment(id)
);
create table bankcheck(
id int ,
checknumber varchar(20),
FOREIGN KEY (id)
REFERENCES payment(id)
)
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;


}
