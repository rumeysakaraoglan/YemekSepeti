/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.stokDao;
import dao.urun_musteriDao;
import entity.stok;
import entity.urun_musteri;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named(value = "urun_musteriController")
@SessionScoped
public class urun_musteriController implements Serializable {

     private List<urun_musteri> urun_musteriler;
    private urun_musteriDao urun_musteriDao;
    private urun_musteri urun_musteri;
    
    public urun_musteriController() {
    }

    public List<urun_musteri> getUrun_musteriler() {
        return urun_musteriler;
    }

    public void setUrun_musteriler(List<urun_musteri> urun_musteriler) {
        this.urun_musteriler = urun_musteriler;
    }

    public urun_musteriDao getUrun_musteriDao() {
        return urun_musteriDao;
    }

    public void setUrun_musteriDao(urun_musteriDao urun_musteriDao) {
        this.urun_musteriDao = urun_musteriDao;
    }

    public urun_musteri getUrun_musteri() {
        return urun_musteri;
    }

    public void setUrun_musteri(urun_musteri urun_musteri) {
        this.urun_musteri = urun_musteri;
    }
    public void update(){
        urun_musteriDao.update(this.urun_musteri);
        urun_musteri= new urun_musteri();
    }
    public void delete(urun_musteri urun_musteri){
      urun_musteriDao.delete(urun_musteri);
    }
    public void create(){
       urun_musteriDao.create(this.urun_musteri);
       urun_musteri = new urun_musteri();
    }
}
