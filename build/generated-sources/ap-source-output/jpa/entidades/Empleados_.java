package jpa.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Municipios;
import jpa.entidades.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, Integer> idempl;
    public static volatile SingularAttribute<Empleados, Date> fecnacEmpl;
    public static volatile SingularAttribute<Empleados, String> emailEmpl;
    public static volatile SingularAttribute<Empleados, String> nombEmpl;
    public static volatile SingularAttribute<Empleados, String> direcEmpl;
    public static volatile SingularAttribute<Empleados, Character> sexo;
    public static volatile ListAttribute<Empleados, Usuarios> usuariosList;
    public static volatile SingularAttribute<Empleados, String> telEmpl;
    public static volatile SingularAttribute<Empleados, Municipios> muniRes;

}