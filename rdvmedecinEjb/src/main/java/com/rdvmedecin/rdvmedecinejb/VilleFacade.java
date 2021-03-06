/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinejb;

import com.rdvmedecin.rdvmedecinentities.Ville;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicole
 */
@Stateless
public class VilleFacade extends AbstractFacade<Ville> implements VilleFacadeLocal {
    @PersistenceContext(unitName = "com.rdvmedecin_rdvmedecinEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VilleFacade() {
        super(Ville.class);
    }
    
}
