package com.bcafinance.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
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

    @Column(name = "MasaBerlakuSTNK", length = 50)
    private String stnk;

    @Column(name = "Deskripsi")
    private String deskripsi;

    @Lob
    @Column(name = "TampakDepan")
    private byte[] tampakDepan;

    @Lob
    @Column(name = "TampakBelakang")
    private byte[] tampakBelakang;

    @Lob
    @Column(name = "TampakKanan")
    private byte[] tampakKanan;

    @Lob
    @Column(name = "TampakKiri")
    private byte[] tampakKiri;

    @Lob
    @Column(name = "TampakInterior")
    private byte[] tampakInterior;

    @Lob
    @Column(name = "TampakDashboard")
    private byte[] tampakDashboard;

    @Column(name = "Email", length = 50)
    private String email;

    @Column(name = "Handphone")
    private String nohp;

    @Column(name = "Provinsi", length = 50)
    private String provinsi;

    @Column(name = "Kota", length = 50)
    private String kota;

    @Column(name = "Kecamatan", length = 50)
    private String kecamatan;

    @Column(name = "AlamatLengkap", length = 50)
    private String alamatLengkap;

    @Column(name = "IsTrade", length = 50)
    private String isTrade;

    @Column(name = "IsActive")
    private Boolean isActive;

    @Column(name = "BidDate")
    private String bidDate;

    @Column(name = "HargaKonsumen")
    private String hargaKonsumen;

    @Column(name = "CreatedDate")
    private Date createdDate = new Date();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getMerk() {
//        return merk;
//    }
//
//    public void setMerk(String merk) {
//        this.merk = merk;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Integer getTahun() {
//        return tahun;
//    }
//
//    public void setTahun(Integer tahun) {
//        this.tahun = tahun;
//    }
//
//    public String getNoPol() {
//        return noPol;
//    }
//
//    public void setNoPol(String noPol) {
//        this.noPol = noPol;
//    }
//
//    public String getWarna() {
//        return warna;
//    }
//
//    public void setWarna(String warna) {
//        this.warna = warna;
//    }
//
//    public String getTransmisi() {
//        return transmisi;
//    }
//
//    public void setTransmisi(String transmisi) {
//        this.transmisi = transmisi;
//    }
//
//    public String getKilometer() {
//        return kilometer;
//    }
//
//    public void setKilometer(String kilometer) {
//        this.kilometer = kilometer;
//    }
//
//    public String getDeskripsi() {
//        return deskripsi;
//    }
//
//    public void setDeskripsi(String deskripsi) {
//        this.deskripsi = deskripsi;
//    }
//
//    public byte[] getTampakDepan() {
//        return tampakDepan;
//    }
//
//    public void setTampakDepan(byte[] tampakDepan) {
//        this.tampakDepan = tampakDepan;
//    }
//
//    public byte[] getTampakBelakang() {
//        return tampakBelakang;
//    }
//
//    public void setTampakBelakang(byte[] tampakBelakang) {
//        this.tampakBelakang = tampakBelakang;
//    }
//
//    public byte[] getTampakKanan() {
//        return tampakKanan;
//    }
//
//    public void setTampakKanan(byte[] tampakKanan) {
//        this.tampakKanan = tampakKanan;
//    }
//
//    public byte[] getTampakKiri() {
//        return tampakKiri;
//    }
//
//    public void setTampakKiri(byte[] tampakKiri) {
//        this.tampakKiri = tampakKiri;
//    }
//
//    public byte[] getTampakInterior() {
//        return tampakInterior;
//    }
//
//    public void setTampakInterior(byte[] tampakInterior) {
//        this.tampakInterior = tampakInterior;
//    }
//
//    public byte[] getTampakDashboard() {
//        return tampakDashboard;
//    }
//
//    public void setTampakDashboard(byte[] tampakDashboard) {
//        this.tampakDashboard = tampakDashboard;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNohp() {
//        return nohp;
//    }
//
//    public void setNohp(String nohp) {
//        this.nohp = nohp;
//    }
//
//    public String getProvinsi() {
//        return provinsi;
//    }
//
//    public void setProvinsi(String provinsi) {
//        this.provinsi = provinsi;
//    }
//
//    public String getKota() {
//        return kota;
//    }
//
//    public void setKota(String kota) {
//        this.kota = kota;
//    }
//
//    public String getKecamatan() {
//        return kecamatan;
//    }
//
//    public void setKecamatan(String kecamatan) {
//        this.kecamatan = kecamatan;
//    }
//
//    public String getAlamatLengkap() {
//        return alamatLengkap;
//    }
//
//    public void setAlamatLengkap(String alamatLengkap) {
//        this.alamatLengkap = alamatLengkap;
//    }
//
//
//    public String getStnk() {
//        return stnk;
//    }
//
//    public void setStnk(String stnk) {
//        this.stnk = stnk;
//    }
//
//    public String getIsTrade() {
//        return isTrade;
//    }
//
//    public void setIsTrade(String isTrade) {
//        this.isTrade = isTrade;
//    }
//
//    public Boolean getActive() {
//        return isActive;
//    }
//
//    public void setActive(Boolean active) {
//        isActive = active;
//    }
//
//    public String getBidDate() {
//        return bidDate;
//    }
//
//    public void setBidDate(String bidDate) {
//        this.bidDate = bidDate;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
}
