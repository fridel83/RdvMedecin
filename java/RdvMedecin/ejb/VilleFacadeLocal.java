/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.Ville;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fridel
 */
@Local
public interface VilleFacadeLocal {

    void create(Ville ville);

    void edit(Ville ville);

    void remove(Ville ville);

    Ville find(Object id);

    List<Ville> findAll();

    List<Ville> findRange(int[] range);

    int count();
    
}
