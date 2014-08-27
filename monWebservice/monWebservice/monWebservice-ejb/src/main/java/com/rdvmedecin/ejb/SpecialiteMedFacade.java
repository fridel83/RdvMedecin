/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.ejb;

import com.rdvmedecin.rdvmedecinentities.SpecialiteMed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicole
 */
@Stateless
public class SpecialiteMedFacade extends AbstractFacade<SpecialiteMed> implements SpecialiteMedFacadeLocal {
    @PersistenceContext(unitName = "com.rdvmedecin_monWebservice-ejb_ejb_1.2-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpecialiteMedFacade() {
        super(SpecialiteMed.class);
    }
    
}
