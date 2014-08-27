/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinentities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicole
 */
@Entity
@Table(name = "medecin_crenaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedecinCrenaux.findAll", query = "SELECT m FROM MedecinCrenaux m"),
    @NamedQuery(name = "MedecinCrenaux.findByIdMedecin", query = "SELECT m FROM MedecinCrenaux m WHERE m.medecinCrenauxPK.idMedecin = :idMedecin"),
    @NamedQuery(name = "MedecinCrenaux.findByIdcrenaux", query = "SELECT m FROM MedecinCrenaux m WHERE m.medecinCrenauxPK.idcrenaux = :idcrenaux"),
    @NamedQuery(name = "MedecinCrenaux.findByPris", query = "SELECT m FROM MedecinCrenaux m WHERE m.pris = :pris"),
    @NamedQuery(name = "MedecinCrenaux.findByDisponible", query = "SELECT m FROM MedecinCrenaux m WHERE m.disponible = :disponible")})
public class MedecinCrenaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MedecinCrenauxPK medecinCrenauxPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pris")
    private int pris;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disponible")
    private int disponible;
    @JoinColumn(name = "idcrenaux", referencedColumnName = "idcrenaux", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Crenaux crenaux;
    @JoinColumn(name = "idMedecin", referencedColumnName = "idMedecin", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Medecin medecin;

    public MedecinCrenaux() {
    }

    public MedecinCrenaux(MedecinCrenauxPK medecinCrenauxPK) {
        this.medecinCrenauxPK = medecinCrenauxPK;
    }

    public MedecinCrenaux(MedecinCrenauxPK medecinCrenauxPK, int pris, int disponible) {
        this.medecinCrenauxPK = medecinCrenauxPK;
        this.pris = pris;
        this.disponible = disponible;
    }

    public MedecinCrenaux(int idMedecin, int idcrenaux) {
        this.medecinCrenauxPK = new MedecinCrenauxPK(idMedecin, idcrenaux);
    }

    public MedecinCrenauxPK getMedecinCrenauxPK() {
        return medecinCrenauxPK;
    }

    public void setMedecinCrenauxPK(MedecinCrenauxPK medecinCrenauxPK) {
        this.medecinCrenauxPK = medecinCrenauxPK;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public Crenaux getCrenaux() {
        return crenaux;
    }

    public void setCrenaux(Crenaux crenaux) {
        this.crenaux = crenaux;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medecinCrenauxPK != null ? medecinCrenauxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedecinCrenaux)) {
            return false;
        }
        MedecinCrenaux other = (MedecinCrenaux) object;
        if ((this.medecinCrenauxPK == null && other.medecinCrenauxPK != null) || (this.medecinCrenauxPK != null && !this.medecinCrenauxPK.equals(other.medecinCrenauxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentities.MedecinCrenaux[ medecinCrenauxPK=" + medecinCrenauxPK + " ]";
    }
    
}
