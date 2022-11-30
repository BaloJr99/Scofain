package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tblempleado;
import jpa.Tbliniciossesion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblusuarios.class)
public class Tblusuarios_ { 

    public static volatile SingularAttribute<Tblusuarios, Date> fechaNacimiento;
    public static volatile SingularAttribute<Tblusuarios, String> genero;
    public static volatile SingularAttribute<Tblusuarios, String> usuario;
    public static volatile SingularAttribute<Tblusuarios, String> contrasena;
    public static volatile SingularAttribute<Tblusuarios, Tblempleado> tblEmpleadoidEmpleado;
    public static volatile CollectionAttribute<Tblusuarios, Tbliniciossesion> tbliniciossesionCollection;

}