/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package RdvMedecin.ejb;

import RdvMedecin.entities.MedecinCrenaux;
import RdvMedecin.entities.Patient;
import RdvMedecin.entities.Personne;
import java.util.List;
import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
/**
 *
 * @author fridel
 */
@Local
@WebService(
            name="RdvWebService",
            targetNamespace="http://localhost:8080/RdvMedecin",
            portName="RdvWebServicePort")
public interface PatientFacadeLocal {
 
    @WebMethod
    public String createPatient(@WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal);

    @WebMethod
    public Personne getPatientByNumeroSecu(@WebParam(name="num_secu") Integer num_secu);
    
    @WebMethod
    public String createMedecin(@WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal ,@WebParam(name="nom_cabinet") String cabinet, @WebParam(name="specialite") String specialite);
    
    @WebMethod
    public List<MedecinCrenaux> getCrenauxSpecialite(@WebParam(name="specialite") String specialite);
    
    
    void create(Patient patient);

    void edit(Patient patient);

    void remove(Patient patient);

    Patient find(Object id);

    List<Patient> findAll();

    List<Patient> findRange(int[] range);

    int count();
    
}
