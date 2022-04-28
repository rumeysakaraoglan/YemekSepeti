/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.musteriler;
import entity.stok;
import entity.urun;
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
public class musterilerDao extends DbConnection {
     public List<musteriler> list(){
        List<musteriler> list = new ArrayList<>();
        
        
           try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from musteriler order by mid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new musteriler(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getInt(4),
                    result.getString(5)
                   
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
      public String delete(musteriler musteriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from musteriler where mid = "+musteriler.getmid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
        
     public String create(musteriler musteriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into musteriler (ad) values ('"+musteriler.getmid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
      //..Güncelleme Fonksiyonu 
    public String update(musteriler musteriler){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update musteriler set mid = '"+urun.getmid()+"' where mid = '"+musteriler.getmid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
    
}
