/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author karao
 */
public class sepeteEkle {
    private int mid;
    private int sepetid;
    private Date guncellemeTarihi;

    public sepeteEkle(int mid, int sepetid, Date guncellemeTarihi) {
        this.mid = mid;
        this.sepetid = sepetid;
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public sepeteEkle() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getSepetid() {
        return sepetid;
    }

    public void setSepetid(int sepetid) {
        this.sepetid = sepetid;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }
    
    
}
