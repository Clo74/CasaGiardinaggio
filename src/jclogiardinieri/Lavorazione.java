/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclogiardinieri;


/**
 *
 * @author Claudia
 */
public class Lavorazione {
    private final String decrizione;
    private final double costoLav;

    public Lavorazione( String decrizione, double costoLav) {
        this.decrizione = decrizione;
        this.costoLav = costoLav;
    }


    public String getDecrizione() {
        return decrizione;
    }

    public double getCostoLav() {
        return costoLav;
    }
    
    
        
}
