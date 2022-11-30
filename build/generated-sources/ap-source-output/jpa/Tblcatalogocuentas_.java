package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldatopoliza;
import jpa.Tblprenomina;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblcatalogocuentas.class)
public class Tblcatalogocuentas_ { 

    public static volatile SingularAttribute<Tblcatalogocuentas, String> descripcion;
    public static volatile SingularAttribute<Tblcatalogocuentas, String> codigo;
    public static volatile CollectionAttribute<Tblcatalogocuentas, Tbldatopoliza> tbldatopolizaCollection;
    public static volatile CollectionAttribute<Tblcatalogocuentas, Tblprenomina> tblprenominaCollection;

}