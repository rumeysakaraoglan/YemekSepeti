/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
public class urunDao extends DbConnection {

     
    //Listeleme Fonskiyonu
        public List<urun> list(){
        List<urun> list = new ArrayList<>();
       
        
        //Bağlantı kontrolu
        try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from album order by albumid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new urun(
                    result.getInt(1),
                    result.getInt(2),
                    result.getString(3),
                    result.getInt(4),
                    result.getDate(5)
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
    
    //Silme Fonksiyonu
    public String delete(urun urun){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from urun where urunid = "+urun.getUrunadi();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    //..Oluşturma Fonksiyonu 
    public String create(urun urun){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into album (albumadi) values ('"+urun.getUrunadi()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
    //..Güncelleme Fonksiyonu 
    public String update(urun urun){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update urun set UrunAdi = '"+urun.getUrunadi()+"' where urunid = '"+urun.getUrunid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
}
