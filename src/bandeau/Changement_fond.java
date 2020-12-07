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
public class Changement_fond extends Effets {

    public Changement_fond(int nbRepetition, Bandeau bandeau) {
        super(nbRepetition, bandeau);
    }

    @Override
    public void jouerEffet() {
        String message = bandeau.getMessage();

        for (int i = 0; i < nbRepetition; i++) {
            bandeau.setBackground(Color.blue);
            bandeau.sleep(250);
            bandeau.setBackground(Color.white);
            bandeau.sleep(250);
            bandeau.setBackground(Color.red);
            bandeau.sleep(250);

        }
        bandeau.setBackground(Color.white);
    }

}
