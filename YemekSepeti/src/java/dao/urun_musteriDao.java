/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.stok;
import entity.urun;
import entity.urun_musteri;
import jakarta.jms.Connection;
import jakarta.resource.cci.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DbConnection;

/**
 *
 * @author karao
 */
public class urun_musteriDao extends DbConnection{
     public List<urun_musteri> list(){
        List<urun_musteri> list = new ArrayList<>();
        
         try{
            java.sql.Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from urun_musteri order by spid";
            java.sql.ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new urun_musteri(
                    result.getInt(1),
                    result.getInt(2),
                     result.getInt(3),
                     result.getDate(4)
                   
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
       }
     public String delete(urun_musteri urun_musteri){
        
        try{
            java.sql.Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from urun_musteri where spid = "+urun_musteri.getspid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
        
     public String create(urun_musteri urun_musteri){
        
        try{
            java.sql.Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into urun_musteri (spid) values ('"+urun_musteri.getspid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
      //..Güncelleme Fonksiyonu 
    public String update(urun_musteri urun_musteri){
        
        try{
            java.sql.Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update urun_musteri set spid = '"+urun_musteri.getspid()+"' where spid = '"+urun_musteri.getspid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
}
