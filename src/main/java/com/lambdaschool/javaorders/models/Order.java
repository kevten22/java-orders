package com.lambdaschool.javaorders.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long ORDNUM;

    private double ORDAMOUNT;
    private double ADVANCEAMOUNT;

    @ManyToOne
    @JoinColumn(name = "CUSTCODE", nullable = false)
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "AGENTCODE", nullable = false)
    @JsonIgnore
    private Agent agent;

    private String ORDDESCRIPTION;

    public double getORDAMOUNT() {
        return ORDAMOUNT;
    }

    public void setORDAMOUNT(double ORDAMOUNT) {
        this.ORDAMOUNT = ORDAMOUNT;
    }

    public double getADVANCEAMOUNT() {
        return ADVANCEAMOUNT;
    }

    public void setADVANCEAMOUNT(double ADVANCEAMOUNT) {
        this.ADVANCEAMOUNT = ADVANCEAMOUNT;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getORDDESCRIPTION() {
        return ORDDESCRIPTION;
    }

    public void setORDDESCRIPTION(String ORDDESCRIPTION) {
        this.ORDDESCRIPTION = ORDDESCRIPTION;
    }
}
