package pdf;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Procesos {
    
    public void cargarArchivoA(String codigo){
        String file = "D:\\TAREAS\\TAREAS TEC\\SEMESTRE 4\\TOPICOS AVANZADOS\\PROYECTO\\Scofain\\src\\auxiliares\\" + codigo + ".pdf";
        
        try {
            File objetofile = new File (file);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cargarArchivoB(String balanza){
        String file = "D:\\TAREAS\\TAREAS TEC\\SEMESTRE 4\\TOPICOS AVANZADOS\\PROYECTO\\Scofain\\src\\balanza\\" + balanza + ".pdf";
        
        try {
            File objetofile = new File (file);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cargarArchivoE(String empleado){
        String file = "D:\\TAREAS\\TAREAS TEC\\SEMESTRE 4\\TOPICOS AVANZADOS\\PROYECTO\\Scofain\\src\\empleados\\" + empleado + ".pdf";
        
        try {
            File objetofile = new File (file);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cargarArchivoF(String facturas){
        String file = "D:\\TAREAS\\TAREAS TEC\\SEMESTRE 4\\TOPICOS AVANZADOS\\PROYECTO\\Scofain\\src\\facturas\\" + facturas + ".pdf";
        
        try {
            File objetofile = new File (file);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
