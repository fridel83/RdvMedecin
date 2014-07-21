/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.ejb;

import RdvMedecin.entities.CabinetMedical;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fridel
 */
@Local
public interface CabinetMedicalFacadeLocal {

    void create(CabinetMedical cabinetMedical);

    void edit(CabinetMedical cabinetMedical);

    void remove(CabinetMedical cabinetMedical);

    CabinetMedical find(Object id);

    List<CabinetMedical> findAll();

    List<CabinetMedical> findRange(int[] range);

    int count();
    
}
