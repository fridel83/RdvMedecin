/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.Wrapper.RequestClass;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fridel
 */
@XmlRootElement
public class CreateClientMethodRequest {
    
    private String nom;
    private Integer num_secu;
    private String adresse;
    private String email;
    private String telephone;
    private String code_postal;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNum_secu() {
        return num_secu;
    }

    public void setNum_secu(Integer num_secu) {
        this.num_secu = num_secu;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
    
}
