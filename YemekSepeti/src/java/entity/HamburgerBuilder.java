/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import entity.Hamburger.Ekmek;
import entity.Hamburger.Et;
import entity.Hamburger.Soslu;

/**
 *
 * @author karao
 */
public class HamburgerBuilder {
   
        private Ekmek ekmek;
        private Soslu soslu;
        private Et et;

    public HamburgerBuilder(Ekmek ekmek) {
        this.ekmek = ekmek;
    }

    public HamburgerBuilder(Soslu soslu, Et et) {
        this.soslu = soslu;
        this.et = et;
    }
    public Hamburger Build(){
        return new Hamburger(ekmek, soslu, et);
     }
    
    
}

