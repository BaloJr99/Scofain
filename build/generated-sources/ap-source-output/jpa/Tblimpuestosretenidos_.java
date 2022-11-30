package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblimpuestos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblimpuestosretenidos.class)
public class Tblimpuestosretenidos_ { 

    public static volatile SingularAttribute<Tblimpuestosretenidos, String> tipo;
    public static volatile CollectionAttribute<Tblimpuestosretenidos, Tblimpuestos> tblimpuestosCollection;
    public static volatile SingularAttribute<Tblimpuestosretenidos, Integer> idRetenidos;
    public static volatile SingularAttribute<Tblimpuestosretenidos, Float> porcentaje;

}