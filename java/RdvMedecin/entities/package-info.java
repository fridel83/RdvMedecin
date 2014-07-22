@XmlSchema ( 
   xmlns = {
       @XmlNs(prefix="SP", namespaceURI="http://localhost:8080/RdvMedecin"),
       @XmlNs(prefix="xsd", namespaceURI="http://www.w3.org/2001/XMLSchema")
   }, 
   namespace="http://localhost:8080/RdvMedecin", 
   elementFormDefault=XmlNsForm.QUALIFIED, 
   attributeFormDefault=XmlNsForm.UNQUALIFIED
)
 package RdvMedecin.entities ;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

