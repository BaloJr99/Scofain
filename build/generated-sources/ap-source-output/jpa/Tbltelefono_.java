package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tbltelefono.class)
public class Tbltelefono_ { 

    public static volatile SingularAttribute<Tbltelefono, Integer> idTelefono;
    public static volatile CollectionAttribute<Tbltelefono, Tblcliente> tblclienteCollection;
    public static volatile SingularAttribute<Tbltelefono, String> telefono;

}