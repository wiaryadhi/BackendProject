package com.bcafinance.model;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 11/01/2023
@Last Modified on 11/01/2023 15:55
Version 1.0
*/


import com.bcafinance.utils.ConstantMessage;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class User implements Serializable {

    private static final long serialversionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(message = ConstantMessage.WARNING_REQUIRED)
    @NotEmpty(message = ConstantMessage.WARNING_LENGHT)
    @Column(name = "UserID", nullable = false, length = 255, unique = true)
    private String userID;

    @Length(message = ConstantMessage.WARNING_DATA_EMPTY)
    @NotEmpty(message = ConstantMessage.WARNING_DATA_EMPTY)
    @Column(name = "Password", nullable = false, length = 60)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


