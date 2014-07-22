/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.MedecinCrenaux;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fridel
 */
@Stateless
public class MedecinCrenauxFacade extends AbstractFacade<MedecinCrenaux> implements MedecinCrenauxFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedecinCrenauxFacade() {
        super(MedecinCrenaux.class);
    }
    
}
