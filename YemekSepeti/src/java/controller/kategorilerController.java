/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.kategorilerDao;

import entity.kategoriler;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author karao
 */
@Named(value = "kategorilerController")
@SessionScoped
public class kategorilerController implements Serializable{
    private List<kategoriler> kategori;
    private kategorilerDao kategorilerDao;
    private kategoriler kategoriler;

    public List<kategoriler> getKategori() {
        System.out.println("line 28 controller");
        kategorilerDao = new kategorilerDao();
        return kategorilerDao.list();
    }

    public void setKategori(List<kategoriler> kategori) {
        this.kategori = kategori;
    }

    public kategorilerDao getKategorilerDao() {
        return kategorilerDao;
    }

    public void setKategorilerDao(kategorilerDao kategorilerDao) {
        this.kategorilerDao = kategorilerDao;
    }

    public kategoriler getKategoriler() {
        return kategoriler;
    }

    public void setKategoriler(kategoriler kategoriler) {
        this.kategoriler = kategoriler;
    }
    
        
    public void update(){
        kategorilerDao.update(this.kategoriler);
        kategoriler = new kategoriler();
    }
    public void delete(kategoriler kategoriler){
       kategorilerDao.delete(kategoriler);
    }
    public void create(){
       kategorilerDao.create(this.kategoriler);
       kategoriler = new kategoriler();
    }
}
