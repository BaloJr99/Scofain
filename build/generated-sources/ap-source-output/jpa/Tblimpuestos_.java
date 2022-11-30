package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldetallefactura;
import jpa.Tblimpuestosretenidos;
import jpa.Tblimpuestostrasladados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblimpuestos.class)
public class Tblimpuestos_ { 

    public static volatile SingularAttribute<Tblimpuestos, Boolean> exento;
    public static volatile CollectionAttribute<Tblimpuestos, Tbldetallefactura> tbldetallefacturaCollection;
    public static volatile SingularAttribute<Tblimpuestos, Tblimpuestostrasladados> tblImpuestosTrasladadosidTrasladados;
    public static volatile SingularAttribute<Tblimpuestos, Integer> idImpuesto;
    public static volatile SingularAttribute<Tblimpuestos, Tblimpuestosretenidos> tblImpuestosRetenidosidRetenidos;

}