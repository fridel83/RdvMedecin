/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.response;

import RdvMedecin.entities.CabinetMedical;
import RdvMedecin.entities.Crenaux;
import RdvMedecin.entities.Medecin;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fridel
 */
@XmlRootElement
public class GetCrenauxSpecialiteResponse {
    private Crenaux crenaux;
    private Medecin medecin;
    private CabinetMedical cabinet;

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

    public CabinetMedical getCabinet() {
        return cabinet;
    }

    public void setCabinet(CabinetMedical cabinet) {
        this.cabinet = cabinet;
    }
 
}
