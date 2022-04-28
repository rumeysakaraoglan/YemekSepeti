/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.stok;
import entity.urun;
import entity.urun_kategori;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karao
 */
public class urun_kategoriDao {
     public List<urun_kategori> list(){
        List<urun_kategori> list = new ArrayList<>();

     
      try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from urun_kategori order by kid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new urun_kategori(
                    result.getInt(1),
                    result.getInt(2)
                   
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
     public String delete(urun_kategori urun_kategori){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from urun_kategori where kid = "+urun_kategori.getkid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
        
     public String create(urun_kategori urun_kategori){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into urun_kategori(kid) values ('"+urun_kategori.getkid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }

    private Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //..Güncelleme Fonksiyonu 
    public String update(urun_kategori urun_kategori){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update urun_kategori set kid = '"+urun_kategori.getkid()+"' where kid = '"+urun_kategori.getkid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }

   // public void update(urun_kategori urun_kategori) {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }
}
