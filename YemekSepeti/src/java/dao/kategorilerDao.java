/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.kategoriler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DbConnection;

/**
 *
 * @author karao
 */
public class kategorilerDao extends DbConnection {
    
     public List<kategoriler> list(){
         System.out.println("line 22 dao");
        List<kategoriler> list = new ArrayList<>();
       
    
      try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from kategori order by kid";
            System.out.println("testting dao liine 28");
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new kategoriler(
                    result.getInt(1),
                    result.getString(2),
                    result.getDate(3)
            ));
         }
        }catch (Exception e) {
            System.out.println("testing dao");
            System.out.println(e.getMessage());
        }

        return list;
    }
     public String delete(kategoriler kategoriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from kategori where kid = "+kategoriler.getKid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    //..Oluşturma Fonksiyonu 
    public String create(kategoriler kategoriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into kategori (kategoriad) values ('"+kategoriler.getKid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
    //..Güncelleme Fonksiyonu 
    public String update(kategoriler kategoriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update kategori set kategoriAd = '"+kategoriler.getKategoriad()+"' where kid = '"+kategoriler.getKid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }

}
