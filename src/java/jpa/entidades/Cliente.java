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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdcliente", query = "SELECT c FROM Cliente c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cliente.findByDuicliente", query = "SELECT c FROM Cliente c WHERE c.duicliente = :duicliente"),
    @NamedQuery(name = "Cliente.findByNomcliente", query = "SELECT c FROM Cliente c WHERE c.nomcliente = :nomcliente"),
    @NamedQuery(name = "Cliente.findByDireccliente", query = "SELECT c FROM Cliente c WHERE c.direccliente = :direccliente"),
    @NamedQuery(name = "Cliente.findByFecnacClient", query = "SELECT c FROM Cliente c WHERE c.fecnacClient = :fecnacClient"),
    @NamedQuery(name = "Cliente.findByTelCliente", query = "SELECT c FROM Cliente c WHERE c.telCliente = :telCliente"),
    @NamedQuery(name = "Cliente.findByEmailClient", query = "SELECT c FROM Cliente c WHERE c.emailClient = :emailClient")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcliente")
    private Integer idcliente;
    @Size(max = 10)
    @Column(name = "duicliente")
    private String duicliente;
    @Size(max = 250)
    @Column(name = "nomcliente")
    private String nomcliente;
    @Size(max = 500)
    @Column(name = "direccliente")
    private String direccliente;
    @Column(name = "fecnacClient")
    @Temporal(TemporalType.DATE)
    private Date fecnacClient;
    @Size(max = 9)
    @Column(name = "telCliente")
    private String telCliente;
    @Size(max = 200)
    @Column(name = "emailClient")
    private String emailClient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<Factura> facturaList;

    public Cliente() {
    }

    public Cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getDuicliente() {
        return duicliente;
    }

    public void setDuicliente(String duicliente) {
        this.duicliente = duicliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getDireccliente() {
        return direccliente;
    }

    public void setDireccliente(String direccliente) {
        this.direccliente = direccliente;
    }

    public Date getFecnacClient() {
        return fecnacClient;
    }

    public void setFecnacClient(Date fecnacClient) {
        this.fecnacClient = fecnacClient;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entidades.Cliente[ idcliente=" + idcliente + " ]";
    }
    
}
