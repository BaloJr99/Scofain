package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldomicilio;
import jpa.Tblfactura;
import jpa.Tblregimenfiscal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblemisor.class)
public class Tblemisor_ { 

    public static volatile SingularAttribute<Tblemisor, String> correo;
    public static volatile SingularAttribute<Tblemisor, Tbldomicilio> tblDomicilioidDomicilio;
    public static volatile CollectionAttribute<Tblemisor, Tblfactura> tblfacturaCollection;
    public static volatile SingularAttribute<Tblemisor, String> telefono;
    public static volatile SingularAttribute<Tblemisor, String> rfcEmisor;
    public static volatile SingularAttribute<Tblemisor, Tblregimenfiscal> tblRegimenFiscalidRegimen;

}