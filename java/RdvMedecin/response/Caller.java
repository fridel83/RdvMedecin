/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fridel
 */
@XmlRootElement
public class Caller {

    public Caller(String WsCaller, String password) {
        this.WsCaller = WsCaller;
        this.password = password;
    }
    private String WsCaller;
    private String password;

    public Caller(String WsCaller) {
        this.WsCaller = WsCaller;
    }

    public String getWsCaller() {
        return WsCaller;
    }

    public void setWsCaller(String WsCaller) {
        this.WsCaller = WsCaller;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
