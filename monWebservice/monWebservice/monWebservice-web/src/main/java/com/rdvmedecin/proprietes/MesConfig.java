/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.proprietes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author nicole
 */
public class MesConfig {
    private String caller1;
    private String caller2;
    private String error_caller;

    public MesConfig(String configFile) {
        Properties properties=new Properties();
        try{
          FileInputStream fis= new FileInputStream(configFile);
          properties.load(fis);
          fis.close();
        }catch(IOException e)
        {
            System.out.println("Unable to load config file.");
            System.out.println(e.toString());
        }
        caller1=properties.getProperty("WebServiceCaller1");
        caller2=properties.getProperty("WebServiceCaller2");
        error_caller=properties.getProperty("ERROR_CALLER");
    }
    
    public String getCaller1() {
        return caller1;
    }

    public void setCaller1(String caller1) {
        this.caller1 = caller1;
    }

    public String getCaller2() {
        return caller2;
    }

    public void setCaller2(String caller2) {
        this.caller2 = caller2;
    }

    public String getError_caller() {
        return error_caller;
    }

    public void setError_caller(String error_caller) {
        this.error_caller = error_caller;
    }
    
}
