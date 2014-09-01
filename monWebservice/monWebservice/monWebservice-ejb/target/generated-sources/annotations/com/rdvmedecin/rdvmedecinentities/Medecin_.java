package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.CabinetMedical;
import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Personne;
import com.rdvmedecin.rdvmedecinentities.Rdv;
import com.rdvmedecin.rdvmedecinentities.SpecialiteMed;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-01T23:22:16")
@StaticMetamodel(Medecin.class)
public class Medecin_ { 

    public static volatile SingularAttribute<Medecin, CabinetMedical> idcabinetMedical;
    public static volatile SingularAttribute<Medecin, Integer> idMedecin;
    public static volatile SingularAttribute<Medecin, Personne> numeroSecu;
    public static volatile SingularAttribute<Medecin, SpecialiteMed> idspecialiteMed;
    public static volatile CollectionAttribute<Medecin, MedecinCrenaux> medecinCrenauxCollection;
    public static volatile CollectionAttribute<Medecin, Rdv> rdvCollection;

}