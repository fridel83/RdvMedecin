/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.ejb;

import com.rdvmedecin.rdvmedecinentities.Rdv;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicole
 */
@Local
public interface RdvFacadeLocal {

    void create(Rdv rdv);

    void edit(Rdv rdv);

    void remove(Rdv rdv);

    Rdv find(Object id);

    List<Rdv> findAll();

    List<Rdv> findRange(int[] range);

    int count();
    
}
