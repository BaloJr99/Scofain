package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblfactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblmetodopago.class)
public class Tblmetodopago_ { 

    public static volatile SingularAttribute<Tblmetodopago, String> tipoMetodo;
    public static volatile CollectionAttribute<Tblmetodopago, Tblfactura> tblfacturaCollection;
    public static volatile SingularAttribute<Tblmetodopago, String> idMetodoPago;

}