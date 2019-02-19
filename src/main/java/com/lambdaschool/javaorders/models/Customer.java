package com.lambdaschool.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long CUSTCODE;

    @Column(nullable = false)
    private String CUSTNAME;

    private String CUSTCITY;
    private String WORKINGAREA;
    private String CUSTCOUNTRY;
    private String GRADE;
    private double OPENINGAMT;
    private double RECEIVEAMT;
    private double PAYMENTAMT;
    private double OUTSTANDINGAMT;
    private String PHONE;

    @ManyToOne
    @JoinColumn(name = "AGENTCODE", nullable = false)
    @JsonIgnore
    private Agent agent;

    public Customer(){
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTCITY() {
        return CUSTCITY;
    }

    public void setCUSTCITY(String CUSTCITY) {
        this.CUSTCITY = CUSTCITY;
    }

    public String getWORKINGAREA() {
        return WORKINGAREA;
    }

    public void setWORKINGAREA(String WORKINGAREA) {
        this.WORKINGAREA = WORKINGAREA;
    }

    public String getCUSTCOUNTRY() {
        return CUSTCOUNTRY;
    }

    public void setCUSTCOUNTRY(String CUSTCOUNTRY) {
        this.CUSTCOUNTRY = CUSTCOUNTRY;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public double getOPENINGAMT() {
        return OPENINGAMT;
    }

    public void setOPENINGAMT(double OPENINGAMT) {
        this.OPENINGAMT = OPENINGAMT;
    }

    public double getRECEIVEAMT() {
        return RECEIVEAMT;
    }

    public void setRECEIVEAMT(double RECEIVEAMT) {
        this.RECEIVEAMT = RECEIVEAMT;
    }

    public double getPAYMENTAMT() {
        return PAYMENTAMT;
    }

    public void setPAYMENTAMT(double PAYMENTAMT) {
        this.PAYMENTAMT = PAYMENTAMT;
    }

    public double getOUTSTANDINGAMT() {
        return OUTSTANDINGAMT;
    }

    public void setOUTSTANDINGAMT(double OUTSTANDINGAMT) {
        this.OUTSTANDINGAMT = OUTSTANDINGAMT;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
