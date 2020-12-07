/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author jleroy
 */
public class Main {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new Main().exemple();
    }

    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Je veux une bonne note");
        Scenario monScenario = new Scenario();

        Clignotant cl = new Clignotant(5, monBandeau);
        Rotation rt = new Rotation(5, monBandeau);
        Zoom zm = new Zoom(10, monBandeau);
        Changement_fond cf = new Changement_fond(5, monBandeau);

        monScenario.ajouterEffet(cl);
        monScenario.ajouterEffet(rt);
        monScenario.ajouterEffet(zm);
        monScenario.ajouterEffet(cf);

        monScenario.jouerScenario();

    }

}
