package ru.javastudy.mvcHtml5Angular.mvc.bean;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by belstrel on 09.10.17.
 */
public class DBLog implements Serializable {

    private static final long serialVersionUID=1L;
    private int IDLOG;
    private String LOGSTRING;

    public DBLog(){}

    public DBLog (int idLog, String logString) {
        this.IDLOG = idLog;
        this.LOGSTRING = logString;
    }

    public int getIDLOG() {
        return IDLOG;
    }
    @XmlElement
    public void setIDLOG(int IDLOG) {
        this.IDLOG = IDLOG;
    }

    public String getLOGSTRING() {
        return LOGSTRING;
    }

    @XmlElement
    public void setLOGSTRING(String LOGSTRING) {
        this.LOGSTRING = LOGSTRING;
    }
}
