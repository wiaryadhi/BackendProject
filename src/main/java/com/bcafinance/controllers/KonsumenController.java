package com.bcafinance.controllers;

import com.bcafinance.dto.KonsumenDTO;
import com.bcafinance.handler.ResourceNotFoundException;
import com.bcafinance.handler.ResponseHandler;
import com.bcafinance.model.Konsumen;
import com.bcafinance.model.MerkMobil;
import com.bcafinance.services.KonsumenService;
import com.bcafinance.services.MerkMobilService;
import com.bcafinance.utils.ConstantMessage;
import com.bcafinance.utils.ImageUtils;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 06/02/2023 - 10:51
Last Modified on 06/02/2023 - 10:51
Version 1.0
*/

@RestController
@RequestMapping("api")
public class KonsumenController {

    @Getter
    private KonsumenService konsumenService;

    public KonsumenController() {
    }

    @Autowired
    public KonsumenController(KonsumenService konsumenService) {
        this.konsumenService = konsumenService;
    }

    @GetMapping("/konsumen/all")
    public ResponseEntity<Object> findByNohp() throws Exception {

        List<Konsumen> lsMobil = konsumenService.findAll();

        if (lsMobil.size() == 0) {
            throw new ResourceNotFoundException(ConstantMessage.WARNING_DATA_EMPTY);
        } else {

            for (int i = 0; i < lsMobil.size(); i++) {
                lsMobil.get(i).setTampakDashboard(ImageUtils.decompressImage(lsMobil.get(i).getTampakDashboard()));
                lsMobil.get(i).setTampakDepan(ImageUtils.decompressImage(lsMobil.get(i).getTampakDepan()));
                lsMobil.get(i).setTampakBelakang(ImageUtils.decompressImage(lsMobil.get(i).getTampakBelakang()));
                lsMobil.get(i).setTampakKanan(ImageUtils.decompressImage(lsMobil.get(i).getTampakKanan()));
                lsMobil.get(i).setTampakKiri(ImageUtils.decompressImage(lsMobil.get(i).getTampakKiri()));
                lsMobil.get(i).setTampakInterior(ImageUtils.decompressImage(lsMobil.get(i).getTampakInterior()));


            }
        }
        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_FIND_BY, HttpStatus.OK, lsMobil, null, null);
    }

    @PostMapping("/konsumen")
    public ResponseEntity<?>
    saveKonsumen(@RequestParam("tampakdepan") MultipartFile tampakdepan,
                 @RequestParam("tampakbelakang") MultipartFile tampakbelakang) throws Exception {
        konsumenService.uploadImage(tampakdepan, tampakbelakang);
//        if(konsumen==null)throw new ResourceNotFoundException(ConstantMessage.ERROR_NO_CONTENT);
//        konsumenService.addInputKonsumen(konsumen);
        return new ResponseHandler().generateResponse(ConstantMessage.SUCCESS_SAVE, HttpStatus.CREATED, null, null, null);
    }

    @PostMapping("/konsumen/v2")
    public ResponseEntity<?>
    saveKonsumenv2(@ModelAttribute KonsumenDTO bodyKonsumen) throws Exception {
        konsumenService.saveKonsumen(bodyKonsumen);
//        if(konsumen==null)throw new ResourceNotFoundException(ConstantMessage.ERROR_NO_CONTENT);
//        konsumenService.addInputKonsumen(konsumen);
        return new ResponseHandler().generateResponse(ConstantMessage.SUCCESS_SAVE, HttpStatus.CREATED, null, null, null);
    }

}
