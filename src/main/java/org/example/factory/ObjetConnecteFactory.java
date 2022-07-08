package org.example.factory;

import org.example.categorie.ObjetConnecte;
import org.example.objets.EnceinteConnectee;
import org.example.objets.Tablette;
import org.example.objets.TelephonePortable;
import org.example.types.TypeObjet;

public class ObjetConnecteFactory {

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
