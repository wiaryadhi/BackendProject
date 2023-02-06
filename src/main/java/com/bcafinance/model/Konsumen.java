package com.bcafinance.model;

import javax.persistence.*;

/*
@Author wiary a.k.a. Arya
ITDP 7
---------------------------------------
| Created with:IntelliJ IDEA          |
| Version: 2022.2.3 (Ultimate Edition)|
| Build id: #IU-222.4345.14           |
---------------------------------------
Created on 03/02/2023 - 10:45
Last Modified on 03/02/2023 - 10:45
Version 1.0
*/
@Entity
@Table(name = "InputKonsumen")
public class Konsumen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "Merk", length = 25)
    private String merk;

    @Column(name = "Model", length = 25)
    private String model;

    @Column(name = "Tahun", length = 25)
    private Integer tahun;

    @Column(name = "NoPol", length = 50)
    private String noPol;

    @Column(name = "Warna", length = 50)
    private String warna;

    @Column(name = "Transmisi", length = 50)
    private String transmisi;

    @Column(name = "Kilometer", length = 50)
    private String kilometer;

    @Column(name = "Deskripsi", length = 50)
    private String deskripsi;

    @Lob
    @Column(name = "TampakDepan")
    private String tampakDepan;

    @Lob
    @Column(name = "TampakBelakang")
    private String tampakBelakang;

    @Lob
    @Column(name = "TampakKanan")
    private String tampakKanan;

    @Lob
    @Column(name = "TampakKiri")
    private String tampakKiri;

    @Lob
    @Column(name = "TampakInterior")
    private String tampakInterior;

    @Lob
    @Column(name = "TampakDashboard")
    private String tampakDashboard;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Provinsi", length = 50)
    private String provinsi;

    @Column(name = "Kota", length = 50)
    private String kota;

    @Column(name = "Kecamatan", length = 50)
    private String kecamatan;

    @Column(name = "AlamatLengkap", length = 50)
    private String alamatLengkap;

    @Column(name = "IsTrade")
    private Boolean isTrade;

    public Long getId() {
        return id;
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

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTampakDepan() {
        return tampakDepan;
    }

    public void setTampakDepan(String tampakDepan) {
        this.tampakDepan = tampakDepan;
    }

    public String getTampakBelakang() {
        return tampakBelakang;
    }

    public void setTampakBelakang(String tampakBelakang) {
        this.tampakBelakang = tampakBelakang;
    }

    public String getTampakKanan() {
        return tampakKanan;
    }

    public void setTampakKanan(String tampakKanan) {
        this.tampakKanan = tampakKanan;
    }

    public String getTampakKiri() {
        return tampakKiri;
    }

    public void setTampakKiri(String tampakKiri) {
        this.tampakKiri = tampakKiri;
    }

    public String getTampakInterior() {
        return tampakInterior;
    }

    public void setTampakInterior(String tampakInterior) {
        this.tampakInterior = tampakInterior;
    }

    public String getTampakDashboard() {
        return tampakDashboard;
    }

    public void setTampakDashboard(String tampakDashboard) {
        this.tampakDashboard = tampakDashboard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Boolean getTrade() {
        return isTrade;
    }

    public void setTrade(Boolean trade) {
        isTrade = trade;
    }
}
