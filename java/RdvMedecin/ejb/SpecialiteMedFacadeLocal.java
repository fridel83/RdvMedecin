/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.SpecialiteMed;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fridel
 */
@Local
public interface SpecialiteMedFacadeLocal {

    void create(SpecialiteMed specialiteMed);

    void edit(SpecialiteMed specialiteMed);

    void remove(SpecialiteMed specialiteMed);

    SpecialiteMed find(Object id);

    List<SpecialiteMed> findAll();

    List<SpecialiteMed> findRange(int[] range);

    int count();
    
}
