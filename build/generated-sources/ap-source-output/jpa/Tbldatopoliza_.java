package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcatalogocuentas;
import jpa.Tblpoliza;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tbldatopoliza.class)
public class Tbldatopoliza_ { 

    public static volatile SingularAttribute<Tbldatopoliza, Float> haber;
    public static volatile SingularAttribute<Tbldatopoliza, String> idDatoPoliza;
    public static volatile SingularAttribute<Tbldatopoliza, Tblpoliza> tblPolizanumPolizaGral;
    public static volatile SingularAttribute<Tbldatopoliza, Float> debe;
    public static volatile SingularAttribute<Tbldatopoliza, Tblcatalogocuentas> tblCatalogoCuentascodigo;

}