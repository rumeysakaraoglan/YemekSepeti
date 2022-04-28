/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.stokDao;
import dao.urun_kategoriDao;
import entity.stok;
import entity.urun_kategori;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author karao
 */
@Named(value = "urun_kategoriController")
@SessionScoped
public class urun_kategoriController implements Serializable{
      private List<urun_kategori> urun_kategoriler;
    private urun_kategoriDao urun_kategoriDao;
    private urun_kategori urun_kategori;

   
    public urun_kategoriController() {
    }

    public List<urun_kategori> getUrun_kategoriler() {
        return urun_kategoriler;
    }

    public void setUrun_kategoriler(List<urun_kategori> urun_kategoriler) {
        this.urun_kategoriler = urun_kategoriler;
    }

    public urun_kategoriDao getUrun_kategoriDao() {
        return urun_kategoriDao;
    }

    public void setUrun_kategoriDao(urun_kategoriDao urun_kategoriDao) {
        this.urun_kategoriDao = urun_kategoriDao;
    }

    public urun_kategori getUrun_kategori() {
        return urun_kategori;
    }

    public void setUrun_kategori(urun_kategori urun_kategori) {
        this.urun_kategori = urun_kategori;
    }
    
     public void update(){
        urun_kategoriDao.update(this.urun_kategori);
       urun_kategori= new urun_kategori();
    }
    public void delete(urun_kategori urun_kategori){
       urun_kategoriDao.delete(urun_kategori);
    }
    public void create(){
      urun_kategoriDao.create(this.urun_kategori);
      urun_kategori = new urun_kategori();
    }
}
