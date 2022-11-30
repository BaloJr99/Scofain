package misExcepciones;

public class MisExcepciones extends Exception{
    
    private int codigoError;
    
    public MisExcepciones(int codigoError){
       this.codigoError = codigoError; 
    }

    @Override
    public String getMessage() {
        String mensaje = "";
        
        switch(codigoError){
            case 1:
                mensaje = "ERROR (1) Campo Nombre vacío";
                break;
            case 2:
                mensaje = "ERROR (2) Campo Apellido Paterno vacío";
                break;
            case 3:
                mensaje = "ERROR (3) Campo Apellido Materno vacío";
                break;
            case 4:
                mensaje = "ERROR (4) Debe seleccionar el genero";
                break;
            case 5:
                mensaje = "ERROR (5) Campo Usuario vacío";
                break;
            case 6:
                mensaje = "ERROR (6) Campo Contraseña vacío";
                break;
            case 7:
                mensaje = "ERROR (7) Campo Verificar Contraseña vacío";
                break;
            case 8:
                mensaje = "ERROR (8) Las contraseñas no coinciden";
                break;                
            case 9:
                mensaje = "ERROR (9) Campo Fecha de nacimiento vacío";
                break;    
            case 10:
                mensaje = "ERROR (10) Formato de codigo incorrecto";
                break; 
            case 11:
                mensaje = "ERROR (11) Campo descripción vacío";
                break; 
            case 12:
                mensaje = "ERROR (12) Error en formato rfc";
                break; 
            case 13: 
                mensaje = "ERROR (13) Error en formato curp";
                break; 
            case 14: 
                mensaje = "ERROR (14) Campo de la fecha de alta vacío";
                break; 
            case 15: 
                mensaje = "ERROR (15) Campo de la fecha de baja vacío";
                break; 
            case 16: 
                mensaje = "ERROR (16) Error en numero de seguro";
                break;
            case 17: 
                mensaje = "ERROR (17) Favor de seleccionar un estado";
                break;
            case 18: 
                mensaje = "ERROR (18) Campo Razon Social vacío";
                break;
            case 19: 
                mensaje = "ERROR (19) Campo Calle vacío";
                break;
            case 20: 
                mensaje = "ERROR (20) Campo Numero Interior vacío";
                break;
            case 21: 
                mensaje = "ERROR (21) Campo Numero Exterior vacío";
                break;
            case 22: 
                mensaje = "ERROR (22) Campo Colonia vacío";
                break;
            case 23: 
                mensaje = "ERROR (23) Campo Codigo Postal vacío";
                break;
            case 24: 
                mensaje = "ERROR (24) Campo telefono vacío";
                break;
            case 25: 
                mensaje = "ERROR (25) Campo ciudad vacío";
                break;
            case 26: 
                mensaje = "ERROR (26) Campo fecha vacío";
                break;   
            case 27: 
                mensaje = "ERROR (27) Campo numero póliza vacío";
                break; 
            case 28: 
                mensaje = "ERROR (28) Campo cuenta vacío";
                break; 
            case 29:
                mensaje = "ERROR (29) Campos debe o haber vacío";
                break;
            case 30:
                mensaje = "ERROR (30) Campo puesto vacío";
                break;
            case 31:
                mensaje = "ERROR (31) Campo código vacío";
                break;
            case 32:
                mensaje = "ERROR (32) Campo cantidad vacío";
                break;
            case 33:
                mensaje = "ERROR (33) Campo codigoSat vacío";
                break;
            case 34:
                mensaje = "ERROR (34) Campo precio vacío";
                break;
            case 35: 
                mensaje = "ERROR (35) Seleccione un cliente";
                break;
            case 36: 
                mensaje = "ERROR (36) La cantidad no puede ser cero";
                break;
            case 37: 
                mensaje = "ERROR (37) Ingrese la clave de unidad";
                break;
            case 38:
                mensaje = "ERROR (38) Favor se seleccionar un tipo de impuesto";
                break;
            case 39:
                mensaje = "ERROR (39) Favor se seleccionar el tipo de comprobante localizado arriba a la derecha de Facturacion";
                break;
            case 40:
                mensaje = "ERROR (40) Favor ingresar el folio";
                break;
            case 41:
                mensaje = "ERROR (41) Favor de seleccionar una forma de pago";
                break;
            case 42:
                mensaje = "ERROR (42) Favor de seleccionar un uso de cfdi";
                break;
            case 43:
                mensaje = "ERROR (43) Favor de seleccionar un tipo de impuesto retenido";
                break;
            case 44:
                mensaje = "ERROR (44) Campo porcentaje vacío";
                break;
             case 45:
                mensaje = "ERROR (45) Favor de seleccionar un impuesto de la tabla";
                break;
            case 46:
                mensaje = "ERROR (46) El rango de iva retenido es de 0 a 16";
                break;
            case 47:
                mensaje = "ERROR (47) El rango de iva retenido es de 0 a 35";
                break;
            case 48:
                mensaje = "ERROR (48) El porcentaje de ieps retenido no es aplicable";
                break;
            case 49:
                mensaje = "ERROR (49) El porcentaje de iva no es aplicable";
                break;
            case 50:
                mensaje = "ERROR (50) El porcentaje de ieps trasladado no es aplicable";
                break;
            case 51:
                mensaje = "ERROR (51) El total no puede ser cero";
                break;
            case 52:
                mensaje = "ERROR (52) El IEPS retenido no puede ser mayor que el trasladado";
                break;
            case 53:
                mensaje = "ERROR (53) El IVA retenido no puede se mayor que el trasladado";
                break;
            case 54:
                mensaje = "ERROR (53) Si hay impuestos retenidos debe haber impuestos trasladados";
                break;
            case 55:
                mensaje = "ERROR (55) La tabla esta vacia";
                break;
            case 56:
                mensaje = "ERROR (56) Favor de seleccionar una fila";
                break;
            case 57:
                mensaje = "ERROR (57) No se puede modificar una factura ya generada/cancelada";
                break;
            case 58:
                mensaje = "ERROR (58) Favor de seleccionar un impuesto";
                break;
            case 59:
                mensaje = "ERROR (59) La fecha inicial no puede esta vacia";
                break;
            case 60:
                mensaje = "ERROR (60) La fecha final no puede esta vacia";
                break;
            case 61:
                mensaje = "ERROR (61) La fecha inicial no puede ser mayor que la final";
                break;
            case 62:
                mensaje = "ERROR (62) Favor de ingresar el numero de empleado";
                break;
            case 63:
                mensaje = "ERROR (63) Campo gravado y exento vacios, almenos 1 debe estar lleno";
                break;
            case 64:
                mensaje = "ERROR (64) Favor de seleccionar el tipo de importe";
                break;
            case 65:
                mensaje = "ERROR (65) Debe seleccionar almenos un empleado";
                break;
            case 66:
                mensaje = "ERROR (66) Favor de llenar la fecha de pago";
                break;
            case 67:
                mensaje = "ERROR (67) Favor de llenar la fecha inicial";
                break;
            case 68:
                mensaje = "ERROR (68) Favor de llenar la fecha final";
                break;
            case 69:
                mensaje = "ERROR (69) Favor de llenar el numero de nomina";
                break;
            case 70:
                mensaje = "ERROR (70) No se puede cancelar una nomina sin generar o ya cancelada";
                break;
            case 71:
                mensaje = "ERROR (71) No se puede generar una nomina cancelada o ya generada";
                break;
            case 72:
                mensaje = "ERROR (72) Favor de ingresar el Numero de Empleado";
                break;
            case 73:
                mensaje = "ERROR (73) No hay existencias";
                break;
            
        }
        return mensaje;
    }
}
