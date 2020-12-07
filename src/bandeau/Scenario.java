/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jleroy
 */
public class Scenario {

    private List<Effets> effets = new ArrayList<Effets>();

    public void ajouterEffet(Effets effet) {
        effets.add(effet);

    }

    public void jouerScenario() {
        for (Effets e : effets) {
            e.jouerEffet();
        }
    }

}
