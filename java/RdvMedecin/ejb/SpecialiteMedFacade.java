/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.SpecialiteMed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fridel
 */
@Stateless
public class SpecialiteMedFacade extends AbstractFacade<SpecialiteMed> implements SpecialiteMedFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpecialiteMedFacade() {
        super(SpecialiteMed.class);
    }
    
    public SpecialiteMed getSpecialiteByName(String spec)
    {
        try
        {
           SpecialiteMed specMed=(SpecialiteMed) getEntityManager().createNamedQuery("SpecialiteMed.findByLibelle").setParameter("libelle",
           spec).getSingleResult(); 
           return specMed;
        }catch(Exception e)
        {
            return null;
        }    
    }
}
