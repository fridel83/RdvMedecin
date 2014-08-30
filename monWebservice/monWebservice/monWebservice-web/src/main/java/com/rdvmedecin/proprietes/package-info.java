// 
 // fichier package-info.java
 //
 @XmlSchema ( 
   xmlns = {
       @XmlNs(prefix="rdvmedecin", namespaceURI="http://www.rdvmedecin/webservice"),
       //@XmlNs(prefix="xsd", namespaceURI="http://www.w3.org/2001/XMLSchema")
   }, 
   namespace="http://www.rdvmedecin/webservice", 
   elementFormDefault=XmlNsForm.QUALIFIED, 
   attributeFormDefault=XmlNsForm.UNQUALIFIED
)
 package com.rdvmedecin.proprietes ;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

