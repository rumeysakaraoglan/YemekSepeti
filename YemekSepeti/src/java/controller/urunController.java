/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.urunDao;
import entity.urun;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author karao
 */
@Named(value = "urunController")
@SessionScoped
public class urunController implements Serializable{

    
    private List<urun> urunler;
    private urunDao urunDao;
    private urun urun;
    public urunController() {
    }

    public List<urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<urun> urunler) {
        this.urunler = urunler;
    }

    public urunDao getUrunDao() {
        return urunDao;
    }

    public void setUrunDao(urunDao urunDao) {
        this.urunDao = urunDao;
    }

    public urun getUrun() {
        return urun;
    }

    public void setUrun(urun urun) {
        this.urun = urun;
    }
    
      
    public void update(){
        urunDao.update(this.urun);
        urun = new urun();
    }
    public void delete(urun urun){
       urunDao.delete(urun);
    }
    public void create(){
        urunDao.create(this.urun);
        urun = new urun();
    }
    
    
}
