import java.util.Scanner;

public class seleccionA {

    public static void main(String[] args) {

        //Declaración de variables 
                // 0 1 2 3 4
        //int a[] = {2,5,4,1,3};

        Scanner leer = new Scanner(System.in); 

        System.out.print("Elementos: ");
        int nCantidad = leer.nextInt(); 

        int a[] = new int[nCantidad]; 
        int indiceMenor; 
        int aux; 

        //Entrada de datos por el usuario mediante el teclado
        for(int i = 0; i < a.length; i++){

            System.out.print(i +" .- "+" Número: ");
            a[i] = leer.nextInt(); 

        }//fin entrada        

        System.out.println();//salto de linea

        //Arreglo Desordenado
        System.out.println("Arreglo Desordenado");
        for(int i = 0; i < a.length; i++){

            System.out.print(a[i] + " -> ");

        }//fin for

        System.out.println();//Salto de linea
        
        //Algoritmo de Ordenamiento de Selección 
        for(int i = 0; i < a.length; i++){

            indiceMenor = i;//0 

            for(int j = i+1; j < a.length; j++){
                //  [4] = 2   <        [3] = 1
                if(a[j] < a[indiceMenor]){

                    indiceMenor = j; 

                }//if

            }//fin interno

            //cambio
            aux = a[i];
            a[i] = a[indiceMenor]; //valor = 1
            a[indiceMenor] = aux; //valor = 3

        }//fin externo

        System.out.println();//salto de linea
        
        //Imprimir el Arreglo Ordenado
        System.out.println("Arreglo Ordenado");
        for(int i = 0; i < a.length; i++){

            System.out.print(a[i] + " -> ");

        }//fin for
        
    }//fin main

}//fin clase
