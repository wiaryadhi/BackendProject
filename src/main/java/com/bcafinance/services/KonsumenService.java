package com.bcafinance.services;
/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 06/02/2023 - 10:49
Last Modified on 06/02/2023 - 10:49
Version 1.0
*/

import com.bcafinance.dto.KonsumenDTO;
import com.bcafinance.model.Konsumen;
import com.bcafinance.model.MerkMobil;
import com.bcafinance.repos.KonsumenRepo;
import com.bcafinance.repos.MerkMobilRepo;
import com.bcafinance.utils.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class KonsumenService {

    private KonsumenRepo konsumenRepo;

    @Autowired
    public KonsumenService(KonsumenRepo konsumenRepo) {
        this.konsumenRepo = konsumenRepo;
    }

    public List<Konsumen> findAll() {
        return konsumenRepo.findAll();
    }

    public void addInputKonsumen(Konsumen konsumen) throws Exception {
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        konsumen.setCreatedDate(date);
        konsumenRepo.save(konsumen);
    }

    public String uploadImage(MultipartFile tampakdepan, MultipartFile tampakbelakang) throws Exception {
//        Konsumen konsumen = new Konsumen();
//        konsumen.setIsActive(false);
        Konsumen imageData = konsumenRepo.save(Konsumen.builder()
                .tampakDashboard(ImageUtils.compressImage(tampakdepan.getBytes()))
                .tampakBelakang(ImageUtils.compressImage(tampakbelakang.getBytes()))
                .isActive(false)
                .alamatLengkap("jimbaran bali ")
                .build());

        if (imageData != null) {
            return "file uploaded successfully : " + tampakdepan.getOriginalFilename();
        }
        return null;
    }

    public void saveKonsumen(KonsumenDTO dataKonsumen) throws IOException {
        Konsumen konsumen = new Konsumen();
        konsumenRepo.save(konsumen.builder()

                .merk(dataKonsumen.getMerk())
                .model(dataKonsumen.getModel())
                .alamatLengkap(dataKonsumen.getAlamatLengkap())
                .deskripsi(dataKonsumen.getDeskripsi())
                .email(dataKonsumen.getEmail())
                .isTrade(dataKonsumen.getIsTrade())
                .kecamatan(dataKonsumen.getKecamatan())
                .kilometer(dataKonsumen.getKilometer())
                .kota(dataKonsumen.getKota())
                .noPol(dataKonsumen.getNoPol())
                .nohp(dataKonsumen.getNohp())
                .provinsi(dataKonsumen.getProvinsi())
                .stnk(dataKonsumen.getStnk())
                .tahun(dataKonsumen.getTahun())
                .tampakDepan(ImageUtils.compressImage(dataKonsumen.getTampakDepan().getBytes()))
                .tampakDashboard(ImageUtils.compressImage(dataKonsumen.getTampakDashboard().getBytes()))
                .tampakBelakang(ImageUtils.compressImage(dataKonsumen.getTampakBelakang().getBytes()))
                .tampakInterior(ImageUtils.compressImage(dataKonsumen.getTampakInterior().getBytes()))
                .tampakKiri(ImageUtils.compressImage(dataKonsumen.getTampakKiri().getBytes()))
                .tampakKanan(ImageUtils.compressImage(dataKonsumen.getTampakKanan().getBytes()))


                .transmisi(dataKonsumen.getTransmisi())
                .warna(dataKonsumen.getWarna())
                .bidDate(dataKonsumen.getBidDate())
                .hargaKonsumen((dataKonsumen.getHargaKonsumen()))
                .isActive(false)
                .createdDate(new Date())
                .build());
    }

}
