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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nicole
 */
@Entity
@Table(name = "specialite_med")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpecialiteMed.findAll", query = "SELECT s FROM SpecialiteMed s"),
    @NamedQuery(name = "SpecialiteMed.findByIdspecialiteMed", query = "SELECT s FROM SpecialiteMed s WHERE s.idspecialiteMed = :idspecialiteMed"),
    @NamedQuery(name = "SpecialiteMed.findByLibelle", query = "SELECT s FROM SpecialiteMed s WHERE s.libelle = :libelle")})
public class SpecialiteMed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idspecialite_med")
    private Integer idspecialiteMed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "libelle")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idspecialiteMed")
    private Collection<Medecin> medecinCollection;

    public SpecialiteMed() {
    }

    public SpecialiteMed(Integer idspecialiteMed) {
        this.idspecialiteMed = idspecialiteMed;
    }

    public SpecialiteMed(Integer idspecialiteMed, String libelle) {
        this.idspecialiteMed = idspecialiteMed;
        this.libelle = libelle;
    }

    public Integer getIdspecialiteMed() {
        return idspecialiteMed;
    }

    public void setIdspecialiteMed(Integer idspecialiteMed) {
        this.idspecialiteMed = idspecialiteMed;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public Collection<Medecin> getMedecinCollection() {
        return medecinCollection;
    }

    public void setMedecinCollection(Collection<Medecin> medecinCollection) {
        this.medecinCollection = medecinCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idspecialiteMed != null ? idspecialiteMed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpecialiteMed)) {
            return false;
        }
        SpecialiteMed other = (SpecialiteMed) object;
        if ((this.idspecialiteMed == null && other.idspecialiteMed != null) || (this.idspecialiteMed != null && !this.idspecialiteMed.equals(other.idspecialiteMed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentities.SpecialiteMed[ idspecialiteMed=" + idspecialiteMed + " ]";
    }
    
}
