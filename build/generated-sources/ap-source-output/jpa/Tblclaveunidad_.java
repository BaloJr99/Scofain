package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldetallefactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblclaveunidad.class)
public class Tblclaveunidad_ { 

    public static volatile SingularAttribute<Tblclaveunidad, String> descripcion;
    public static volatile SingularAttribute<Tblclaveunidad, String> clave;
    public static volatile CollectionAttribute<Tblclaveunidad, Tbldetallefactura> tbldetallefacturaCollection;

}