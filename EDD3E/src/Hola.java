public class Hola {//


    public static void main(String  [] args){        

        //Tipos de datos basicos

        int entero = 10; 
        float decimal = 1.5f;
        char vocal = 'A'; 
        boolean estado = true; 

        int num1 = 45; 
        int num2 = 56; 
        int sumita, resta, multi, div; 
        
        /*System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Vocal: " + vocal);
        System.out.println("Estado: " + estado);*/

        /*sumita = num1 + num2; 
        resta = num1 - num2; 
        multi = num1 * num2; 
        div = num1 / num2; 

        System.out.println("Resultado(Suma): " + sumita);
        System.out.println("Resultado(Resta): " + resta);
        System.out.println("Resultado(Multi): " + multi);
        System.out.println("Resultado(Div):" + div);*/    


        //Estructura de Control 
        //Seleccion 
        /*char usuario = 'S';
        int password = 1234; 

        //and, or, not 

        if(usuario == 'B' || password == 1234){
            System.out.println("Acceso Correcto");
        }else{
            System.out.println("Usuario y Password Incorrectos ");
        }//fin if*/

        //Ciclos 

        //for, while, do - while

        /*
        for(inicio; condicion; incremento o decremento){
            instrucciones...
        }
        */

        int i; 

        for(i = 10; i >= 1 ;i--){

            System.out.println("n.- " + i);

        }//fin for

        
        

    }//fin main



}//fin clase
