package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcatalogoproductosservicios;
import jpa.Tbldetallefactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblproductos.class)
public class Tblproductos_ { 

    public static volatile SingularAttribute<Tblproductos, String> descripcion;
    public static volatile SingularAttribute<Tblproductos, String> claveProducto;
    public static volatile SingularAttribute<Tblproductos, Float> precio;
    public static volatile SingularAttribute<Tblproductos, Tblcatalogoproductosservicios> tblCatalogoProductosServicioscodigo;
    public static volatile CollectionAttribute<Tblproductos, Tbldetallefactura> tbldetallefacturaCollection;
    public static volatile SingularAttribute<Tblproductos, Float> cantidad;

}