public class arreglosBI {

    public static void main(String[] args) {

        //Arreglos bidimensionales 


        int aBI[][] = {{1,2,3},
                       {4,5,6}};
        
        int filas = 0, columnas = 0; 

        //Ciclos anidados
        /*for(int filas = 0; filas < 2; filas++){
            for(int columnas = 0; columnas < 3; columnas++){
                System.out.print("[" + aBI[filas][columnas] + "]");
            }//interno-columnas
            System.out.println();
        }//externo-filas*/

        //while 
        /*while(filas < 2){
            columnas = 0; 
            while(columnas < 3){
                System.out.print("[" + aBI[filas][columnas] + "]");
                columnas++; 
            }//interno
            System.out.println();
            filas++; 
        }//externo*/
        
        //do - while
        do{
            columnas = 0; 
            do{
                System.out.print("[" + aBI[filas][columnas] + "]");
                columnas++;
            }while(columnas < 3);//interno
            System.out.println();
            filas++; 
        }while(filas < 2);//externo

    }//fin main
}//fin clase
