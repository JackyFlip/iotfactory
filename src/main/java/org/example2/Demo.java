package org.example2;

import org.example2.factory.ObjectConnecteFactory;
import org.example2.type.TypeObjet;
import org.example2.categorie.ObjetConnecte;

public class Demo {
    public static void main(String[] args) {
        ObjetConnecte objPortale = ObjectConnecteFactory.getObjetConnecte(TypeObjet.PORTABLE);
        ObjetConnecte objTablette = ObjectConnecteFactory.getObjetConnecte(TypeObjet.TABLETTE);
        ObjetConnecte objEnceinte = ObjectConnecteFactory.getObjetConnecte(TypeObjet.ENCEINTE);

        System.out.println(objPortale.getClass());
        System.out.println(objTablette.getClass());
        System.out.println(objEnceinte.getClass());
    }
}
