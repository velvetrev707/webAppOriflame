/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import jpa.beans.ClienteFacade;
import jpa.entidades.Cliente;

/**
 *
 * @author criscas
 */
 @ViewScoped
 @ManagedBean(name="clienteController")
public class ClienteController extends AbstractController implements Serializable{
    
   @EJB
   private ClienteFacade clienteFacade;
   
   private Cliente cliente;
   private List<Cliente> clientes;
   private String action = "CREATE";
   Calendar fecha = new GregorianCalendar();
   private int vyear;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
   
  
   
   @PostConstruct
   public void inicializar()
   {
       cliente = new Cliente();
       setAction("CREATE");
       vYear();
   }
   
   public String guardarClientes()
   {
       try {
           clienteFacade.create(cliente);
           addInfo("Información", "Datos guardados");
           setCliente(new Cliente());         
       } catch (Exception e) {
           LOGGER.log(Level.SEVERE,"Error al guardar",e);
           addError("Error", "No se pudieron guardar los datos");
       }
       
       return null;
   }
   
    public String updateClientes()
   {
       try {
           clienteFacade.update(cliente);
           addInfo("Información", "Datos Actualizados"); 
           setCliente(new Cliente()); 
       } catch (Exception e) {
           LOGGER.log(Level.SEVERE,"Error al Actualizar",e);
           addError("Error", "No se pudieron Actualizar los datos");
       }
       
       return null;
   }
   
    public String deleteClientes() {
        try {
            clienteFacade.delete(cliente);
            addInfo("Informacion", "Datos eliminados exitosamente");
            clientes = clienteFacade.findAll();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al eliminar datos:", e);
            addWarn("Error", "No se han podido eliminar los datos");
        }
        return null;
    }

    
      public void editMode() {
        setAction("EDIT");
    }

          public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    public void findAllClientes() {
        clientes = clienteFacade.findAll();
    }
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getVyear() {
        return vyear;
    }

    public void setVyear(int vyear) {
        this.vyear = vyear;
    }
    
       
      public String vYear() {
      vyear = fecha.get(Calendar.YEAR);
      return "";
    }
}
