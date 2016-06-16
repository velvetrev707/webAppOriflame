package jpa.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Cliente;
import jpa.entidades.Detallefactura;
import jpa.entidades.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Double> total;
    public static volatile SingularAttribute<Factura, Date> fecIngreso;
    public static volatile SingularAttribute<Factura, Usuarios> idusuario;
    public static volatile SingularAttribute<Factura, Cliente> idCliente;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Integer> idFactura;

}