package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Empleados;
import jpa.entidades.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> idusuario;
    public static volatile ListAttribute<Usuarios, Factura> facturaList;
    public static volatile SingularAttribute<Usuarios, String> tipoUser;
    public static volatile SingularAttribute<Usuarios, Empleados> idEmpl;
    public static volatile SingularAttribute<Usuarios, String> password;

}