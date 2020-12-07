/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author jleroy
 */
public class Rotation extends Effets {

    public Rotation(int nbRepetition, Bandeau bandeau) {
        super(nbRepetition, bandeau);
    }
    
    @Override
    public void jouerEffet() {
        String message = bandeau.getMessage();
    for (int j=0;j<nbRepetition;j++){
        for (double i = 0; i <= 2*Math.PI; i+=0.1) {
            bandeau.setMessage(message);
            bandeau.setRotation(i);
            bandeau.sleep(10);
        }
    }
        bandeau.setRotation(0);
    }

}
