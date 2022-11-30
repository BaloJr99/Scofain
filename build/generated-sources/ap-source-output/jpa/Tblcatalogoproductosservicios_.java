package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblproductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblcatalogoproductosservicios.class)
public class Tblcatalogoproductosservicios_ { 

    public static volatile SingularAttribute<Tblcatalogoproductosservicios, String> descripcion;
    public static volatile SingularAttribute<Tblcatalogoproductosservicios, String> codigo;
    public static volatile CollectionAttribute<Tblcatalogoproductosservicios, Tblproductos> tblproductosCollection;

}