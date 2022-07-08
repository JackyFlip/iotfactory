package org.example2.factory;

import org.example2.categorie.ObjetConnecte;
import org.example2.objets.EnceinteConnectee;
import org.example2.objets.Tablette;
import org.example2.objets.TelephonePortable;
import org.example2.type.TypeObjet;

public class ObjectConnecteFactory {

    public static ObjetConnecte getObjetConnecte(Enum<TypeObjet> type) {
        if(type.equals(TypeObjet.PORTABLE)) {
            return new TelephonePortable(5);
        } else if (type.equals(TypeObjet.TABLETTE)) {
            return new Tablette(5);
        } else if (type.equals(TypeObjet.ENCEINTE)) {
            return new EnceinteConnectee(12);
        }
        return null;
    }

}
