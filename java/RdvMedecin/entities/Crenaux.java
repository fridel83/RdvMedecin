/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fridel
 */
@Entity
@Table(name = "crenaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crenaux.findAll", query = "SELECT c FROM Crenaux c"),
    @NamedQuery(name = "Crenaux.findByIdcrenaux", query = "SELECT c FROM Crenaux c WHERE c.idcrenaux = :idcrenaux"),
    @NamedQuery(name = "Crenaux.findByDate", query = "SELECT c FROM Crenaux c WHERE c.date = :date"),
    @NamedQuery(name = "Crenaux.findByHeureDebut", query = "SELECT c FROM Crenaux c WHERE c.heureDebut = :heureDebut"),
    @NamedQuery(name = "Crenaux.findByHeureFin", query = "SELECT c FROM Crenaux c WHERE c.heureFin = :heureFin")})
public class Crenaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcrenaux")
    @XmlTransient 
    private Integer idcrenaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_debut")
    @Temporal(TemporalType.TIME)
    private Date heureDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_fin")
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "crenaux")
    private Collection<MedecinCrenaux> medecinCrenauxCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcrenaux")
    private Collection<Rdv> rdvCollection;

    public Crenaux() {
    }

    public Crenaux(Integer idcrenaux) {
        this.idcrenaux = idcrenaux;
    }

    public Crenaux(Integer idcrenaux, Date date, Date heureDebut, Date heureFin) {
        this.idcrenaux = idcrenaux;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    @XmlTransient
    public Integer getIdcrenaux() {
        return idcrenaux;
    }

    public void setIdcrenaux(Integer idcrenaux) {
        this.idcrenaux = idcrenaux;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcrenaux != null ? idcrenaux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crenaux)) {
            return false;
        }
        Crenaux other = (Crenaux) object;
        if ((this.idcrenaux == null && other.idcrenaux != null) || (this.idcrenaux != null && !this.idcrenaux.equals(other.idcrenaux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RdvMedecin.entities.Crenaux[ idcrenaux=" + idcrenaux + " ]";
    }
    
}
