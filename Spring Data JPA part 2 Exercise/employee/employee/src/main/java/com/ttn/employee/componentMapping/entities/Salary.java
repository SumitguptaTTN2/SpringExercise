package com.ttn.employee.componentMapping.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Setter
@Getter
@Embeddable
public class Salary {
    @Column(name = "basicsalary")
    private double basicSalary;
    @Column(name = "bonussalary")

    private double bonusSalary;
    @Column(name="taxamount")
    private double taxAmount;
    @Column(name="specialallowancesalary")
    private double specialAllowanceSalary;
}

