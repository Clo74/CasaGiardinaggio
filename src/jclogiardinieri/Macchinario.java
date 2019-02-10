/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclogiardinieri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudia
 */
public class Macchinario {
    private final int nrOrdine;
    private final String marca;
    private double costo;
    private final List<Lavorazione> elLavori = new ArrayList<>();
    //private final List<Double> elLavori = new ArrayList<>();

    public Macchinario(int nrOrdine, String marca) {
        this.nrOrdine = nrOrdine;
        this.marca = marca;
    }
    //aggiunge una lavorazione al macchinario che incrementa il costo totale
    //devo passare il lavoro 
    public void insLavoro( Lavorazione lavoro){
       //private Lavorazione lavoro = new Lavorazione(desc, dblCosto);
      elLavori.add(0, lavoro);
      //elLavori.add(0,dblCosto);
      costo += lavoro.getCostoLav();
    }

    public int getNrOrdine() {
        return nrOrdine;
    }

    public String getMarca() {
        return marca;
    }

    public double getCosto() {
        return costo;
    }

    public List<Lavorazione> getElLavori() {
        return elLavori;
    }
    
    
    @Override
    public String toString() {
       StringBuilder  sb = new StringBuilder();
        
        sb.append("Nr Ordine: ").append(this.nrOrdine).append(" Marca: ")
                .append(this.marca).append(" Costo totale riparazione: ").append(this.costo).append("\n");
        for (int i = 0; i < elLavori.size(); i++) {
            Lavorazione lav = elLavori.get(i);
            sb.append("---Lavoro: ").append(lav.getDecrizione()).append("Costo: ").append(lav.getCostoLav())
                    .append("\n");
            
        }
       return sb.toString();
      }
}
