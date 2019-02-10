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
public class Motozappa extends Macchinario{
    
    private final int nrRuote;

    public Motozappa(int nrOrdine, String marca, int nrRuote) {
        super(nrOrdine, marca);
        this.nrRuote = nrRuote;
        
    }

    public int getNrRuote() {
        return nrRuote;
    }
    
    
}
