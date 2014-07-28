/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.Impl;

import RdvMedecin.ejb.CabinetMedicalFacade;
import RdvMedecin.ejb.CrenauxFacade;
import RdvMedecin.ejb.MedecinFacade;
import RdvMedecin.ejb.PatientFacade;
import RdvMedecin.ejb.PersonneFacade;
import RdvMedecin.ejb.SpecialiteMedFacade;
import RdvMedecin.ejb.VilleFacade;
import RdvMedecin.entities.CabinetMedical;
import RdvMedecin.entities.Medecin;
import RdvMedecin.entities.MedecinCrenaux;
import RdvMedecin.entities.Patient;
import RdvMedecin.entities.Personne;
import RdvMedecin.entities.SpecialiteMed;
import RdvMedecin.entities.Ville;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author fridel
 */
@WebService(
            serviceName="RdvMedecin",
            endpointInterface="RdvMedecin.interfaces.RdvMedecinInterface",
            portName="RdvWebServicePort")
@Stateless
public class RdvWebService {
    private Personne personne;
    private Patient patient;
    private Ville ville;
    private Medecin medecin;
    private CabinetMedical cabinetMed;
    private SpecialiteMed spec=null;
    
    @EJB
    private PatientFacade patientFacade; 
    @EJB 
    private MedecinFacade medecinFacade;
    @EJB 
    private PersonneFacade personneFacade;
    @EJB
    private VilleFacade villeFacade;
    @EJB
    private CabinetMedicalFacade cabinetFacade;
    @EJB
    private SpecialiteMedFacade specMedfacade;
    @EJB
    private CrenauxFacade crenauxFacade;
    
     protected void init()
    {
        personne =new Personne();
        patient=new Patient();
        ville=new Ville();
        medecin=new Medecin();
        cabinetMed=new CabinetMedical();
        spec=new SpecialiteMed();
    }
     
      public String createPatient(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal) {
        init();
        try{
            ville=(Ville) villeFacade.getVilleByCodePostal(code_postal);
            personne.setVilleIdville(ville);
            personne.setNumeroSecu(num_secu);
            personne.setAdresse(adresse);
            personne.setEmail(email);
            personne.setNom(nom);
            personne.setTelephonePortable(telephone);
            personne.setDateNaissance(null);
            personneFacade.create(personne);
            patient.setNumeroSecu(personne);
            int id = patientFacade.count();
            if(id==0)
              id+=1;       
            patient.setIdpatient(id);
            patientFacade.create(patient);
            return personne.toString();
        }catch(Exception e){
           return e.toString();
        }
    }
    
    public Personne getPatientByNumeroSecu(Integer num_secu) 
    {
        init();
        personne=(Personne) personneFacade.findPersonneByNumeroSecu(num_secu);
        return personne;
    }
    
    public String createMedecin(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal, String cabinet, String specialite) {
        init();
        try{
            ville=(Ville) villeFacade.getVilleByCodePostal(code_postal);
            cabinetMed=(CabinetMedical) cabinetFacade.getCabinetMedicalByName(cabinet);
            spec=(SpecialiteMed) specMedfacade.getSpecialiteByName(specialite);
            personne.setVilleIdville(ville);
            personne.setNumeroSecu(num_secu);
            personne.setAdresse(adresse);
            personne.setEmail(email);
            personne.setNom(nom);
            personne.setTelephonePortable(telephone);
            personne.setDateNaissance(null);
            medecin.setNumeroSecu(personne);
            List<Medecin> liste =(List<Medecin>) medecinFacade.findAll();
            int id = liste.size();
            if(id!=0) {
            } else {       
                id+=1;
            }
            medecin.setIdMedecin(id);
            medecin.setIdcabinetMedical(cabinetMed);
            medecin.setIdcabinetMedical(cabinetMed);
            medecin.setIdspecialiteMed(spec);
            personneFacade.create(personne);
            medecinFacade.create(medecin);
           return medecin.toString();
        }catch(Exception e){
           return e.toString();
        }
    }
    
    public List<MedecinCrenaux> getCrenauxSpecialite(String specialite) {
        init();
        List<MedecinCrenaux> results = (List<MedecinCrenaux>) crenauxFacade.getCrenauxForSpecialite(specialite);
        return results;
    }
    
}
