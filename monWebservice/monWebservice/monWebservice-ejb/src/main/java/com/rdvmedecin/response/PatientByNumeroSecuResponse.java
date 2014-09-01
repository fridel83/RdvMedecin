/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.response;

import com.rdvmedecin.rdvmedecinentities.Personne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicole
 */
@XmlRootElement
public class PatientByNumeroSecuResponse {
    private ReturnCode return_code;
    private Personne personne;

    public PatientByNumeroSecuResponse() {
        personne=null;
    }

    public ReturnCode getReturn_code() {
        return return_code;
    }

    public void setReturn_code(ReturnCode return_code) {
        this.return_code = return_code;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
