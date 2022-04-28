/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.sepeteEkleDao;
import dao.urunDao;
import entity.sepeteEkle;
import entity.urun;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author karao
 */
@Named(value = "sepeteEkleController")
@SessionScoped
public class sepeteEkleController  implements Serializable{
  
     private List<sepeteEkle> sepeteEklenen;
    private sepeteEkleDao sepeteEkleDao;
    private sepeteEkle sepeteEkle;
    public sepeteEkleController() {
    }

    public List<sepeteEkle> getSepeteEklenen() {
        return sepeteEklenen;
    }

    public void setSepeteEklenen(List<sepeteEkle> sepeteEklenen) {
        this.sepeteEklenen = sepeteEklenen;
    }

    public sepeteEkleDao getSepeteEkleDao() {
        return sepeteEkleDao;
    }

    public void setSepeteEkleDao(sepeteEkleDao sepeteEkleDao) {
        this.sepeteEkleDao = sepeteEkleDao;
    }

    public sepeteEkle getSepeteEkle() {
        return sepeteEkle;
    }

    public void setSepeteEkle(sepeteEkle sepeteEkle) {
        this.sepeteEkle = sepeteEkle;
    }
     public void update(){
       sepeteEkleDao.update(this.sepeteEkle);
        sepeteEkle = new sepeteEkle();
    }
    public void delete(sepeteEkle sepeteEkle){
       sepeteEkleDao.delete(sepeteEkle);
    }
    public void create(){
       sepeteEkleDao.create(this.sepeteEkle);
       sepeteEkle = new sepeteEkle();
    }
    
}
