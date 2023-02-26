package com.bcafinance.controllers;

import com.bcafinance.handler.ResourceNotFoundException;
import com.bcafinance.handler.ResponseHandler;
import com.bcafinance.model.MerkMobil;
import com.bcafinance.services.MerkMobilService;
import com.bcafinance.utils.ConstantMessage;
import lombok.Getter;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 03/02/2023 - 17:24
Last Modified on 03/02/2023 - 17:24
Version 1.0
*/
@RestController
@RequestMapping("api")
public class MerkMobilController {
    @Getter
    private MerkMobilService merkMobilService;

    public MerkMobilController() {
    }

    @Autowired
    public MerkMobilController(MerkMobilService merkMobilService) {
        this.merkMobilService = merkMobilService;
    }


    @GetMapping("/mobil/all")
    public ResponseEntity<Object> findByMerk() throws Exception {

        List<MerkMobil> lsMobil = merkMobilService.findAllMerk();

        if (lsMobil.size() == 0) {
            throw new ResourceNotFoundException(ConstantMessage.WARNING_DATA_EMPTY);
        }
        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY, HttpStatus.OK, lsMobil, null, null);
    }
}
