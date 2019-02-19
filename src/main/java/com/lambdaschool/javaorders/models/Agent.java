package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name="agents")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long AGENTCODE;

    private String AGENTNAME;
    private String WORKINGAREA;
    private double COMMISSION;
    private String PHONE;
    private String COUNTRY;

    public Agent() {
    }

    public String getAGENTNAME() {
        return AGENTNAME;
    }

    public void setAGENTNAME(String AGENTNAME) {
        this.AGENTNAME = AGENTNAME;
    }

    public String getWORKINGAREA() {
        return WORKINGAREA;
    }

    public void setWORKINGAREA(String WORKINGAREA) {
        this.WORKINGAREA = WORKINGAREA;
    }

    public double getCOMMISSION() {
        return COMMISSION;
    }

    public void setCOMMISSION(double COMMISSION) {
        this.COMMISSION = COMMISSION;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
}
