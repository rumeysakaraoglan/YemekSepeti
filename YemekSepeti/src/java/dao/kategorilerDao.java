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
        List<kategoriler> list = new ArrayList<>();
       
    
      try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from kategoriler order by kid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new kategoriler(
                    result.getInt(1),
                    result.getString(2),
                    result.getDate(3)
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
     public String delete(kategoriler kategoriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from kategoriler where kid = "+kategoriler.getkategorilerAd();
            

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
            String sorgu = "insert into kategori (kategoriad) values ('"+kategoriler.getkid()+"')";
            

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
            String sorgu = "update kategoriler set kategoriAd = '"+kategoriler.getkategoriAd()+"' where kid = '"+kategoriler.getkid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }

}
