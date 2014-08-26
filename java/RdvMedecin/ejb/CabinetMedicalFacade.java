/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.CabinetMedical;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fridel
 */
@Stateless
public class CabinetMedicalFacade extends AbstractFacade<CabinetMedical> implements CabinetMedicalFacadeLocal {
    @PersistenceContext(unitName = "RdvMedecinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CabinetMedicalFacade() {
        super(CabinetMedical.class);
    }
    
    public CabinetMedical getCabinetMedicalByName(String cabinet)
    {
        try
        {
            CabinetMedical cabinetMed =(CabinetMedical) getEntityManager().createNamedQuery("CabinetMedical.findByNomCabinet").setParameter("nomCabinet",
            cabinet).getSingleResult();
            return cabinetMed;
        }catch(Exception e)
        {
            return null;
        }
         
    }
    
}
