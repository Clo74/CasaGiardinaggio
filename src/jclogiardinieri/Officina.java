/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jclogiardinieri;

/**
 * un officina può riparare al massimo n macchine che devono essere indicate
 * nell'instanza della classe
 */
public class Officina {

    private Macchinario[] elMacchinari;

    public Officina(int nrPosti) {
        elMacchinari = new Macchinario[nrPosti];
    }

    /*
    posto libero mi dice se si può prendere in lavorazione una macchina
    se non ci sono posti liberi restituisce -1
     */
    private int postoLibero() {

        for (int i = 0; i < elMacchinari.length; i++) {
            if (elMacchinari[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void vaiInRiparazione(Macchinario macc) {
        int pos = postoLibero();
        if (pos == -1) {
            throw new RuntimeException("Non ci sono posti in officina");
        }
        elMacchinari[pos] = macc;
    }

    public Macchinario getMacchinario(int NrPosto) {
        return elMacchinari[NrPosto];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Macchinario macchinario : elMacchinari) {
            if (macchinario == null) {
                break;
            } else {
                sb.append("Nr Ordine: ").append(macchinario.getNrOrdine()).append(" Marca: ").append(macchinario.getMarca()).append(" Costo totale riparazione: ").append(macchinario.getCosto()).append("\n");
                for (int j = 0; j < elMacchinari[j].getElLavori().size(); j++) {

                    Lavorazione lav = macchinario.getElLavori().get(j);
                    sb.append("---Lavoro: ").append(lav.getDecrizione()).append("Costo: ").append(lav.getCostoLav())
                            .append("\n");

                }
            }
        }
        return sb.toString();
    }

}
