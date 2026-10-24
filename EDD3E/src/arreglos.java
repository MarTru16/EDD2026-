import java.util.Scanner;

public class arreglos {


    //Arreglos Unidimensionales 

    public static void main(String [] args){

        //         0  1  2  3  4
        //int []a = {1, 2, 3, 4, 5}; 
        //int i = 1; 

        // 2 x 1 = 2
        // 2 x 2
        // 2 x 3    


        Scanner leer = new Scanner(System.in);
        int array[] = new int[5];
        int nTabla;
        int tResultado; 
        int i; 

        
        for(i = 0; i <= 4; i++ ){

           System.out.print(i + ".-" + "Número -> ");
           array[i] = leer.nextInt(); 
                        

        }//fin for

        i = 0;

        while(i < 5){

            System.out.println("R: " + array[i]); 
            i++;

        }//fin while

        /*do{

            System.out.println(i);
            i++; 

        }while(i <= 100); */
        
        


    }//fin main

}//fin clase
