
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class Entrada_Ejemplo2 {


    public static void main(String[] args) {
   
        String nombre_Usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
      
        
        String edad_usuario=JOptionPane.showInputDialog("Introduce tu edad");
        System.out.println("Hola " + nombre_Usuario + ". El año que viene tendras " + Integer.parseInt(edad_usuario+1) + " años");
    }
    
}
