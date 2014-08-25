/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinentities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nicole
 */
@Entity
@Table(name = "medecin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecin.findAll", query = "SELECT m FROM Medecin m"),
    @NamedQuery(name = "Medecin.findByIdMedecin", query = "SELECT m FROM Medecin m WHERE m.idMedecin = :idMedecin")})
public class Medecin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMedecin")
    private Integer idMedecin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medecin")
    private Collection<MedecinCrenaux> medecinCrenauxCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedecin")
    private Collection<Rdv> rdvCollection;
    @JoinColumn(name = "idcabinet_medical", referencedColumnName = "idcabinet_medical")
    @ManyToOne(optional = false)
    private CabinetMedical idcabinetMedical;
    @JoinColumn(name = "numero_secu", referencedColumnName = "numero_secu")
    @ManyToOne(optional = false)
    private Personne numeroSecu;
    @JoinColumn(name = "idspecialite_med", referencedColumnName = "idspecialite_med")
    @ManyToOne(optional = false)
    private SpecialiteMed idspecialiteMed;

    public Medecin() {
    }

    public Medecin(Integer idMedecin) {
        this.idMedecin = idMedecin;
    }

    public Integer getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Integer idMedecin) {
        this.idMedecin = idMedecin;
    }

    @XmlTransient
    public Collection<MedecinCrenaux> getMedecinCrenauxCollection() {
        return medecinCrenauxCollection;
    }

    public void setMedecinCrenauxCollection(Collection<MedecinCrenaux> medecinCrenauxCollection) {
        this.medecinCrenauxCollection = medecinCrenauxCollection;
    }

    @XmlTransient
    public Collection<Rdv> getRdvCollection() {
        return rdvCollection;
    }

    public void setRdvCollection(Collection<Rdv> rdvCollection) {
        this.rdvCollection = rdvCollection;
    }

    public CabinetMedical getIdcabinetMedical() {
        return idcabinetMedical;
    }

    public void setIdcabinetMedical(CabinetMedical idcabinetMedical) {
        this.idcabinetMedical = idcabinetMedical;
    }

    public Personne getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(Personne numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public SpecialiteMed getIdspecialiteMed() {
        return idspecialiteMed;
    }

    public void setIdspecialiteMed(SpecialiteMed idspecialiteMed) {
        this.idspecialiteMed = idspecialiteMed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedecin != null ? idMedecin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecin)) {
            return false;
        }
        Medecin other = (Medecin) object;
        if ((this.idMedecin == null && other.idMedecin != null) || (this.idMedecin != null && !this.idMedecin.equals(other.idMedecin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentiies.Medecin[ idMedecin=" + idMedecin + " ]";
    }
    
}
