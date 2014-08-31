package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Rdv;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-31T09:24:43")
@StaticMetamodel(Crenaux.class)
public class Crenaux_ { 

    public static volatile SingularAttribute<Crenaux, Date> date;
    public static volatile SingularAttribute<Crenaux, Date> heureDebut;
    public static volatile SingularAttribute<Crenaux, Integer> idcrenaux;
    public static volatile CollectionAttribute<Crenaux, MedecinCrenaux> medecinCrenauxCollection;
    public static volatile SingularAttribute<Crenaux, Date> heureFin;
    public static volatile CollectionAttribute<Crenaux, Rdv> rdvCollection;

}