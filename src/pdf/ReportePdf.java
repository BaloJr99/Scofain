package pdf;

import cl.model.db.Empleado;
import cl.model.db.Factura;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import dialogos.Consultas;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ReportePdf {
    
    ArrayList<Consultas> listaconsulta = null;
    ArrayList<Empleado> listaempleado = null;
    ArrayList<Factura> listafactura = null;
    
    //DES es la direccion del archivo
    //Titulo es el titulo del documento
    //Tipo es si es auxiliar, balanza, empleado o factura
    //Datos es el arraylist de los datos
    public void generarReporte(String DES, String titulo, String tipo, ArrayList datos) throws SQLException, FileNotFoundException, IOException{
        
        try {
            PdfWriter writer = new PdfWriter(DES);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf, PageSize.LETTER);
            EventoPdf evento = new EventoPdf(document, titulo);
            pdf.addEventHandler(PdfDocumentEvent.END_PAGE, evento);

            document.setMargins(20, 20, 20, 20);

            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfFont bold = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            
            String tituloTabla[] = null;
            float[] anchoColumn = null;
            
            //Encabezado tabla
            if(tipo.equals("auxiliar")){
                tituloTabla = new String[4];
                anchoColumn = new float[4];
                tituloTabla[0] = "Poliza";
                tituloTabla[1] = "Descripcion";
                tituloTabla[2] = "Debe";
                tituloTabla[3] = "Haber";
                anchoColumn[0] = 3;
                anchoColumn[1] = 3;
                anchoColumn[2] = 2;
                anchoColumn[3] = 2;
            }else if(tipo.equals("balanza")){
                tituloTabla = new String[4];
                anchoColumn = new float[4];
                tituloTabla[0] = "Cuenta";
                tituloTabla[1] = "Descripcion";
                tituloTabla[2] = "Debe";
                tituloTabla[3] = "Haber";
                anchoColumn[0] = 3;
                anchoColumn[1] = 3;
                anchoColumn[2] = 2;
                anchoColumn[3] = 2;
            }else if(tipo.equals("empleados")){
                tituloTabla = new String[5];
                anchoColumn = new float[5];
                tituloTabla[0] = "IdEmpleado";
                tituloTabla[1] = "Nombre";
                tituloTabla[2] = "Apellido P";
                tituloTabla[3] = "Apellido M";
                tituloTabla[4] = "Puesto";
                anchoColumn[0] = 1;
                anchoColumn[1] = 3;
                anchoColumn[2] = 3;
                anchoColumn[3] = 3;
                anchoColumn[4] = 2;
            }else{
                tituloTabla = new String[5];
                anchoColumn = new float[5];
                tituloTabla[0] = "NumFactura";
                tituloTabla[1] = "Cliente";
                tituloTabla[2] = "FechaEmision";
                tituloTabla[3] = "Comprobante";
                tituloTabla[4] = "Estado";
                anchoColumn[0] = 1;
                anchoColumn[1] = 3;
                anchoColumn[2] = 3;
                anchoColumn[3] = 3;
                anchoColumn[4] = 2;
            }
            
            Table table = new Table(anchoColumn);
            table.setWidth(UnitValue.createPercentValue(100));

            //Llenado de arraylist
            if(tipo.equals("auxiliar")||tipo.equals("balanza")){
                listaconsulta = datos;
            }else if(tipo.equals("empleados")){
                listaempleado = datos;
            }else{
                listafactura = datos;
            }
            
            for(String encabezadoTabla: tituloTabla){
                process(table, encabezadoTabla, bold, true);
            }
        
            //Llenado de tabla
            //Si el arraylist esta vacío
            
            if(tipo.equals("auxiliar")||tipo.equals("balanza")){
                if(listaconsulta.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No hubo movimientos en ese intervalo");
                }else{
                    //Si el arraylist no esta vacío
                    for(Consultas consulta: listaconsulta){
                        //Si el tipo de datos es del reporte auxiliar
                        if(tipo.equals("auxiliar")){
                            //Campo 1 de la tabla
                            process(table, String.valueOf(consulta.getPoliza()), font, false);
                            //Campo 2 de la tabla
                            process(table, consulta.getDescripcion(), font, false);
                            //Campo 3 y 4 de la tabla
                            //Si el debe es cero
                            if(consulta.getDebe().equals(0f)){
                                //Campo 3 de la tabla
                                process(table, String.valueOf(consulta.getDebe()), font, false);
                                //Campo 4 de la tabla
                                process(table, "0.00", font, false);
                            }else{
                                //Si el debe no es cero
                                //Campo 3 de la tabla
                                process(table, "0.00", font, false);
                                //Campo 4 de la tabla
                                process(table, String.valueOf(consulta.getHaber()) + "", font, false);
                            }
                        }else if(tipo.equals("balanza")){
                            //Campo 1 de la tabla
                            process(table, String.valueOf(consulta.getCuenta()), font, false);
                            //Campo 2 de la tabla
                            process(table, consulta.getDescripcion(), font, false);
                            //Campo 3 y 4 de la tabla
                            //Si el debe es cero
                            if(consulta.getDebe().equals(0f)){
                                //Campo 3 de la tabla
                                process(table, String.valueOf(consulta.getDebe()), font, false);
                                //Campo 4 de la tabla
                                process(table, "0.00", font, false);
                            }else{
                                //Si el debe no es cero
                                //Campo 3 de la tabla
                                process(table, "0.00", font, false);
                                //Campo 4 de la tabla
                                process(table, String.valueOf(consulta.getHaber()) + "", font, false);
                            }
                        }
                    }
                    //Añade un parrafo
                    document.add(new Paragraph("\n\n"));
                    //Añade la tabla
                    document.add(table);
                    //Cierra el documento
                    document.close();  
                }
            }else if(tipo.equals("empleados")){
                if(listaempleado.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No existen empleados");                    
                }else{
                    for(Empleado empleado: listaempleado){
                        //Campo 1 de la tabla
                        process(table, String.valueOf(empleado.getIdEmpleado()), font, false);
                        //Campo 2 de la tabla
                        process(table, empleado.getNombre(), font, false);
                        //Campo 3 de la tabla
                        process(table, empleado.getApellidoP(), font, false);
                        //Campo 4 de la tabla
                        process(table, empleado.getApellidoM(), font, false);
                        //Campo 5 de la tabla
                        process(table, empleado.getPuesto(), font, false);
                    }
                    //Añade un parrafo
                    document.add(new Paragraph("\n\n"));
                    //Añade la tabla
                    document.add(table);
                    //Cierra el documento
                    document.close(); 
                }
            }else{
                if(listafactura.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No existen facturas");                    
                }else{
                    for(Factura factura: listafactura){
                        //Campo 1 de la tabla
                        process(table, String.valueOf(factura.getFolio()), font, false);
                        //Campo 2 de la tabla
                        process(table, factura.getTblReceptor_rfcReceptor(), font, false);
                        JOptionPane.showMessageDialog(null, "Hola");
                        //Campo 3 de la tabla
                        process(table, factura.getFechaEmision().toString(), font, false);
                        //Campo 4 de la tabla
                        process(table, factura.getTbltipoComprobante_clave(), font, false);
                        //Campo 5 de la tabla
                        process(table, factura.getEstado(), font, false);
                    }
                    //Añade un parrafo
                    document.add(new Paragraph("\n\n"));
                    //Añade la tabla
                    document.add(table);
                    //Cierra el documento
                    document.close(); 
                }
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "El documento se encuentra abierto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void process(Table table, String line, PdfFont font, boolean isHeader){
        StringTokenizer tokenizer = new StringTokenizer(line,";");
        while(tokenizer.hasMoreTokens()){
            if(isHeader){
                table.addHeaderCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(font)));
            }else{
                table.addCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(font)));
            }
        }
    }
    
}
