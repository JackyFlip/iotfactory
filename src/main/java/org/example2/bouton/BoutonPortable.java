package org.example2.bouton;

public class BoutonPortable implements Bouton{

    private Boolean state;

    public BoutonPortable() {
        state = false;
    }

    @Override
    public void toggle() {
        state = !state;
        System.out.println(state ? "Bouton portable pressé" : "Bouton portable relâché");
    }
}
