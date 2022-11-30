package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldatopoliza;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblpoliza.class)
public class Tblpoliza_ { 

    public static volatile SingularAttribute<Tblpoliza, Date> fecha;
    public static volatile SingularAttribute<Tblpoliza, String> numPoliza;
    public static volatile CollectionAttribute<Tblpoliza, Tbldatopoliza> tbldatopolizaCollection;
    public static volatile SingularAttribute<Tblpoliza, String> concepto;
    public static volatile SingularAttribute<Tblpoliza, String> numPolizaGral;

}