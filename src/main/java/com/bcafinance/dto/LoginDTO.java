package com.bcafinance.dto;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 12/01/2023
@Last Modified on 12/01/2023 16:55
Version 1.0
*/

import com.bcafinance.utils.ConstantMessage;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class LoginDTO {


    @NotEmpty(message = ConstantMessage.WARNING_REQUIRED)
    private String userID;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotEmpty(message = ConstantMessage.WARNING_LENGHT)
    private String password;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
