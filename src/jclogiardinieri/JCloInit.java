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
public class JCloInit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo un' officina da 10 posti
        Officina off1 = new Officina(10);

        //creo una motozappa con due lavori
        Motozappa motoz1 = new Motozappa(1, "Honda", 2);
        Lavorazione lav = new Lavorazione("Cambio filtro", 10);
        motoz1.insLavoro(lav);
        lav = new Lavorazione("Cambio olio", 15);
        motoz1.insLavoro(lav);

        //creo un decespugliatore con 2 lavori
        Decespugliatore dece1 = new Decespugliatore((Decespugliatore.Accensione.MECCANICA), 2, "YAMAHA");

        lav = new Lavorazione("Cambio catena", 50);
        dece1.insLavoro(lav);
        lav = new Lavorazione("Cambio accensione", 35.5);
        dece1.insLavoro(lav);

        //creo un rasaerba con due lavori
        Rasaerba rasa1 = new Rasaerba(3, "SUZUKI", 4);
        lav = new Lavorazione("Affilatura lame", 10.25);
        rasa1.insLavoro(lav);
        lav = new Lavorazione("Pulizia", 20);
        rasa1.insLavoro(lav);

        System.out.println(motoz1.toString());
        System.out.println(dece1.toString());
        System.out.println(rasa1.toString());

        off1.vaiInRiparazione(motoz1);
        off1.vaiInRiparazione(dece1);
        off1.vaiInRiparazione(rasa1);

        System.out.println(off1.toString());

    }
}