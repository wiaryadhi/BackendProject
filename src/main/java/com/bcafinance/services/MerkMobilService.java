package com.bcafinance.services;

import com.bcafinance.model.MerkMobil;
import com.bcafinance.repos.MerkMobilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 03/02/2023 - 14:39
Last Modified on 03/02/2023 - 14:39
Version 1.0
*/
@Service
@Transactional
public class MerkMobilService {

    private MerkMobilRepo merkRepo;

    @Autowired
    public MerkMobilService(MerkMobilRepo merkRepo) {
        this.merkRepo = merkRepo;
    }

    public List<MerkMobil> findAllMerk() {
        return merkRepo.findAll();
    }


}
