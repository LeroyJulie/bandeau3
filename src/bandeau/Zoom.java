/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author jleroy
 */
public class Zoom extends Effets {

    public Zoom(int nbRepetition, Bandeau bandeau) {
        super(nbRepetition, bandeau);
    }
    Font font = bandeau.getFont();

    @Override
    public void jouerEffet() {
        String message = bandeau.getMessage();
        for (int i = 0; i < 5*nbRepetition; i += 1) {
            bandeau.setMessage(message);
            bandeau.setFont(new Font(message, Font.BOLD, 5 + i));
            bandeau.sleep(50);
        }
        bandeau.setFont(font);
    }

}
