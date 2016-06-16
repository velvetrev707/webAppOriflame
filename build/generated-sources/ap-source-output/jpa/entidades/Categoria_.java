package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Marca;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile ListAttribute<Categoria, Marca> marcaList;
    public static volatile SingularAttribute<Categoria, Integer> idcategoria;
    public static volatile SingularAttribute<Categoria, String> descrip;
    public static volatile SingularAttribute<Categoria, String> nombCat;

}