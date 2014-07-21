/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.Crenaux;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fridel
 */
@Local
public interface CrenauxFacadeLocal {

    void create(Crenaux crenaux);

    void edit(Crenaux crenaux);

    void remove(Crenaux crenaux);

    Crenaux find(Object id);

    List<Crenaux> findAll();

    List<Crenaux> findRange(int[] range);

    int count();
    
}
