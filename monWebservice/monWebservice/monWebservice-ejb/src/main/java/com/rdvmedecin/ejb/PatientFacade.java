/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.ejb;

import com.rdvmedecin.rdvmedecinentities.CabinetMedical;
import com.rdvmedecin.rdvmedecinentities.Medecin;
import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Patient;
import com.rdvmedecin.rdvmedecinentities.Personne;
import com.rdvmedecin.rdvmedecinentities.SpecialiteMed;
import com.rdvmedecin.rdvmedecinentities.Ville;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author fridel
 */
@Stateless
public class PatientFacade extends AbstractFacade<Patient> implements PatientFacadeLocal 
{
    @PersistenceContext(unitName = "com.rdvmedecin_monWebservice-ejb_ejb_1.2-SNAPSHOTPU")
    private EntityManager em;
    
    private Personne personne;
    private Patient patient;
    private Ville ville;
    private Medecin medecin;
    private CabinetMedical cabinetMed;
    private SpecialiteMed spec=null;
    //private VilleJpaController villeController=null;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PatientFacade() {
        super(Patient.class);
    }
    
    @PostConstruct
    protected void init()
    {
        personne =new Personne();
        patient=new Patient();
        ville=new Ville();
        medecin=new Medecin();
        cabinetMed=new CabinetMedical();
        spec=new SpecialiteMed();
    }

    //@Override
    public String createPatient(String wscaller, String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal) {
        init();
        try{
            ville=(Ville) getEntityManager().createNamedQuery("Ville.findByVilleCodePostal").setParameter("villeCodePostal",
                code_postal).getSingleResult();
            personne.setVilleIdville(ville);
            personne.setNumeroSecu(num_secu);
            personne.setAdresse(adresse);
            personne.setEmail(email);
            personne.setNom(nom);
            personne.setTelephonePortable(telephone);
            personne.setDateNaissance(null);
            getEntityManager().persist(personne);
//int idville=ville.getIdville();
           patient.setNumeroSecu(personne);
           int id = this.count();
           if(id==0)
              id+=1;       
           patient.setIdpatient(id);
           this.create(patient);
           return personne.toString();
        }catch(Exception e){
           return e.toString();
        }
    }
    

   // @Override
    public Personne getPatientByNumeroSecu(String wscaller, Integer num_secu) {
        init();
        try{
            personne=(Personne) getEntityManager().createNamedQuery("Personne.findByNumeroSecu").setParameter("numeroSecu",
                num_secu).getSingleResult();
            return personne;
        }catch(Exception e)
        {
            return null;
        }
    }

    //@Override
    public String createMedecin(String wscaller, String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal, String cabinet, String specialite) {
        init();
        MedecinFacade medFacade=new MedecinFacade();
        try{
            ville=(Ville) getEntityManager().createNamedQuery("Ville.findByVilleCodePostal").setParameter("villeCodePostal",
                code_postal).getSingleResult();
            cabinetMed=(CabinetMedical) getEntityManager().createNamedQuery("CabinetMedical.findByNomCabinet").setParameter("nomCabinet",
                cabinet).getSingleResult();
            spec=(SpecialiteMed) getEntityManager().createNamedQuery("SpecialiteMed.findByLibelle").setParameter("libelle",
                specialite).getSingleResult();
            personne.setVilleIdville(ville);
            personne.setNumeroSecu(num_secu);
            personne.setAdresse(adresse);
            personne.setEmail(email);
            personne.setNom(nom);
            personne.setTelephonePortable(telephone);
            personne.setDateNaissance(null);
            
            medecin.setNumeroSecu(personne);
             /*
            int id = medFacade.count();
            if(id!=0) {
            } else {       
                id+=1;
            }    
                       */
            medecin.setIdMedecin(1);
            medecin.setIdcabinetMedical(cabinetMed);
            medecin.setIdcabinetMedical(cabinetMed);
            medecin.setIdspecialiteMed(spec);
            getEntityManager().persist(personne);
            getEntityManager().persist(medecin);
//int idville=ville.getIdville();
           return spec.toString();
        }catch(Exception e){
           return e.toString();
        }
    }

   // @Override
    public List<MedecinCrenaux> getCrenauxSpecialite(String wscaller, String specialite) {
        init();
        Query q = getEntityManager().createQuery("SELECT m FROM MedecinCrenaux m inner join m.medecin n inner join n.idspecialiteMed t WHERE t.libelle = :libelle");
        q.setParameter("libelle", specialite);
        List<MedecinCrenaux> results = (List<MedecinCrenaux>) q.getResultList();
        return results;
    }

}
