import java.util.Scanner;

public class arregloBurbuja {    

    public static void main(String[] args) {

        // Algoritmo de Ordenación Intercambio (Burbuja)        

        Scanner leer = new Scanner(System.in);
        int dimension; 

        System.out.print("Digite la dimensión del Arreglo: ");
        dimension = leer.nextInt(); 

        int a[] = new int[dimension];      
        int aux;  
        int x = 0; 
                
        //solicitar los valores
        while( x < a.length){
            System.out.print("Escriba los valores: ");
            a[x] = leer.nextInt(); 
            x++; 
        }//fin while

        //Ciclos para ordenar el arreglo - Burbuja
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {

                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                } // fin if

            } // for interno

        } // fin externo

        //Imprimir el resultado del arreglo ordenado
        for (int i = 0; i < a.length; i++) {

            System.out.print("[" + a[i] + "] ->");

        } // fin for



    }// fin manin
}// fin clase
