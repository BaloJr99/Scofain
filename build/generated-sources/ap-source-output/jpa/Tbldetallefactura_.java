package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblclaveunidad;
import jpa.Tblfactura;
import jpa.Tblimpuestos;
import jpa.Tblproductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tbldetallefactura.class)
public class Tbldetallefactura_ { 

    public static volatile SingularAttribute<Tbldetallefactura, Tblproductos> tblproductosclaveProducto;
    public static volatile SingularAttribute<Tbldetallefactura, String> idDetalle;
    public static volatile SingularAttribute<Tbldetallefactura, Tblclaveunidad> tblclaveUnidadclave;
    public static volatile SingularAttribute<Tbldetallefactura, Tblimpuestos> tblImpuestosidImpuesto;
    public static volatile SingularAttribute<Tbldetallefactura, Tblfactura> tblFacturafolio;
    public static volatile SingularAttribute<Tbldetallefactura, Float> cantidad;
    public static volatile SingularAttribute<Tbldetallefactura, Float> importe;

}