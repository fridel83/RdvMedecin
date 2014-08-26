/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.Ville;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fridel
 */
@Stateless
public class VilleFacade extends AbstractFacade<Ville> implements VilleFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VilleFacade() {
        super(Ville.class);
    }
    
    public Ville getVilleByCodePostal(String code_postal)
    {
        try
        {
           Ville ville=(Ville) getEntityManager().createNamedQuery("Ville.findByVilleCodePostal").setParameter("villeCodePostal",
                code_postal).getSingleResult(); 
           return ville;
        }catch(Exception e){
            return null;
        }   
    }
}
