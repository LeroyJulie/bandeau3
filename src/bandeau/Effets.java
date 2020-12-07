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
public abstract class Effets {

    public int nbRepetition;
    public Bandeau bandeau;

    public Effets(int nbRepetition, Bandeau bandeau) {
        this.nbRepetition = nbRepetition;
        this.bandeau = bandeau;
    }

    public abstract void jouerEffet();

    public void setNbRepetition(int NbRepetition) {
        nbRepetition = NbRepetition;

    }

    public int getNbRepetition() {
        return nbRepetition;
    }
}
