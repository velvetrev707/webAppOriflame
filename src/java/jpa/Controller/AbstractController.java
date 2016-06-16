/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.Controller;

import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Gabriel Bran <gbran@promerica.com.sv>
 */
public abstract class AbstractController {

    protected static final Logger LOGGER = Logger.getLogger(AbstractController.class.getName());

    public void addMessage(String title, String message, FacesMessage.Severity severity) {
        getFacesContext().addMessage(null, new FacesMessage(severity, title, message));
    }

    public void addInfo(String title, String message) {
        addMessage(title, message, FacesMessage.SEVERITY_INFO);
    }

    public void addError(String title, String message) {
        addMessage(title, message, FacesMessage.SEVERITY_ERROR);
    }

    public void addWarn(String title, String message) {
        addMessage(title, message, FacesMessage.SEVERITY_WARN);
    }

    public FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }
}
