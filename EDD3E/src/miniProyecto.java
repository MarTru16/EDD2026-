
import java.util.Scanner; 

public class miniProyecto {

    public static void main(String [] args){

        Scanner leer = new Scanner(System.in);
        String nombre; 
        float []cal; 
        float calif; 
        int i; 
        float sumaC = 0; 
        float promedio; 

        System.out.print("Digite el nombre del alumno: ");
        nombre = leer.nextLine(); 

        cal  = new float[5]; 

        
        //ciclo for, while, do - while 
        for(i = 0; i < 5; i++){

            System.out.print("Calificacion: " + (i + 1) + ": ");

            cal[i] = leer.nextFloat();                       

            sumaC += cal[i];  


        }//fin for


        promedio = sumaC / 5; 
        
       System.out.println(" ----- Resultado -----");

       System.out.println("Alumno: " + nombre);
       System.out.println("Promedio: " + promedio);

       if (promedio >= 6) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: REPROBADO");
        }

    }//fin main

}//fin clase
