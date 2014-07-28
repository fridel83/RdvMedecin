/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package RdvMedecin.interfaces;

import RdvMedecin.entities.MedecinCrenaux;
import RdvMedecin.entities.Patient;
import RdvMedecin.entities.Personne;
import java.util.List;
import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
/**
 *
 * @author fridel
 */
@Local
@WebService(
            name="RdvMedecin",
            targetNamespace="http://localhost:8080/RdvMedecin")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, use = SOAPBinding.Use.LITERAL, style = SOAPBinding.Style.DOCUMENT)
public interface RdvMedecinInterface {
 
    @WebMethod
    @RequestWrapper(localName = "createPatient", className = "RdvMedecin.Wrapper.RequestClass.CreateClientMethodRequest", targetNamespace = "http://localhost:8080/RdvMedecin")
    //@ResponseWrapper(localName = "createPatientResponse", className = "com.foo.services.personService.GetPersonByUidResponse", targetNamespace = "http://localhost:8080/RdvMedecin")
 
    /**
     *
     * @param nom
     * @param num_secu
     * @param adresse
     * @param email
     * @param telephone
     * @param code_postal
     * @return
     */
        public String createPatient(@WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal);

    @WebMethod
    public Personne getPatientByNumeroSecu(@WebParam(name="num_secu") Integer num_secu);
    
    @WebMethod
    @WebResult(name="result")
    @RequestWrapper(localName = "createMedecin", className = "RdvMedecin.Wrapper.RequestClass.CreateMedecinMethodRequest", targetNamespace = "http://localhost:8080/RdvMedecin")
    @ResponseWrapper(localName = "createMedecinResponse", className = "RdvMedecin.Wrapper.RequestClass.CreateMedecinMethodResponse", targetNamespace = "http://localhost:8080/RdvMedecin")
    public String createMedecin(@WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal ,@WebParam(name="nom_cabinet") String cabinet, @WebParam(name="specialite") String specialite);
    
    @WebMethod
    public List<MedecinCrenaux> getCrenauxSpecialite(@WebParam(name="specialite") String specialite);
    
    
}
