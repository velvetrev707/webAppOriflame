package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Deptos;
import jpa.entidades.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Municipios.class)
public class Municipios_ { 

    public static volatile ListAttribute<Municipios, Empleados> empleadosList;
    public static volatile SingularAttribute<Municipios, Deptos> iddepto;
    public static volatile SingularAttribute<Municipios, Integer> idmunicipio;
    public static volatile SingularAttribute<Municipios, String> nombMunicipio;

}