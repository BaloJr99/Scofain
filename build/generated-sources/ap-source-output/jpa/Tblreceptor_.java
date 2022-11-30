package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcliente;
import jpa.Tblfactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblreceptor.class)
public class Tblreceptor_ { 

    public static volatile SingularAttribute<Tblreceptor, String> rfcReceptor;
    public static volatile CollectionAttribute<Tblreceptor, Tblfactura> tblfacturaCollection;
    public static volatile CollectionAttribute<Tblreceptor, Tblcliente> tblclienteCollection;

}