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
public class Hamburger extends urun{
        public Ekmek ekmek;
        public Soslu soslu;
        public Et et;

    public Hamburger(Ekmek ekmek, Soslu soslu, Et et, int urunid, int kategoriid, String urunadi, int fiyat, Date guncellemeTarihi) {
        super(urunid, kategoriid, urunadi, fiyat, guncellemeTarihi);
        this.ekmek = ekmek;
        this.soslu = soslu;
        this.et = et;
    }

    Hamburger(Ekmek ekmek, Soslu soslu, Et et) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public enum Et{
        Tavuk,
        Biftek,
        
    }

    public enum Ekmek{
        Kepekli,
        Normal
    }

    public enum Soslu{
        Ketçap,
        Mayonez
    }
   
    }
    
       


