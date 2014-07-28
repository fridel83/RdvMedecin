/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RdvMedecin.Wrapper.ResponseClass;

import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fridel
 */
@XmlRootElement
public class ResponseAbstractClass {
    private Header header;
    private BodyResponse body; 
    private static final Logger LOG = Logger.getLogger(ResponseAbstractClass.class.getName());

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public BodyResponse getBody() {
        return body;
    }

    public void setBody(BodyResponse body) {
        this.body = body;
    }

    public Caller getCaller() {
        return caller;
    }

    public void setCaller(Caller caller) {
        this.caller = caller;
    }
    private Caller caller;
}
