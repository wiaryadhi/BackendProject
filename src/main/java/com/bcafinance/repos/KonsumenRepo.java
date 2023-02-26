package com.bcafinance.repos;
/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 06/02/2023 - 10:39
Last Modified on 06/02/2023 - 10:39
Version 1.0
*/

import com.bcafinance.model.Konsumen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KonsumenRepo extends JpaRepository<Konsumen,Long> {

    Optional<Konsumen> findByNohp(String nohp);

}
