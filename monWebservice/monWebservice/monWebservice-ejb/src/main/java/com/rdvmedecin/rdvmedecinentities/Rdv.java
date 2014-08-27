/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinentities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicole
 */
@Entity
@Table(name = "rdv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rdv.findAll", query = "SELECT r FROM Rdv r"),
    @NamedQuery(name = "Rdv.findByIdrdv", query = "SELECT r FROM Rdv r WHERE r.idrdv = :idrdv")})
public class Rdv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrdv")
    private Integer idrdv;
    @JoinColumn(name = "idcrenaux", referencedColumnName = "idcrenaux")
    @ManyToOne(optional = false)
    private Crenaux idcrenaux;
    @JoinColumn(name = "idMedecin", referencedColumnName = "idMedecin")
    @ManyToOne(optional = false)
    private Medecin idMedecin;
    @JoinColumn(name = "idpatient", referencedColumnName = "idpatient")
    @ManyToOne(optional = false)
    private Patient idpatient;

    public Rdv() {
    }

    public Rdv(Integer idrdv) {
        this.idrdv = idrdv;
    }

    public Integer getIdrdv() {
        return idrdv;
    }

    public void setIdrdv(Integer idrdv) {
        this.idrdv = idrdv;
    }

    public Crenaux getIdcrenaux() {
        return idcrenaux;
    }

    public void setIdcrenaux(Crenaux idcrenaux) {
        this.idcrenaux = idcrenaux;
    }

    public Medecin getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Medecin idMedecin) {
        this.idMedecin = idMedecin;
    }

    public Patient getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(Patient idpatient) {
        this.idpatient = idpatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrdv != null ? idrdv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rdv)) {
            return false;
        }
        Rdv other = (Rdv) object;
        if ((this.idrdv == null && other.idrdv != null) || (this.idrdv != null && !this.idrdv.equals(other.idrdv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentities.Rdv[ idrdv=" + idrdv + " ]";
    }
    
}
