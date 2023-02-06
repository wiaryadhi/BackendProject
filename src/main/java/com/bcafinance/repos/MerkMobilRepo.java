package com.bcafinance.repos;
/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 03/02/2023 - 14:31
Last Modified on 03/02/2023 - 14:31
Version 1.0
*/

import com.bcafinance.model.MerkMobil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerkMobilRepo extends JpaRepository<MerkMobil,Long> {

    Optional<MerkMobil> findByMerk(String merk);

}
