package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.Crenaux;
import com.rdvmedecin.rdvmedecinentities.Medecin;
import com.rdvmedecin.rdvmedecinentities.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-01T23:22:16")
@StaticMetamodel(Rdv.class)
public class Rdv_ { 

    public static volatile SingularAttribute<Rdv, Patient> idpatient;
    public static volatile SingularAttribute<Rdv, Medecin> idMedecin;
    public static volatile SingularAttribute<Rdv, Crenaux> idcrenaux;
    public static volatile SingularAttribute<Rdv, Integer> idrdv;

}