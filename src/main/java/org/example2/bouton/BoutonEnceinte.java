package org.example2.bouton;

import java.util.function.Predicate;

public class BoutonEnceinte implements Bouton {

    private Boolean state;

    public BoutonEnceinte() {
        state = false;
    }

    @Override
    public void toggle() {
        state = !state;
        System.out.println(state ? "Bouton enceinte pressé" : "Bouton enceinte relâché");
    }
}
