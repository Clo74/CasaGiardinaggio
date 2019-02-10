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
public class Decespugliatore extends Macchinario{
    public enum Accensione {
        ELETTRONICA,MECCANICA
    }
    private final Accensione tipoAcc;

    public Decespugliatore(Accensione tipoAcc, int nrOrdine, String marca) {
        super(nrOrdine, marca);
        this.tipoAcc = tipoAcc;
    }

    public Accensione getTipoAcc() {
        return tipoAcc;
    }
    
}
