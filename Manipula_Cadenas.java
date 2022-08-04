
public class Manipula_Cadenas {
    public static void main(String[] args){
        
        String nombre="Marco";
        
        System.out.println("Mi nombre es " + nombre);
        
        System.out.println("Mi nombre tiene " + nombre.length() +  " letras"); // .length()--> Devuelve la cantidad de caracteres 
        
        System.out.println("La primer letra de mi nombre es "+ "[" + nombre.charAt(0)+ "]" ); // .charAt()--> Devuelve la letra que le indiques en los parentesis
        
        int ultima_letra= nombre.length();
        
        System.out.println("Y la ultima letra es la " + "[" +nombre.charAt(ultima_letra-1)+ "]");
    }
}
