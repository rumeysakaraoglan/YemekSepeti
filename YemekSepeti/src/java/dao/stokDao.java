/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
public class stokDao extends DbConnection {
     public List<stok> list(){
        List<stok> list = new ArrayList<>();
        
        try{
            Connection c = this.connect();
            Statement state = c.createStatement();
            String sorgu = "SELECT * from stok order by sid";
            ResultSet  result = state.executeQuery(sorgu);
            while(result.next()){
            list.add(new stok(
                    result.getInt(1),
                    result.getInt(2)
                   
            ));
         }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
     public String delete(stok stok){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sql = "delete from stok where sid = "+stok.getsid();
            

            st.executeUpdate(sql);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
        
     public String create(stok stok){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "insert into stok (sid) values ('"+stok.getsid()+"')";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
    //..Güncelleme Fonksiyonu 
    public String update(stok stok){
        
        try{
            Connection c = this.connect();
            Statement st = c.createStatement();
            String sorgu = "update stok set sid = '"+urun.getsid()+"' where sid = '"+stok.getsid()+"'";
            

            st.executeUpdate(sorgu);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "index";
    }
    
        
}
