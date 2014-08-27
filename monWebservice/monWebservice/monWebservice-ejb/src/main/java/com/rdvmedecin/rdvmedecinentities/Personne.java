/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinentities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nicole
 */
@Entity
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p"),
    @NamedQuery(name = "Personne.findByNumeroSecu", query = "SELECT p FROM Personne p WHERE p.numeroSecu = :numeroSecu"),
    @NamedQuery(name = "Personne.findByNom", query = "SELECT p FROM Personne p WHERE p.nom = :nom"),
    @NamedQuery(name = "Personne.findByPrenom", query = "SELECT p FROM Personne p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Personne.findByAdresse", query = "SELECT p FROM Personne p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Personne.findByDateNaissance", query = "SELECT p FROM Personne p WHERE p.dateNaissance = :dateNaissance"),
    @NamedQuery(name = "Personne.findByEmail", query = "SELECT p FROM Personne p WHERE p.email = :email"),
    @NamedQuery(name = "Personne.findByTelephonePortable", query = "SELECT p FROM Personne p WHERE p.telephonePortable = :telephonePortable"),
    @NamedQuery(name = "Personne.findByTelephoneFixe", query = "SELECT p FROM Personne p WHERE p.telephoneFixe = :telephoneFixe")})
public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_secu")
    private Integer numeroSecu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "date_naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "telephone_portable")
    private String telephonePortable;
    @Size(max = 45)
    @Column(name = "telephone_fixe")
    private String telephoneFixe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroSecu")
    private Collection<Patient> patientCollection;
    @JoinColumn(name = "ville_idville", referencedColumnName = "idville")
    @ManyToOne(optional = false)
    private Ville villeIdville;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroSecu")
    private Collection<Medecin> medecinCollection;

    public Personne() {
    }

    public Personne(Integer numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public Personne(Integer numeroSecu, String nom, String adresse, String email) {
        this.numeroSecu = numeroSecu;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
    }

    public Integer getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(Integer numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephonePortable() {
        return telephonePortable;
    }

    public void setTelephonePortable(String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    @XmlTransient
    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
    }

    public Ville getVilleIdville() {
        return villeIdville;
    }

    public void setVilleIdville(Ville villeIdville) {
        this.villeIdville = villeIdville;
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
        hash += (numeroSecu != null ? numeroSecu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.numeroSecu == null && other.numeroSecu != null) || (this.numeroSecu != null && !this.numeroSecu.equals(other.numeroSecu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentities.Personne[ numeroSecu=" + numeroSecu + " ]";
    }
    
}
