/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author jleroy
 */
public class Clignotant extends Effets {

    public Clignotant(int nbRepetition, Bandeau bandeau) {
        super(nbRepetition, bandeau);
    }

    @Override
    public void jouerEffet() {
        String message=bandeau.getMessage();
        for (int i = 0; i < getNbRepetition(); i++) {
            bandeau.setMessage("");
            bandeau.sleep(100);
            bandeau.setMessage(message);
            bandeau.sleep(250);
            
        }
       

    }

}
