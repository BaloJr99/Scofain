package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblempleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblnomina.class)
public class Tblnomina_ { 

    public static volatile SingularAttribute<Tblnomina, Date> fechaInicial;
    public static volatile SingularAttribute<Tblnomina, String> estado;
    public static volatile SingularAttribute<Tblnomina, Float> otros;
    public static volatile SingularAttribute<Tblnomina, String> idNomina;
    public static volatile SingularAttribute<Tblnomina, Date> fechaFinal;
    public static volatile SingularAttribute<Tblnomina, Float> deducciones;
    public static volatile SingularAttribute<Tblnomina, Tblempleado> tblEmpleadoidEmpleado;
    public static volatile SingularAttribute<Tblnomina, Date> fechaPago;
    public static volatile SingularAttribute<Tblnomina, Float> percepciones;

}