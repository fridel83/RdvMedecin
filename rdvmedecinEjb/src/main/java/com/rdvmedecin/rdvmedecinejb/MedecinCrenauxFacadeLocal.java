/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.rdvmedecinejb;

import com.rdvmedecin.rdvmedecinentities.MedecinCrenaux;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicole
 */
@Local
public interface MedecinCrenauxFacadeLocal {

    void create(MedecinCrenaux medecinCrenaux);

    void edit(MedecinCrenaux medecinCrenaux);

    void remove(MedecinCrenaux medecinCrenaux);

    MedecinCrenaux find(Object id);

    List<MedecinCrenaux> findAll();

    List<MedecinCrenaux> findRange(int[] range);

    int count();
    
}
