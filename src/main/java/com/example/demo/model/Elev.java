package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Elev {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //precizezi felul in care generezi iD-ul
    private Integer id;

    private String nume;

    private String cnp;

    @Column(name = "telefon")
    private String nrTel;

    @Column(name = "nota_romana")
    private float romana;

    @Column(name = "nota_istorie")
    private float istorie;

    @Column(name = "nota_geografie")
    private float geografie;
}

