package org.example2.objets;

import org.example2.bouton.Bouton;
import org.example2.bouton.BoutonTablette;
import org.example2.categorie.ObjetConnecte;

public class Tablette extends ObjetConnecte {
    public Tablette(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public Bouton createBouton() {
        return new BoutonTablette();
    }
}
