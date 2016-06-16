package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Categoria;
import jpa.entidades.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Integer> idmarca;
    public static volatile SingularAttribute<Marca, String> descrip;
    public static volatile SingularAttribute<Marca, Categoria> idcategoria;
    public static volatile SingularAttribute<Marca, String> nombMarca;
    public static volatile ListAttribute<Marca, Productos> productosList;

}