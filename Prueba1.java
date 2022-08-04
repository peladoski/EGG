import java.util.Scanner;

public class Prueba1 {

  
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        
        String nombre_usuario=entrada.nextLine();
        
        System.out.println("Introduce tu edad");
        
        int edad = entrada.nextInt();
        
        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");
        
    }
    
}
