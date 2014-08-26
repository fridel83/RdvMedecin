/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.Wrapper.ResponseClass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author fridel
 */
@XmlRootElement(name = "CreateMedecinMethodResponse", namespace = "http://localhost:8080/RdvMedecin")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMedecinMethodResponse", namespace = "http://localhost:8080/RdvMedecin")
public class CreateMedecinMethodResponse {
   private String reponse;    

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
