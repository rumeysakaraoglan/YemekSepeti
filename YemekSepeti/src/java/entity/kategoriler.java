/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author karao
 */
public class kategoriler {

    private int kid;
    private String kategoriad;
    private Date guncellemeTarihi;

    public kategoriler(int kid, String kategoriad, Date guncellemeTarihi) {
        this.kid = kid;
        this.kategoriad = kategoriad;
        this.guncellemeTarihi = guncellemeTarihi;

    }
    

    public kategoriler() {
        
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getKategoriad() {
        return kategoriad;
    }

    public void setKategoriad(String kategoriad) {
        this.kategoriad = kategoriad;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }


}
