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
@Table(name = "ville")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ville.findAll", query = "SELECT v FROM Ville v"),
    @NamedQuery(name = "Ville.findByIdville", query = "SELECT v FROM Ville v WHERE v.idville = :idville"),
    @NamedQuery(name = "Ville.findByVilleDepartement", query = "SELECT v FROM Ville v WHERE v.villeDepartement = :villeDepartement"),
    @NamedQuery(name = "Ville.findByVilleSlug", query = "SELECT v FROM Ville v WHERE v.villeSlug = :villeSlug"),
    @NamedQuery(name = "Ville.findByVilleNom", query = "SELECT v FROM Ville v WHERE v.villeNom = :villeNom"),
    @NamedQuery(name = "Ville.findByVilleNomSimple", query = "SELECT v FROM Ville v WHERE v.villeNomSimple = :villeNomSimple"),
    @NamedQuery(name = "Ville.findByVilleNomReel", query = "SELECT v FROM Ville v WHERE v.villeNomReel = :villeNomReel"),
    @NamedQuery(name = "Ville.findByVilleNomSoundex", query = "SELECT v FROM Ville v WHERE v.villeNomSoundex = :villeNomSoundex"),
    @NamedQuery(name = "Ville.findByVilleNomMetaphone", query = "SELECT v FROM Ville v WHERE v.villeNomMetaphone = :villeNomMetaphone"),
    @NamedQuery(name = "Ville.findByVilleCodePostal", query = "SELECT v FROM Ville v WHERE v.villeCodePostal = :villeCodePostal"),
    @NamedQuery(name = "Ville.findByVilleCommune", query = "SELECT v FROM Ville v WHERE v.villeCommune = :villeCommune"),
    @NamedQuery(name = "Ville.findByVilleCodeCommune", query = "SELECT v FROM Ville v WHERE v.villeCodeCommune = :villeCodeCommune"),
    @NamedQuery(name = "Ville.findByVilleArrondissement", query = "SELECT v FROM Ville v WHERE v.villeArrondissement = :villeArrondissement"),
    @NamedQuery(name = "Ville.findByVilleCanton", query = "SELECT v FROM Ville v WHERE v.villeCanton = :villeCanton"),
    @NamedQuery(name = "Ville.findByVilleAmdi", query = "SELECT v FROM Ville v WHERE v.villeAmdi = :villeAmdi"),
    @NamedQuery(name = "Ville.findByVillePopulation2010", query = "SELECT v FROM Ville v WHERE v.villePopulation2010 = :villePopulation2010"),
    @NamedQuery(name = "Ville.findByVillePopulation1999", query = "SELECT v FROM Ville v WHERE v.villePopulation1999 = :villePopulation1999"),
    @NamedQuery(name = "Ville.findByVillePopulation2012", query = "SELECT v FROM Ville v WHERE v.villePopulation2012 = :villePopulation2012"),
    @NamedQuery(name = "Ville.findByVilleDensite2010", query = "SELECT v FROM Ville v WHERE v.villeDensite2010 = :villeDensite2010"),
    @NamedQuery(name = "Ville.findByVilleSurface", query = "SELECT v FROM Ville v WHERE v.villeSurface = :villeSurface"),
    @NamedQuery(name = "Ville.findByVilleLongitudeDeg", query = "SELECT v FROM Ville v WHERE v.villeLongitudeDeg = :villeLongitudeDeg"),
    @NamedQuery(name = "Ville.findByVilleLatitudeDeg", query = "SELECT v FROM Ville v WHERE v.villeLatitudeDeg = :villeLatitudeDeg"),
    @NamedQuery(name = "Ville.findByVilleLongitudeGrd", query = "SELECT v FROM Ville v WHERE v.villeLongitudeGrd = :villeLongitudeGrd"),
    @NamedQuery(name = "Ville.findByVilleLatitudeGrd", query = "SELECT v FROM Ville v WHERE v.villeLatitudeGrd = :villeLatitudeGrd"),
    @NamedQuery(name = "Ville.findByVilleLongitudeDms", query = "SELECT v FROM Ville v WHERE v.villeLongitudeDms = :villeLongitudeDms"),
    @NamedQuery(name = "Ville.findByVilleLatitudeDms", query = "SELECT v FROM Ville v WHERE v.villeLatitudeDms = :villeLatitudeDms"),
    @NamedQuery(name = "Ville.findByVilleZmin", query = "SELECT v FROM Ville v WHERE v.villeZmin = :villeZmin"),
    @NamedQuery(name = "Ville.findByVilleZmax", query = "SELECT v FROM Ville v WHERE v.villeZmax = :villeZmax")})
public class Ville implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idville")
    private Integer idville;
    @Size(max = 3)
    @Column(name = "ville_departement")
    private String villeDepartement;
    @Size(max = 255)
    @Column(name = "ville_slug")
    private String villeSlug;
    @Size(max = 45)
    @Column(name = "ville_nom")
    private String villeNom;
    @Size(max = 45)
    @Column(name = "ville_nom_simple")
    private String villeNomSimple;
    @Size(max = 45)
    @Column(name = "ville_nom_reel")
    private String villeNomReel;
    @Size(max = 20)
    @Column(name = "ville_nom_soundex")
    private String villeNomSoundex;
    @Size(max = 22)
    @Column(name = "ville_nom_metaphone")
    private String villeNomMetaphone;
    @Size(max = 255)
    @Column(name = "ville_code_postal")
    private String villeCodePostal;
    @Size(max = 3)
    @Column(name = "ville_commune")
    private String villeCommune;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ville_code_commune")
    private String villeCodeCommune;
    @Column(name = "ville_arrondissement")
    private Short villeArrondissement;
    @Size(max = 4)
    @Column(name = "ville_canton")
    private String villeCanton;
    @Column(name = "ville_amdi")
    private Short villeAmdi;
    @Column(name = "ville_population_2010")
    private Integer villePopulation2010;
    @Column(name = "ville_population_1999")
    private Integer villePopulation1999;
    @Column(name = "ville_population_2012")
    private Integer villePopulation2012;
    @Column(name = "ville_densite_2010")
    private Integer villeDensite2010;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ville_surface")
    private Float villeSurface;
    @Column(name = "ville_longitude_deg")
    private Float villeLongitudeDeg;
    @Column(name = "ville_latitude_deg")
    private Float villeLatitudeDeg;
    @Size(max = 9)
    @Column(name = "ville_longitude_grd")
    private String villeLongitudeGrd;
    @Size(max = 8)
    @Column(name = "ville_latitude_grd")
    private String villeLatitudeGrd;
    @Size(max = 9)
    @Column(name = "ville_longitude_dms")
    private String villeLongitudeDms;
    @Size(max = 8)
    @Column(name = "ville_latitude_dms")
    private String villeLatitudeDms;
    @Column(name = "ville_zmin")
    private Integer villeZmin;
    @Column(name = "ville_zmax")
    private Integer villeZmax;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "villeIdville")
    private Collection<CabinetMedical> cabinetMedicalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "villeIdville")
    private Collection<Personne> personneCollection;

    public Ville() {
    }

    public Ville(Integer idville) {
        this.idville = idville;
    }

    public Ville(Integer idville, String villeCodeCommune) {
        this.idville = idville;
        this.villeCodeCommune = villeCodeCommune;
    }
    
    @XmlTransient
    public Integer getIdville() {
        return idville;
    }

    public void setIdville(Integer idville) {
        this.idville = idville;
    }
    
    @XmlTransient
    public String getVilleDepartement() {
        return villeDepartement;
    }

    public void setVilleDepartement(String villeDepartement) {
        this.villeDepartement = villeDepartement;
    }
    
    @XmlTransient
    public String getVilleSlug() {
        return villeSlug;
    }

    public void setVilleSlug(String villeSlug) {
        this.villeSlug = villeSlug;
    }

    @XmlTransient
    public String getVilleNom() {
        return villeNom;
    }

    public void setVilleNom(String villeNom) {
        this.villeNom = villeNom;
    }

    public String getVilleNomSimple() {
        return villeNomSimple;
    }

    public void setVilleNomSimple(String villeNomSimple) {
        this.villeNomSimple = villeNomSimple;
    }

    @XmlTransient
    public String getVilleNomReel() {
        return villeNomReel;
    }

    public void setVilleNomReel(String villeNomReel) {
        this.villeNomReel = villeNomReel;
    }

    @XmlTransient
    public String getVilleNomSoundex() {
        return villeNomSoundex;
    }

    public void setVilleNomSoundex(String villeNomSoundex) {
        this.villeNomSoundex = villeNomSoundex;
    }

    @XmlTransient
    public String getVilleNomMetaphone() {
        return villeNomMetaphone;
    }

    public void setVilleNomMetaphone(String villeNomMetaphone) {
        this.villeNomMetaphone = villeNomMetaphone;
    }

    public String getVilleCodePostal() {
        return villeCodePostal;
    }

    public void setVilleCodePostal(String villeCodePostal) {
        this.villeCodePostal = villeCodePostal;
    }

    public String getVilleCommune() {
        return villeCommune;
    }

    public void setVilleCommune(String villeCommune) {
        this.villeCommune = villeCommune;
    }

    @XmlTransient
    public String getVilleCodeCommune() {
        return villeCodeCommune;
    }

    public void setVilleCodeCommune(String villeCodeCommune) {
        this.villeCodeCommune = villeCodeCommune;
    }

    @XmlTransient
    public Short getVilleArrondissement() {
        return villeArrondissement;
    }

    public void setVilleArrondissement(Short villeArrondissement) {
        this.villeArrondissement = villeArrondissement;
    }

    @XmlTransient
    public String getVilleCanton() {
        return villeCanton;
    }

    public void setVilleCanton(String villeCanton) {
        this.villeCanton = villeCanton;
    }

    @XmlTransient
    public Short getVilleAmdi() {
        return villeAmdi;
    }

    public void setVilleAmdi(Short villeAmdi) {
        this.villeAmdi = villeAmdi;
    }

    @XmlTransient
    public Integer getVillePopulation2010() {
        return villePopulation2010;
    }

    public void setVillePopulation2010(Integer villePopulation2010) {
        this.villePopulation2010 = villePopulation2010;
    }

    @XmlTransient
    public Integer getVillePopulation1999() {
        return villePopulation1999;
    }

    public void setVillePopulation1999(Integer villePopulation1999) {
        this.villePopulation1999 = villePopulation1999;
    }

    @XmlTransient
    public Integer getVillePopulation2012() {
        return villePopulation2012;
    }

    public void setVillePopulation2012(Integer villePopulation2012) {
        this.villePopulation2012 = villePopulation2012;
    }

    @XmlTransient
    public Integer getVilleDensite2010() {
        return villeDensite2010;
    }

    public void setVilleDensite2010(Integer villeDensite2010) {
        this.villeDensite2010 = villeDensite2010;
    }

    @XmlTransient
    public Float getVilleSurface() {
        return villeSurface;
    }

    public void setVilleSurface(Float villeSurface) {
        this.villeSurface = villeSurface;
    }

    @XmlTransient
    public Float getVilleLongitudeDeg() {
        return villeLongitudeDeg;
    }

    public void setVilleLongitudeDeg(Float villeLongitudeDeg) {
        this.villeLongitudeDeg = villeLongitudeDeg;
    }

    @XmlTransient
    public Float getVilleLatitudeDeg() {
        return villeLatitudeDeg;
    }

    public void setVilleLatitudeDeg(Float villeLatitudeDeg) {
        this.villeLatitudeDeg = villeLatitudeDeg;
    }

    @XmlTransient
    public String getVilleLongitudeGrd() {
        return villeLongitudeGrd;
    }

    public void setVilleLongitudeGrd(String villeLongitudeGrd) {
        this.villeLongitudeGrd = villeLongitudeGrd;
    }

    @XmlTransient
    public String getVilleLatitudeGrd() {
        return villeLatitudeGrd;
    }

    public void setVilleLatitudeGrd(String villeLatitudeGrd) {
        this.villeLatitudeGrd = villeLatitudeGrd;
    }

    @XmlTransient
    public String getVilleLongitudeDms() {
        return villeLongitudeDms;
    }

    public void setVilleLongitudeDms(String villeLongitudeDms) {
        this.villeLongitudeDms = villeLongitudeDms;
    }

    @XmlTransient
    public String getVilleLatitudeDms() {
        return villeLatitudeDms;
    }

    public void setVilleLatitudeDms(String villeLatitudeDms) {
        this.villeLatitudeDms = villeLatitudeDms;
    }

    @XmlTransient
    public Integer getVilleZmin() {
        return villeZmin;
    }

    public void setVilleZmin(Integer villeZmin) {
        this.villeZmin = villeZmin;
    }

    @XmlTransient
    public Integer getVilleZmax() {
        return villeZmax;
    }

    public void setVilleZmax(Integer villeZmax) {
        this.villeZmax = villeZmax;
    }

    @XmlTransient
    public Collection<CabinetMedical> getCabinetMedicalCollection() {
        return cabinetMedicalCollection;
    }

    public void setCabinetMedicalCollection(Collection<CabinetMedical> cabinetMedicalCollection) {
        this.cabinetMedicalCollection = cabinetMedicalCollection;
    }

    @XmlTransient
    public Collection<Personne> getPersonneCollection() {
        return personneCollection;
    }

    public void setPersonneCollection(Collection<Personne> personneCollection) {
        this.personneCollection = personneCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idville != null ? idville.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        if ((this.idville == null && other.idville != null) || (this.idville != null && !this.idville.equals(other.idville))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rdvmedecin.rdvmedecinentities.Ville[ idville=" + idville + " ]";
    }
    
}
