package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.Medecin;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-26T02:27:32")
@StaticMetamodel(SpecialiteMed.class)
public class SpecialiteMed_ { 

    public static volatile SingularAttribute<SpecialiteMed, String> libelle;
    public static volatile CollectionAttribute<SpecialiteMed, Medecin> medecinCollection;
    public static volatile SingularAttribute<SpecialiteMed, Integer> idspecialiteMed;

}