package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblcliente;
import jpa.Tblcolonia;
import jpa.Tblemisor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tbldomicilio.class)
public class Tbldomicilio_ { 

    public static volatile SingularAttribute<Tbldomicilio, String> calle;
    public static volatile CollectionAttribute<Tbldomicilio, Tblemisor> tblemisorCollection;
    public static volatile SingularAttribute<Tbldomicilio, Tblcolonia> tblColoniacodigoPostal;
    public static volatile SingularAttribute<Tbldomicilio, String> numeroExterior;
    public static volatile SingularAttribute<Tbldomicilio, String> numeroInterior;
    public static volatile CollectionAttribute<Tbldomicilio, Tblcliente> tblclienteCollection;
    public static volatile SingularAttribute<Tbldomicilio, Integer> idDomicilio;

}