package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcatalogocuentas;
import jpa.Tblempleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblprenomina.class)
public class Tblprenomina_ { 

    public static volatile SingularAttribute<Tblprenomina, String> tipo;
    public static volatile SingularAttribute<Tblprenomina, Float> exento;
    public static volatile SingularAttribute<Tblprenomina, Float> gravado;
    public static volatile SingularAttribute<Tblprenomina, Tblcatalogocuentas> tblCatalogoCuentascodigo;
    public static volatile SingularAttribute<Tblprenomina, Tblempleado> tblEmpleadoidEmpleado;
    public static volatile SingularAttribute<Tblprenomina, String> idDetalleP;

}