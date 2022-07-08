package org.example;

import org.example.categorie.ObjetConnecte;
import org.example.factory.ObjetConnecteFactory;
import org.example.types.TypeObjet;

public class Main {
    public static void main(String[] args) {

        ObjetConnecte objPortable = ObjetConnecteFactory.getObjetConnecte(TypeObjet.PORTABLE);
        ObjetConnecte objTablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);
        ObjetConnecte objEnceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE);
        ObjetConnecte objMontre = ObjetConnecteFactory.getObjetConnecte(TypeObjet.MONTRE);

        System.out.println(objPortable.getClass());
        System.out.println(objTablette.getClass());
        System.out.println(objEnceinte.getClass());
        System.out.println(objMontre);

    }
}