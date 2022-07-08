package org.example2.objets;

import org.example2.bouton.Bouton;
import org.example2.bouton.BoutonEnceinte;
import org.example2.categorie.ObjetConnecte;

public class EnceinteConnectee extends ObjetConnecte {
    public EnceinteConnectee(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public Bouton createBouton() {
        return new BoutonEnceinte();
    }
}
