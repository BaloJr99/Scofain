package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblestado;
import jpa.Tblnomina;
import jpa.Tblprenomina;
import jpa.Tblusuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblempleado.class)
public class Tblempleado_ { 

    public static volatile SingularAttribute<Tblempleado, Date> fechaBaja;
    public static volatile SingularAttribute<Tblempleado, Date> fechaAlta;
    public static volatile SingularAttribute<Tblempleado, String> apellidoP;
    public static volatile CollectionAttribute<Tblempleado, Tblprenomina> tblprenominaCollection;
    public static volatile SingularAttribute<Tblempleado, String> nombre;
    public static volatile SingularAttribute<Tblempleado, String> rfc;
    public static volatile SingularAttribute<Tblempleado, String> puesto;
    public static volatile SingularAttribute<Tblempleado, Integer> idEmpleado;
    public static volatile CollectionAttribute<Tblempleado, Tblusuarios> tblusuariosCollection;
    public static volatile SingularAttribute<Tblempleado, String> numSeguro;
    public static volatile SingularAttribute<Tblempleado, String> apellidoM;
    public static volatile CollectionAttribute<Tblempleado, Tblnomina> tblnominaCollection;
    public static volatile SingularAttribute<Tblempleado, String> curp;
    public static volatile SingularAttribute<Tblempleado, Tblestado> tblEstadoidEstado;

}