package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.Medecin;
import com.rdvmedecin.rdvmedecinentities.Patient;
import com.rdvmedecin.rdvmedecinentities.Ville;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-07T21:37:26")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile SingularAttribute<Personne, Date> dateNaissance;
    public static volatile SingularAttribute<Personne, Integer> numeroSecu;
    public static volatile CollectionAttribute<Personne, Medecin> medecinCollection;
    public static volatile SingularAttribute<Personne, String> adresse;
    public static volatile SingularAttribute<Personne, String> telephonePortable;
    public static volatile SingularAttribute<Personne, Ville> villeIdville;
    public static volatile SingularAttribute<Personne, String> telephoneFixe;
    public static volatile CollectionAttribute<Personne, Patient> patientCollection;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile SingularAttribute<Personne, String> email;

}