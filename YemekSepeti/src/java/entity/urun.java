/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author karao
 */
public class urun {

    public static String getsid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getmid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getkid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int urunid;
    private int kategoriid;
    private String urunadi;
    private int fiyat;
    private Date guncellemeTarihi;

    public urun(int urunid, int kategoriid, String urunadi, int fiyat, Date guncellemeTarihi) {
        this.urunid = urunid;
        this.kategoriid = kategoriid;
        this.urunadi = urunadi;
        this.fiyat = fiyat;
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public urun() {
    }

    public int getUrunid() {
        return urunid;
    }

    public void setUrunid(int urunid) {
        this.urunid = urunid;
    }

    public int getKategoriid() {
        return kategoriid;
    }

    public void setKategoriid(int kategoriid) {
        this.kategoriid = kategoriid;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

  
    }
    
    
    
    
    