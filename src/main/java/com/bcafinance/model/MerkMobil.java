package com.bcafinance.model;

import javax.persistence.*;
import java.io.Serializable;

/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 03/02/2023 - 14:22
Last Modified on 03/02/2023 - 14:22
Version 1.0
*/
@Entity
@Table(name = "MerkMobil")
public class MerkMobil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Merk", length = 25)
    private String merk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
