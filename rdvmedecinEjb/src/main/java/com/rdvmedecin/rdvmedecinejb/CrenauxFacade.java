/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinejb;

import com.rdvmedecin.rdvmedecinentities.Crenaux;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicole
 */
@Stateless
public class CrenauxFacade extends AbstractFacade<Crenaux> implements CrenauxFacadeLocal {
    @PersistenceContext(unitName = "com.rdvmedecin_rdvmedecinEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CrenauxFacade() {
        super(Crenaux.class);
    }
    
}
