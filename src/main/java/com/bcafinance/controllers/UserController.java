package com.bcafinance.controllers;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition) 
@Author ASUS a.k.a. Archan
ITDP 7
Created on 11/01/2023
@Last Modified on 11/01/2023 17:10
Version 1.0
*/


import com.bcafinance.dto.LoginDTO;
import com.bcafinance.handler.ResourceNotFoundException;
import com.bcafinance.handler.ResponseHandler;
import com.bcafinance.model.User;
import com.bcafinance.services.UserService;
import com.bcafinance.utils.ConstantMessage;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/")
public class UserController {
    @Getter
    private UserService userService;


    public UserController(){

    }

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }


    @PostMapping("user/login")
    public ResponseEntity<Object>
    loginUser(@Valid @RequestBody LoginDTO user, @RequestHeader Map<String,String> headers,
              @RequestParam Map<String,String> params,
              WebRequest request, Error error) throws Exception {
        if(user==null)throw new ResourceNotFoundException(ConstantMessage.ERROR_NO_CONTENT);
        return new ResponseHandler().generateResponse(ConstantMessage.SUCCESS_LOGIN, HttpStatus.OK,userService.loginUser(user),null,null);
    }

    @GetMapping("/user/all")
    public ResponseEntity<Object> findAll()throws Exception{

        List<User> lsUser = userService.findAll();

        if(lsUser.size()==0)
        {
            throw new ResourceNotFoundException(ConstantMessage.WARNING_DATA_EMPTY);
        }
        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY,HttpStatus.OK,lsUser,null,null);
    }


}
