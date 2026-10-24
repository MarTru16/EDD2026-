import java.util.Scanner;

import javax.swing.JOptionPane;

public class insercionA {

    public static void main(String[] args) {

        //Declaración de variables 
        Scanner leer = new Scanner(System.in);


        int nElementos =  Integer.parseInt(JOptionPane.showInputDialog(null,"Elementos: ","Entrada Elementos" ,1));
        


        int a[] = new int[nElementos];
        int aux, indice;  

        //Entrada de datos por el usuario mediante el teclado 
        for(int i = 0; i < a.length; i++){

            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número","Entrada Arreglo",1));
            //System.out.print((i+1) + " .- "+ "Digite el número: ");
            //a[i] = leer.nextInt(); 
 
        }//fin for

        System.out.println();//Salto de línea

        //Método de Ordenación - Inserción
        for(int i = 0; i < a.length; i++){

            indice = i;//0 
            aux = a[i];//4 

            while((indice > 0) && (a[indice - 1] > aux)){

                a[indice] = a[indice - 1]; 
                indice--; 

            }//fin while

            a[indice] = aux; 


        }//externo 

        System.out.println();//Salto de línea


        //Imprimir el Arreglo Ordenado
        for(int i = 0; i < a.length; i++){

            System.out.print(a[i] + " -> ");

        }//fin for

        
    }//fin main

}//fin clase
 