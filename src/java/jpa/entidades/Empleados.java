/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cristhian
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByIdempl", query = "SELECT e FROM Empleados e WHERE e.idempl = :idempl"),
    @NamedQuery(name = "Empleados.findByNombEmpl", query = "SELECT e FROM Empleados e WHERE e.nombEmpl = :nombEmpl"),
    @NamedQuery(name = "Empleados.findByDirecEmpl", query = "SELECT e FROM Empleados e WHERE e.direcEmpl = :direcEmpl"),
    @NamedQuery(name = "Empleados.findByTelEmpl", query = "SELECT e FROM Empleados e WHERE e.telEmpl = :telEmpl"),
    @NamedQuery(name = "Empleados.findByFecnacEmpl", query = "SELECT e FROM Empleados e WHERE e.fecnacEmpl = :fecnacEmpl"),
    @NamedQuery(name = "Empleados.findByEmailEmpl", query = "SELECT e FROM Empleados e WHERE e.emailEmpl = :emailEmpl"),
    @NamedQuery(name = "Empleados.findBySexo", query = "SELECT e FROM Empleados e WHERE e.sexo = :sexo")})
public class Empleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idempl")
    private Integer idempl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "nombEmpl")
    private String nombEmpl;
    @Size(max = 500)
    @Column(name = "direcEmpl")
    private String direcEmpl;
    @Size(max = 9)
    @Column(name = "telEmpl")
    private String telEmpl;
    @Column(name = "fecnacEmpl")
    @Temporal(TemporalType.DATE)
    private Date fecnacEmpl;
    @Size(max = 200)
    @Column(name = "emailEmpl")
    private String emailEmpl;
    @Column(name = "sexo")
    private Character sexo;
    @JoinColumn(name = "muniRes", referencedColumnName = "idmunicipio")
    @ManyToOne
    private Municipios muniRes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private List<Usuarios> usuariosList;

    public Empleados() {
    }

    public Empleados(Integer idempl) {
        this.idempl = idempl;
    }

    public Empleados(Integer idempl, String nombEmpl) {
        this.idempl = idempl;
        this.nombEmpl = nombEmpl;
    }

    public Integer getIdempl() {
        return idempl;
    }

    public void setIdempl(Integer idempl) {
        this.idempl = idempl;
    }

    public String getNombEmpl() {
        return nombEmpl;
    }

    public void setNombEmpl(String nombEmpl) {
        this.nombEmpl = nombEmpl;
    }

    public String getDirecEmpl() {
        return direcEmpl;
    }

    public void setDirecEmpl(String direcEmpl) {
        this.direcEmpl = direcEmpl;
    }

    public String getTelEmpl() {
        return telEmpl;
    }

    public void setTelEmpl(String telEmpl) {
        this.telEmpl = telEmpl;
    }

    public Date getFecnacEmpl() {
        return fecnacEmpl;
    }

    public void setFecnacEmpl(Date fecnacEmpl) {
        this.fecnacEmpl = fecnacEmpl;
    }

    public String getEmailEmpl() {
        return emailEmpl;
    }

    public void setEmailEmpl(String emailEmpl) {
        this.emailEmpl = emailEmpl;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Municipios getMuniRes() {
        return muniRes;
    }

    public void setMuniRes(Municipios muniRes) {
        this.muniRes = muniRes;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempl != null ? idempl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idempl == null && other.idempl != null) || (this.idempl != null && !this.idempl.equals(other.idempl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entidades.Empleados[ idempl=" + idempl + " ]";
    }
    
}
