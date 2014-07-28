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
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
/**
 *
 * @author fridel
 */
@Local
public interface PatientFacadeLocal {
    
    void create(Patient patient);

    void edit(Patient patient);

    void remove(Patient patient);

    Patient find(Object id);

    List<Patient> findAll();

    List<Patient> findRange(int[] range);

    int count();
    
}
