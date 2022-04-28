/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.musterilerDao;
import entity.musteriler;
import entity.stok;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named(value = "musteriController")
@SessionScoped
public class musterilerController implements Serializable {
       private List<musteriler> musteri;
       private musterilerDao musterilerDao;
        private musteriler musteriler;
    public musterilerController() {
    }

    public List<musteriler> getMusteri() {
        return musteri;
    }

    public void setMusteri(List<musteriler> musteri) {
        this.musteri = musteri;
    }

    public musterilerDao getMusterilerDao() {
        return musterilerDao;
    }

    public void setMusterilerDao(musterilerDao musterilerDao) {
        this.musterilerDao = musterilerDao;
    }

    public musteriler getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(musteriler musteriler) {
        this.musteriler = musteriler;
    }
   

     
    public void update(){
        musterilerDao.update(this.musteriler);
        musteriler= new musteriler();
    }
    public void delete(musteriler musteriler){
       musterilerDao.delete(musteriler);
    }
    public void create(){
       musterilerDao.create(this.musteriler);
       musteriler = new musteriler();
    }
 
}
