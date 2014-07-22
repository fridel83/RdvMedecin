/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.CabinetMedical;
import RdvMedecin.entities.Medecin;
import RdvMedecin.entities.MedecinCrenaux;
import RdvMedecin.entities.Patient;
import RdvMedecin.entities.Personne;
import RdvMedecin.entities.SpecialiteMed;
import RdvMedecin.entities.Ville;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author fridel
 */
@Stateless
@WebService(
            serviceName="RdvWebService",
            endpointInterface="RdvMedecin.ejb.PatientFacadeLocal",
            portName="RdvWebServicePort")
public class PatientFacade extends AbstractFacade<Patient> implements PatientFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;
    
    @Resource 
    WebServiceContext webServiceContext;

    private Personne personne;
    private Patient patient;
    private Ville ville;
    private Medecin medecin;
    private CabinetMedical cabinetMed;
    private SpecialiteMed spec=null;
    //private VilleJpaController villeController=null;
    
    public String getHelloWorldAsString(String str) {
        MessageContext messageContext = webServiceContext.getMessageContext();
        // get request headers
        Map<?,?> requestHeaders = (Map<?,?>) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<?> usernameList = (List<?>) requestHeaders.get("username");
        List<?> passwordList = (List<?>) requestHeaders.get("password");
        String username = "";
        String password = "";
        if (usernameList != null) {
            username = usernameList.get(0).toString();
        }
        if (passwordList != null) {
            password = passwordList.get(0).toString();
        }
                // of course this is not real validation
                // you should validate your users from stored databases credentials
        if (username.equals("nikos") && password.equals("superpassword")) {
            return "Valid User :"+str;
        } else {
            return "Unknown User!";
        }
    }


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

    @Override
    public String createPatient(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal) {
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
    

    @Override
    public Personne getPatientByNumeroSecu(Integer num_secu) {
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

    @Override
    public String createMedecin(String nom, Integer num_secu, String adresse, String email, String telephone, String code_postal, String cabinet, String specialite) {
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

    @Override
    public List<MedecinCrenaux> getCrenauxSpecialite(String specialite) {
        init();
        Query q = getEntityManager().createQuery("SELECT m FROM MedecinCrenaux m inner join m.medecin n inner join n.idspecialiteMed t WHERE t.libelle = :libelle");
        q.setParameter("libelle", specialite);
        List<MedecinCrenaux> results = (List<MedecinCrenaux>) q.getResultList();
        return results;
    }
}
