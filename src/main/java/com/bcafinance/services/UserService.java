package com.bcafinance.services;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 11/01/2023
@Last Modified on 11/01/2023 17:11
Version 1.0
*/

import com.bcafinance.dto.LoginDTO;
import com.bcafinance.handler.FormatValidation;
import com.bcafinance.handler.ResourceNotFoundException;
import com.bcafinance.model.User;
import com.bcafinance.repos.UserRepo;
import com.bcafinance.utils.ConstantMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Object loginUser(LoginDTO credential) throws Exception {
        User user = userRepo.findByUserID(credential.getUserID()).orElseThrow(() ->
                new ResourceNotFoundException(ConstantMessage.WARNING_LOGIN_FAIL));
        if (user != null) {
            if (user.getPassword().equals(credential.getPassword())) {
                return user;
            } else {
                throw new ResourceNotFoundException(ConstantMessage.WARNING_LOGIN_FAIL);
            }
        } else {
            throw new ResourceNotFoundException(ConstantMessage.WARNING_LOGIN_FAIL);
        }
    }

    public List<User> findAll() throws Exception {
        return userRepo.findAll();
    }


}
