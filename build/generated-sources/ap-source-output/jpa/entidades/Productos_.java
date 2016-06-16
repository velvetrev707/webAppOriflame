package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Detallefactura;
import jpa.entidades.Marca;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Integer> stock;
    public static volatile SingularAttribute<Productos, Marca> idmarca;
    public static volatile SingularAttribute<Productos, Integer> idProducto;
    public static volatile ListAttribute<Productos, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Productos, String> nombProducto;
    public static volatile SingularAttribute<Productos, Double> preciosinIva;

}