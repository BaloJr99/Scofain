package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblciudad;
import jpa.Tblempleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblestado.class)
public class Tblestado_ { 

    public static volatile SingularAttribute<Tblestado, Integer> idEstado;
    public static volatile SingularAttribute<Tblestado, String> estado;
    public static volatile CollectionAttribute<Tblestado, Tblciudad> tblciudadCollection;
    public static volatile CollectionAttribute<Tblestado, Tblempleado> tblempleadoCollection;

}