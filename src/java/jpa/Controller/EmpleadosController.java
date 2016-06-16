/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.Controller;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import jpa.beans.DepartamentoFacade;
import jpa.beans.EmpleadosFacade;
import jpa.beans.MunicipiosFacade;
import jpa.entidades.Deptos;
import jpa.entidades.Empleados;
import jpa.entidades.Municipios;

/**
 *
 * @author criscas
 */
@ViewScoped
@ManagedBean(name = "empleadosController")
public class EmpleadosController extends AbstractController implements Serializable {

    @EJB
    private EmpleadosFacade empleadosFacade;
    @EJB
    private MunicipiosFacade municipiosFacade;
    @EJB
    private DepartamentoFacade departamentoFacade;

    private Empleados empleado;
    private Deptos depto;

    private List<Empleados> empleados;
    private List<Municipios> municipios;
    private List<Deptos> deptos;
    private String action = "CREATE";

    @PostConstruct
    protected void inicializar() {
        clearForm();
    }

    public String createEmpleados() {
        try {
            empleadosFacade.create(empleado);
            addInfo("Informacion", "Datos guardados exitosamente");
            clearForm();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al guardar datos:", e);
            addWarn("Error", "No se han podido guardar los datos");
        }
        return null;
    }

    public String updateEmpleados() {
        try {
            empleadosFacade.update(empleado);
            addInfo("Informacion", "Datos actualizados exitosamente");
            clearForm();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al actualizar datos:", e);
            addWarn("Error", "No se han podido actualizar los datos");
        }
        return null;
    }

    public String deleteEmpleados() {
        try {
            empleadosFacade.delete(empleado);
            addInfo("Informacion", "Datos borrados exitosamente");
            empleados = empleadosFacade.findAll();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error al borrar datos:", e);
            addWarn("Error", "No se han podido borrar los datos");
        }
        return null;
    }

    public void clearForm() {
        empleado = new Empleados();

        Municipios municipio = new Municipios();
        municipio.setIddepto(new Deptos());
        empleado.setMuniRes(municipio);
        empleados = empleadosFacade.findAll();
        deptos = departamentoFacade.findAll();
        setAction("CREATE");
    }

    public void findAllEmpleados() {
        empleados = empleadosFacade.findAll();
    }

    public void editMode() {
        setAction("EDIT");
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados> empleados) {
        this.empleados = empleados;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public List<Municipios> getMunicipios() {
        if (empleado.getMuniRes().getIddepto().getIddepto() != null) {
            municipios = municipiosFacade.findByCodDepto(empleado.getMuniRes().getIddepto().getIddepto());
        }
        return municipios;
    }

    public void setMunicipios(List<Municipios> municipios) {
        this.municipios = municipios;
    }

    public List<Deptos> getDeptos() {
        return deptos;
    }

    public void setDeptos(List<Deptos> deptos) {
        this.deptos = deptos;
    }

    public Deptos getDepto() {
        return depto;
    }

    public void setDepto(Deptos depto) {
        this.depto = depto;
    }
}
