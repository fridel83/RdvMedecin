/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicole
 */
@XmlRootElement
public class ReturnCode {
    private Integer return_code;
    private String libelle;

    public Integer getReturn_code() {
        return return_code;
    }

    public ReturnCode() {
        libelle=null;
    }

    public void setReturn_code(Integer return_code) {
        this.return_code = return_code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
