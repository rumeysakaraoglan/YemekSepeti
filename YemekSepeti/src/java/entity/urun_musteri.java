/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

public class urun_musteri {

    public static String getspid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private int spid;
    private int takipNo;
    private int tutar;
    private Date tarih;

    public urun_musteri(int spid, int takipNo, int tutar, Date tarih) {
        this.spid = spid;
        this.takipNo = takipNo;
        this.tutar = tutar;
        this.tarih = tarih;
    }

    public urun_musteri() {
    }

    public urun_musteri(int aInt, int aInt0, int aInt1, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public int getTakipNo() {
        return takipNo;
    }

    public void setTakipNo(int takipNo) {
        this.takipNo = takipNo;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
    
    
}
