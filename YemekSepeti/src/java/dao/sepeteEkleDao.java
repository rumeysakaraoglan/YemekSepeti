/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.sepeteEkle;
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
public class sepeteEkleDao extends DbConnection {
     public List<sepeteEkle> list(){
        List<sepeteEkle> list = new ArrayList<>();
       

     
      //Bağlantı kontrolu
        try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from sepeteEkle order by mid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new sepeteEkle(
                    result.getInt(1),
                    result.getInt(2),
                    result.getDate(3)
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
 //Silme Fonksiyonu
    public String delete(sepeteEkle sepeteEkle){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from sepeteEkle where sepetid = "+sepeteEkle.getSepetid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
  //..Oluşturma Fonksiyonu 
    public String create(sepeteEkle sepeteEkle){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into sepeteEkle (sepetidi) values ('"+sepeteEkle.getSepetid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
    //..Güncelleme Fonksiyonu 
    public String update(sepeteEkle sepeteEkle){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update urun set sepetid = '"+sepeteEkle.getSepetid()+"' where sepetid = '"+sepeteEkle.getSepetid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    }
