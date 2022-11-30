package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblciudad;
import jpa.Tbldomicilio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblcolonia.class)
public class Tblcolonia_ { 

    public static volatile SingularAttribute<Tblcolonia, String> codigoPostal;
    public static volatile SingularAttribute<Tblcolonia, Tblciudad> tblCiudadidCiudad;
    public static volatile SingularAttribute<Tblcolonia, String> colonia;
    public static volatile CollectionAttribute<Tblcolonia, Tbldomicilio> tbldomicilioCollection;

}