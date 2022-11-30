package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblimpuestos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblimpuestostrasladados.class)
public class Tblimpuestostrasladados_ { 

    public static volatile SingularAttribute<Tblimpuestostrasladados, String> tipo;
    public static volatile CollectionAttribute<Tblimpuestostrasladados, Tblimpuestos> tblimpuestosCollection;
    public static volatile SingularAttribute<Tblimpuestostrasladados, Integer> idTrasladados;
    public static volatile SingularAttribute<Tblimpuestostrasladados, Float> porcentaje;

}