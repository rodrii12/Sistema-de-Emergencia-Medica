package sistema.de.emergencia.medica;
import javax.swing.JFrame;

/**
 *
 * @author FRANCO
 */
public class Ventana extends JFrame{
    public Ventana(){
        this.setSize(800,800);// tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //cerrar la ventana
        setTitle("                      SISTEMA DE ATENCION MEDICA"); //titulo
        setLocationRelativeTo(null);//poner en el centro la ventana
        
    
    }
}
