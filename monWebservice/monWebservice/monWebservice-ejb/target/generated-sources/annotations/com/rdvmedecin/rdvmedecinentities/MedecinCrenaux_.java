package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.Crenaux;
import com.rdvmedecin.rdvmedecinentities.Medecin;
import com.rdvmedecin.rdvmedecinentities.MedecinCrenauxPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-01T23:22:16")
@StaticMetamodel(MedecinCrenaux.class)
public class MedecinCrenaux_ { 

    public static volatile SingularAttribute<MedecinCrenaux, Integer> pris;
    public static volatile SingularAttribute<MedecinCrenaux, Crenaux> crenaux;
    public static volatile SingularAttribute<MedecinCrenaux, MedecinCrenauxPK> medecinCrenauxPK;
    public static volatile SingularAttribute<MedecinCrenaux, Medecin> medecin;
    public static volatile SingularAttribute<MedecinCrenaux, Integer> disponible;

}