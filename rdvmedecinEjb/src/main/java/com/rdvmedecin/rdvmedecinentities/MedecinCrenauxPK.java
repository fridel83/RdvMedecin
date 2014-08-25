/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinentities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nicole
 */
@Embeddable
public class MedecinCrenauxPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMedecin")
    private int idMedecin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcrenaux")
    private int idcrenaux;

    public MedecinCrenauxPK() {
    }

    public MedecinCrenauxPK(int idMedecin, int idcrenaux) {
        this.idMedecin = idMedecin;
        this.idcrenaux = idcrenaux;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(int idMedecin) {
        this.idMedecin = idMedecin;
    }

    public int getIdcrenaux() {
        return idcrenaux;
    }

    public void setIdcrenaux(int idcrenaux) {
        this.idcrenaux = idcrenaux;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMedecin;
        hash += (int) idcrenaux;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedecinCrenauxPK)) {
            return false;
        }
        MedecinCrenauxPK other = (MedecinCrenauxPK) object;
        if (this.idMedecin != other.idMedecin) {
            return false;
        }
        if (this.idcrenaux != other.idcrenaux) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentiies.MedecinCrenauxPK[ idMedecin=" + idMedecin + ", idcrenaux=" + idcrenaux + " ]";
    }
    
}
