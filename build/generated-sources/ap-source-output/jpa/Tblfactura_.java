package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.Tbldetallefactura;
import jpa.Tblemisor;
import jpa.Tblformapago;
import jpa.Tblmetodopago;
import jpa.Tblreceptor;
import jpa.Tbltipocomprobante;
import jpa.Tblusocfdi;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-05T11:39:54")
@StaticMetamodel(Tblfactura.class)
public class Tblfactura_ { 

    public static volatile SingularAttribute<Tblfactura, Tblemisor> tblEmisorrfcEmisor;
    public static volatile SingularAttribute<Tblfactura, Tblreceptor> tblReceptorrfcReceptor;
    public static volatile SingularAttribute<Tblfactura, Tblmetodopago> tblMetodoPagoidMetodoPago;
    public static volatile SingularAttribute<Tblfactura, Tblusocfdi> tblusoCFDIclave;
    public static volatile CollectionAttribute<Tblfactura, Tbldetallefactura> tbldetallefacturaCollection;
    public static volatile SingularAttribute<Tblfactura, Tblformapago> tblFormaPagoidFormaPago;
    public static volatile SingularAttribute<Tblfactura, String> estadoFactura;
    public static volatile SingularAttribute<Tblfactura, Integer> folio;
    public static volatile SingularAttribute<Tblfactura, Date> fechaEmision;
    public static volatile SingularAttribute<Tblfactura, Tbltipocomprobante> tbltipoComprobanteclave;

}