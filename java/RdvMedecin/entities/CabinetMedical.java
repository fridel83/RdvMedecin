/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fridel
 */
@Entity
@Table(name = "cabinet_medical")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CabinetMedical.findAll", query = "SELECT c FROM CabinetMedical c"),
    @NamedQuery(name = "CabinetMedical.findByIdcabinetMedical", query = "SELECT c FROM CabinetMedical c WHERE c.idcabinetMedical = :idcabinetMedical"),
    @NamedQuery(name = "CabinetMedical.findByAdresseCabinet", query = "SELECT c FROM CabinetMedical c WHERE c.adresseCabinet = :adresseCabinet"),
    @NamedQuery(name = "CabinetMedical.findByTelephoneCabinet", query = "SELECT c FROM CabinetMedical c WHERE c.telephoneCabinet = :telephoneCabinet"),
    @NamedQuery(name = "CabinetMedical.findByCerfa", query = "SELECT c FROM CabinetMedical c WHERE c.cerfa = :cerfa"),
    @NamedQuery(name = "CabinetMedical.findByNomCabinet", query = "SELECT c FROM CabinetMedical c WHERE c.nomCabinet = :nomCabinet")})
public class CabinetMedical implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcabinet_medical")
    @XmlTransient
    private Integer idcabinetMedical;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "adresse_cabinet")
    private String adresseCabinet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telephone_cabinet")
    private String telephoneCabinet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cerfa")
    private String cerfa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nom_cabinet")
    private String nomCabinet;
    @JoinColumn(name = "ville_idville", referencedColumnName = "idville")
    @ManyToOne(optional = false)
    private Ville villeIdville;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcabinetMedical")
    private Collection<Medecin> medecinCollection;

    public CabinetMedical() {
    }

    public CabinetMedical(Integer idcabinetMedical) {
        this.idcabinetMedical = idcabinetMedical;
    }

    public CabinetMedical(Integer idcabinetMedical, String adresseCabinet, String telephoneCabinet, String cerfa, String nomCabinet) {
        this.idcabinetMedical = idcabinetMedical;
        this.adresseCabinet = adresseCabinet;
        this.telephoneCabinet = telephoneCabinet;
        this.cerfa = cerfa;
        this.nomCabinet = nomCabinet;
    }

    @XmlTransient
    public Integer getIdcabinetMedical() {
        return idcabinetMedical;
    }

    public void setIdcabinetMedical(Integer idcabinetMedical) {
        this.idcabinetMedical = idcabinetMedical;
    }

    public String getAdresseCabinet() {
        return adresseCabinet;
    }

    public void setAdresseCabinet(String adresseCabinet) {
        this.adresseCabinet = adresseCabinet;
    }

    public String getTelephoneCabinet() {
        return telephoneCabinet;
    }

    public void setTelephoneCabinet(String telephoneCabinet) {
        this.telephoneCabinet = telephoneCabinet;
    }

    @XmlTransient
    public String getCerfa() {
        return cerfa;
    }

    public void setCerfa(String cerfa) {
        this.cerfa = cerfa;
    }

    public String getNomCabinet() {
        return nomCabinet;
    }

    public void setNomCabinet(String nomCabinet) {
        this.nomCabinet = nomCabinet;
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
        hash += (idcabinetMedical != null ? idcabinetMedical.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabinetMedical)) {
            return false;
        }
        CabinetMedical other = (CabinetMedical) object;
        if ((this.idcabinetMedical == null && other.idcabinetMedical != null) || (this.idcabinetMedical != null && !this.idcabinetMedical.equals(other.idcabinetMedical))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RdvMedecin.entities.CabinetMedical[ idcabinetMedical=" + idcabinetMedical + " ]";
    }
    
}
