/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cristhian
 */
@Entity
@Table(name = "deptos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deptos.findAll", query = "SELECT d FROM Deptos d"),
    @NamedQuery(name = "Deptos.findByIddepto", query = "SELECT d FROM Deptos d WHERE d.iddepto = :iddepto"),
    @NamedQuery(name = "Deptos.findByNombDepto", query = "SELECT d FROM Deptos d WHERE d.nombDepto = :nombDepto")})
public class Deptos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddepto")
    private Integer iddepto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombDepto")
    private String nombDepto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepto")
    private List<Municipios> municipiosList;

    public Deptos() {
    }

    public Deptos(Integer iddepto) {
        this.iddepto = iddepto;
    }

    public Deptos(Integer iddepto, String nombDepto) {
        this.iddepto = iddepto;
        this.nombDepto = nombDepto;
    }

    public Integer getIddepto() {
        return iddepto;
    }

    public void setIddepto(Integer iddepto) {
        this.iddepto = iddepto;
    }

    public String getNombDepto() {
        return nombDepto;
    }

    public void setNombDepto(String nombDepto) {
        this.nombDepto = nombDepto;
    }

    @XmlTransient
    public List<Municipios> getMunicipiosList() {
        return municipiosList;
    }

    public void setMunicipiosList(List<Municipios> municipiosList) {
        this.municipiosList = municipiosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddepto != null ? iddepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deptos)) {
            return false;
        }
        Deptos other = (Deptos) object;
        if ((this.iddepto == null && other.iddepto != null) || (this.iddepto != null && !this.iddepto.equals(other.iddepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entidades.Deptos[ iddepto=" + iddepto + " ]";
    }
    
}
