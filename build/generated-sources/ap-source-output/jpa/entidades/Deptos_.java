package jpa.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entidades.Municipios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T13:32:50")
@StaticMetamodel(Deptos.class)
public class Deptos_ { 

    public static volatile SingularAttribute<Deptos, String> nombDepto;
    public static volatile SingularAttribute<Deptos, Integer> iddepto;
    public static volatile ListAttribute<Deptos, Municipios> municipiosList;

}