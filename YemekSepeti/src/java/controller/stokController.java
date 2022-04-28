/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.stokDao;
import entity.stok;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import jakarta.inject.Named;
import java.util.List;

@Named(value = "stokController")
@SessionScoped
public class stokController implements Serializable {
     private List<stok> stoklar;
    private stokDao stokDao;
    private stok stok;
    public stokController() {
    }

    public List<stok> getStoklar() {
        return stoklar;
    }

    public void setStoklar(List<stok> stoklar) {
        this.stoklar = stoklar;
    }

    public stokDao getStokDao() {
        return stokDao;
    }

    public void setStokDao(stokDao stokDao) {
        this.stokDao = stokDao;
    }

    public stok getStok() {
        return stok;
    }

    public void setStok(stok stok) {
        this.stok = stok;
    }
       
    public void update(){
        stokDao.update(this.stok);
        stok= new stok();
    }
    public void delete(stok stok){
       stokDao.delete(stok);
    }
    public void create(){
       stokDao.create(this.stok);
       stok = new stok();
    }
    
}
