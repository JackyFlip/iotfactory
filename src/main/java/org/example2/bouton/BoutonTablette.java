package org.example2.bouton;

public class BoutonTablette implements Bouton {

    private Boolean state;

    public BoutonTablette() {
        state = false;
    }

    @Override
    public void toggle() {
        state = !state;
        System.out.println(state ? "Bouton tablette pressé" : "Bouton tablette relâché");
    }
}
