/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.Crenaux;
import RdvMedecin.entities.MedecinCrenaux;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author fridel
 */
@Stateless
public class CrenauxFacade extends AbstractFacade<Crenaux> implements CrenauxFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CrenauxFacade() {
        super(Crenaux.class);
    }
    
    public List<MedecinCrenaux> getCrenauxForSpecialite(String specialite)
    {
        try{
            Query q = getEntityManager().createQuery("SELECT m FROM MedecinCrenaux m inner join m.medecin n inner join n.idspecialiteMed t WHERE t.libelle = :libelle");
            q.setParameter("libelle", specialite);
            List<MedecinCrenaux> results = (List<MedecinCrenaux>) q.getResultList();
            return results;
        }catch(Exception e)
        {
            return null;
        }
    }
}
