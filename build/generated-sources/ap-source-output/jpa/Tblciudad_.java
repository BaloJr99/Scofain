package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcolonia;
import jpa.Tblestado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblciudad.class)
public class Tblciudad_ { 

    public static volatile SingularAttribute<Tblciudad, String> ciudad;
    public static volatile CollectionAttribute<Tblciudad, Tblcolonia> tblcoloniaCollection;
    public static volatile SingularAttribute<Tblciudad, Integer> idCiudad;
    public static volatile SingularAttribute<Tblciudad, Tblestado> tblEstadoidEstado;

}