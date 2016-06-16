package jpa.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile ListAttribute<Cliente, Factura> facturaList;
    public static volatile SingularAttribute<Cliente, String> emailClient;
    public static volatile SingularAttribute<Cliente, String> direccliente;
    public static volatile SingularAttribute<Cliente, Date> fecnacClient;
    public static volatile SingularAttribute<Cliente, String> duicliente;
    public static volatile SingularAttribute<Cliente, String> nomcliente;
    public static volatile SingularAttribute<Cliente, String> telCliente;

}