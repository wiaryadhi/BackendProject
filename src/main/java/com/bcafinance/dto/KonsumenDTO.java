package com.bcafinance.dto;
/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 13/02/2023 - 16:50
Last Modified on 13/02/2023 - 16:50
Version 1.0
*/

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

public class KonsumenDTO {

    private Long id;


    private String merk;

    private String model;

    private Integer tahun;

    private String noPol;

    private String warna;

    private String transmisi;

    private String kilometer;

    private String stnk;

    private String deskripsi;

    private MultipartFile tampakDepan;

    private MultipartFile tampakBelakang;

    private MultipartFile tampakKanan;

    private MultipartFile tampakKiri;

    private MultipartFile tampakInterior;

    private MultipartFile tampakDashboard;

    private String email;

    private String nohp;

    private String provinsi;

    private String kota;

    private String kecamatan;

    private String alamatLengkap;

    private String isTrade;

    private Boolean isActive;

    private String bidDate;
    private String hargaKonsumen;

    private Date createdDate = new Date();

    public Long getId() {
        return id;
    }

    public KonsumenDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public String getNoPol() {
        return noPol;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

    public String getStnk() {
        return stnk;
    }

    public void setStnk(String stnk) {
        this.stnk = stnk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public MultipartFile getTampakDepan() {
        return tampakDepan;
    }

    public void setTampakDepan(MultipartFile tampakDepan) {
        this.tampakDepan = tampakDepan;
    }

    public MultipartFile getTampakBelakang() {
        return tampakBelakang;
    }

    public void setTampakBelakang(MultipartFile tampakBelakang) {
        this.tampakBelakang = tampakBelakang;
    }

    public MultipartFile getTampakKanan() {
        return tampakKanan;
    }

    public void setTampakKanan(MultipartFile tampakKanan) {
        this.tampakKanan = tampakKanan;
    }

    public MultipartFile getTampakKiri() {
        return tampakKiri;
    }

    public void setTampakKiri(MultipartFile tampakKiri) {
        this.tampakKiri = tampakKiri;
    }

    public MultipartFile getTampakInterior() {
        return tampakInterior;
    }

    public void setTampakInterior(MultipartFile tampakInterior) {
        this.tampakInterior = tampakInterior;
    }

    public MultipartFile getTampakDashboard() {
        return tampakDashboard;
    }

    public void setTampakDashboard(MultipartFile tampakDashboard) {
        this.tampakDashboard = tampakDashboard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public String getIsTrade() {
        return isTrade;
    }

    public void setIsTrade(String isTrade) {
        this.isTrade = isTrade;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getHargaKonsumen() {
        return hargaKonsumen;
    }

    public void setHargaKonsumen(String hargaKonsumen) {
        this.hargaKonsumen = hargaKonsumen;
    }
}
