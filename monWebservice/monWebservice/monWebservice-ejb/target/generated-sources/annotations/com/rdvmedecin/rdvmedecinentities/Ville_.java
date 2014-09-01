package com.rdvmedecin.rdvmedecinentities;

import com.rdvmedecin.rdvmedecinentities.CabinetMedical;
import com.rdvmedecin.rdvmedecinentities.Personne;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-01T23:22:16")
@StaticMetamodel(Ville.class)
public class Ville_ { 

    public static volatile SingularAttribute<Ville, String> villeDepartement;
    public static volatile SingularAttribute<Ville, String> villeNomReel;
    public static volatile SingularAttribute<Ville, Integer> villeZmin;
    public static volatile SingularAttribute<Ville, Integer> villeDensite2010;
    public static volatile SingularAttribute<Ville, String> villeCodeCommune;
    public static volatile SingularAttribute<Ville, Integer> villeZmax;
    public static volatile SingularAttribute<Ville, String> villeCommune;
    public static volatile SingularAttribute<Ville, Short> villeArrondissement;
    public static volatile SingularAttribute<Ville, Integer> idville;
    public static volatile SingularAttribute<Ville, String> villeSlug;
    public static volatile CollectionAttribute<Ville, CabinetMedical> cabinetMedicalCollection;
    public static volatile SingularAttribute<Ville, Float> villeSurface;
    public static volatile SingularAttribute<Ville, String> villeCodePostal;
    public static volatile SingularAttribute<Ville, Float> villeLatitudeDeg;
    public static volatile CollectionAttribute<Ville, Personne> personneCollection;
    public static volatile SingularAttribute<Ville, Short> villeAmdi;
    public static volatile SingularAttribute<Ville, String> villeNomSoundex;
    public static volatile SingularAttribute<Ville, String> villeLatitudeDms;
    public static volatile SingularAttribute<Ville, Integer> villePopulation1999;
    public static volatile SingularAttribute<Ville, String> villeCanton;
    public static volatile SingularAttribute<Ville, String> villeLongitudeGrd;
    public static volatile SingularAttribute<Ville, String> villeNomSimple;
    public static volatile SingularAttribute<Ville, String> villeNomMetaphone;
    public static volatile SingularAttribute<Ville, Integer> villePopulation2012;
    public static volatile SingularAttribute<Ville, String> villeLatitudeGrd;
    public static volatile SingularAttribute<Ville, Integer> villePopulation2010;
    public static volatile SingularAttribute<Ville, String> villeLongitudeDms;
    public static volatile SingularAttribute<Ville, Float> villeLongitudeDeg;
    public static volatile SingularAttribute<Ville, String> villeNom;

}