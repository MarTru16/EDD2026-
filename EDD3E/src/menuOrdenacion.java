import java.util.Scanner;

import javax.swing.JOptionPane;

public class menuOrdenacion {



    ///Métodos de Ordenación

    public void mBurbuja(){

        System.out.println(" ----- Ordenación Burbuja ----- ");

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


    }//fin mBurbuja

    public void mSeleccion(){

        System.out.println(" ----- Ordenación Selección ----- ");

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


    }//fin mSeleccion

    public void mInsercion(){

        System.out.println(" ----- Ordenación Inserción ----- ");

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


    }//fin mInsercción


    public static void main(String[] args) {

        //Declaración de variables
        menuOrdenacion obj = new menuOrdenacion(); 
        Scanner leer = new Scanner(System.in); 
        int opcion; 
        
        do{//inicia do

        //Menu Principal
        System.out.println(" ----- Menu Principal - Metodos de Ordenacion ----- ");
        System.out.println("1.- Ordenación Burbuja");
        System.out.println("2.- Ordenación Selección");
        System.out.println("3.- Ordenación Inserción");
        System.out.println("4.- Salir....");
        System.out.print("Selecciona una opción: ");
        opcion = leer.nextInt(); 

        switch (opcion) {
            
            case 1: obj.mBurbuja(); System.out.println(); break; 
            case 2: obj.mSeleccion(); System.out.println(); break; 
            case 3: obj.mInsercion(); System.out.println(); break;
            case 4: break; 
            default: System.out.println("Opción Invalida...\n");

        }//fin switch

    }while(opcion != 4);    


    }//fin main


}//fin clase
