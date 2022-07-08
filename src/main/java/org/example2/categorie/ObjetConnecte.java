package org.example2.categorie;

import org.example2.bouton.Bouton;

public abstract class ObjetConnecte {

    private Integer limiteVolts;

    public ObjetConnecte(Integer limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    public abstract Bouton createBouton();
}
