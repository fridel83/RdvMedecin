/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin;

import com.rdvmedecin.ejb.PatientFacade;
import com.rdvmedecin.proprietes.MesConfig;
import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import com.rdvmedecin.rdvmedecinentities.Patient;
import com.rdvmedecin.rdvmedecinentities.Personne;
import com.rdvmedecin.response.PatientByNumeroSecuResponse;
import com.rdvmedecin.response.ReturnCode;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author fridel
 */
@Stateless
@WebService()
public class MonWebService  {

    PatientFacade patientFac=new PatientFacade();
   
    @WebMethod
    public String createPatient(@WebParam(name="WsCaller") String wscaller, @WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal) {
        MesConfig config = new MesConfig("MesConfig.properties");
        if(!(wscaller.equals((String) config.getCaller2()) || wscaller.equals((String) config.getCaller2())))
        {
            
        }    
        return patientFac.createPatient(wscaller, nom, num_secu, adresse, email, telephone, code_postal);
    }
    

    
    @WebMethod
    public PatientByNumeroSecuResponse getPatientByNumeroSecu(@WebParam(name="WsCaller") String wscaller, @WebParam(name="num_secu") Integer num_secu) {
        PatientByNumeroSecuResponse response = new PatientByNumeroSecuResponse();
        ReturnCode return_code= new ReturnCode();
        MesConfig config = new MesConfig("webserviceproperties.properties");
        //if(!(wscaller.equals((String) config.getCaller2()) || wscaller.equals((String) config.getCaller2())))
        if(wscaller.equals("ALF"))
        {
            return_code.setReturn_code(0);
            response.setReturn_code(return_code);
            Personne personne= patientFac.getPatientByNumeroSecu(wscaller,num_secu);
            response.setPersonne(personne);
        }
        else
        {
            return_code.setReturn_code(-2);
            return_code.setLibelle(config.getError_caller());
            response.setReturn_code(return_code);
        }
        return response;
    }
    
    @WebMethod
    public String createMedecin(@WebParam(name="WsCaller") String wscaller, @WebParam(name="nom") String nom, @WebParam(name="num_secu") Integer num_secu, 
                @WebParam(name="adresse") String adresse, @WebParam(name="email") String email,
                @WebParam(name="telephone") String telephone,@WebParam(name="code_postal") String code_postal ,@WebParam(name="nom_cabinet") String cabinet, @WebParam(name="specialite") String specialite){
       return patientFac.createMedecin(wscaller, nom, num_secu, adresse, email, telephone, code_postal, cabinet, specialite);
    }

    @WebMethod
    public List<MedecinCrenaux> getCrenauxSpecialite(@WebParam(name="WsCaller") String wscaller, @WebParam(name="specialite") String specialite) {
        return patientFac.getCrenauxSpecialite(wscaller, specialite);
    }

}
