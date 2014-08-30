/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rdvmedecin.proprietes;

import com.rdvmedecin.response.ReturnCode;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;

/**
 *
 * @author nicole
 */
public class Properties {
    
    private String[] prop;
    private ReturnCode return_code;
    private String[] Caller;
    //SAXReader reader =  new SAXReader() ;
    
    public Properties() throws DocumentException
    {
        File fichier =  new File("configuration.xml") ;
        SAXReader reader =  new SAXReader() ;
        Document doc = reader.read(fichier) ;
        Element root = doc.getRootElement() ;
        List attributes = root.attributes() ;
        List elements = root.elements() ;
        QName qName = root.getQName() ;
        String nom = qName.getName() ; 
        // lecture du nom de l'espace de noms
        String nomEspaceDeNoms = qName.getNamespaceURI() ;
        // lecture du préfixe utilisé pour cet espace de nom 
        String nomPrefix = qName.getNamespacePrefix() ; 
        String texte = root.getText() ; 
        Attribute attribute = (Attribute)attributes.iterator().next() ; 
        QName attributeQName = attribute.getQName() ; 
        String value = attribute.getValue() ;
        String nomAttribut = attribute.getName() ;
    }

    public String[] getProp() {
        return prop;
    }

    public void setProp(String[] prop) {
        this.prop = prop;
    }

    public ReturnCode getReturn_code() {
        return return_code;
    }

    public void setReturn_code(ReturnCode return_code) {
        this.return_code = return_code;
    }

    public String[] getCaller() {
        return Caller;
    }

    public void setCaller(String[] Caller) {
        this.Caller = Caller;
    }

   public static void main(String args[]) throws DocumentException 
   {
        File fichier =  new File("../../configuration.xml") ;
        SAXReader reader =  new SAXReader() ;
        Document doc = reader.read(fichier) ;
        Element root = doc.addElement( "root" );
        /*
        Element author2 = root.addElement( "author" )
            .addAttribute( "id", "Toby" ).addAttribute( "location", "Germany" )
            .addText( "Tobias Rademacher" );
        Element author1 = root.addElement( "author" )
            .addAttribute( "id", "James" ).addAttribute( "location", "UK" )
            .addText( "James Strachan" );
        */
        List results = doc.selectNodes("//author[@location = 'UK']");
        for ( Iterator iter = results.iterator(); iter.hasNext(); ) 
        {
            Element element = (Element) iter.next();
            System.out.println(element.valueOf("concat(@id,' : ', .)"));
        }
    }
}
