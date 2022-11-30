package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldomicilio;
import jpa.Tblreceptor;
import jpa.Tbltelefono;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblcliente.class)
public class Tblcliente_ { 

    public static volatile SingularAttribute<Tblcliente, Tblreceptor> tblReceptorrfcReceptor;
    public static volatile SingularAttribute<Tblcliente, String> razonSocial;
    public static volatile SingularAttribute<Tblcliente, Integer> idCliente;
    public static volatile SingularAttribute<Tblcliente, Tbldomicilio> tblDomicilioidDomicilio;
    public static volatile SingularAttribute<Tblcliente, Tbltelefono> tblTelefonoidTelefono;

}