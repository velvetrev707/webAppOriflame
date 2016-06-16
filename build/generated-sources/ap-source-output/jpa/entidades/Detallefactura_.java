package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Factura;
import jpa.entidades.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> total;
    public static volatile SingularAttribute<Detallefactura, Integer> idDetalleFact;
    public static volatile SingularAttribute<Detallefactura, Double> precioUni;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Productos> idProducto;
    public static volatile SingularAttribute<Detallefactura, Factura> idFactura;

}