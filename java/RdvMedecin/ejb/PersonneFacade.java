/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.Personne;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fridel
 */
@Stateless
public class PersonneFacade extends AbstractFacade<Personne> implements PersonneFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonneFacade() {
        super(Personne.class);
    }
    
    public Personne findPersonneByNumeroSecu(Integer num_secu)
    {
        try{
            Personne personne=(Personne) getEntityManager().createNamedQuery("Personne.findByNumeroSecu").setParameter("numeroSecu",
                num_secu).getSingleResult();
            return personne;
        }catch(Exception e)
        {
            return null;
        }
    }
}
