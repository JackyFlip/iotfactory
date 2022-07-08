package org.example2.objets;

import org.example2.bouton.Bouton;
import org.example2.bouton.BoutonPortable;
import org.example2.categorie.ObjetConnecte;

public class TelephonePortable extends ObjetConnecte {
    public TelephonePortable(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public Bouton createBouton() {
        return new BoutonPortable();
    }
}
