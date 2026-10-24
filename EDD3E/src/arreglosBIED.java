import java.util.Scanner;

public class arreglosBIED {
        public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);
            int aBI[][] = new int[3][3]; 
            int filas, columnas; 
            int opcion = 0;

            //Solicitar al usuario los valores del arreglo
            /*for(filas = 0; filas < 3; filas++){
                for(columnas = 0; columnas < 3; columnas++){
                    System.out.print("[" + filas +  "]" + "[" + columnas + "]: ");
                    aBI[filas][columnas] = leer.nextInt();
                }//interno-columnas
            }//externo-filas

            System.out.println();

            //Imprimir los valores del arreglo
            for(filas = 0; filas < 3; filas++){
                for(columnas = 0; columnas < 3; columnas++){
                    System.out.print("[" + aBI[filas][columnas] + "]");                    
                }//interno-columnas
                System.out.println();
            }//externo-filas*/

            System.out.println(" ------ SISTEMA BANCARIO -----");
            System.out.println("1.- CREAR");
            System.out.println("2.- LEER");
            System.out.println("3.- ACTUALIZAR");
            System.out.println("4.- ELIMINAR");
            System.out.println("5.- SALIR");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();            
            
            switch(opcion){                

                case 1: System.out.println("CREAR");
                break; 
                case 2: System.out.println("LEER");
                break; 
                case 3: System.out.println("ACTUALIZAR");
                break; 
                case 4: System.out.println("ELIMINAR");
                break; 
                case 5: System.out.println("SALIR");
                break; 
                default: System.out.println("Opcion Invalida");

            }//fin switch



            /*               

                Solicitar los valores al usuario
                mediante la entrada de teclado
                
                Implementar dos ciclos diferentes
                uno para recorrer y pedir los valores
                , otro para imprimir el resultado

            */
            
        }//fin main
}//fin clase
