package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.Medecin;
import com.rdvmedecin.rdvmedecinentities.Ville;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-07T21:37:26")
@StaticMetamodel(CabinetMedical.class)
public class CabinetMedical_ { 

    public static volatile SingularAttribute<CabinetMedical, Integer> idcabinetMedical;
    public static volatile SingularAttribute<CabinetMedical, String> nomCabinet;
    public static volatile SingularAttribute<CabinetMedical, String> telephoneCabinet;
    public static volatile SingularAttribute<CabinetMedical, String> adresseCabinet;
    public static volatile CollectionAttribute<CabinetMedical, Medecin> medecinCollection;
    public static volatile SingularAttribute<CabinetMedical, String> cerfa;
    public static volatile SingularAttribute<CabinetMedical, Ville> villeIdville;

}