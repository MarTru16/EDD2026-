public class claseString {

    public static void main(String[] args) {

        //Declarar String 
        String cadena1; 
        //Inicio la variable 
        cadena1 = "Mi nombre es: ";  
        String cadena2; 
            //     0123456
        cadena2 = " Berenice ";   
        //Arreglo Char
        //            0   1   2   3   4   5   6   7   8   9
        char ac[] = {'1','2','3','4','5','6','7','8','9','0'};
        //     
        String cad1 = "HOLA";
        String cad2 = "Hola";    
        String cad3 = "Bienvenidos";            

        //Métodos String
        //length
        int cadT = cadena1.length(); 
        System.out.println("Dimension: " + cadT + " caracteres");
        //concat
        System.out.println(cadena1.concat(cadena2));
        //charAt
        System.out.println(cadena2.charAt(1));
        //getChars
        cadena2.getChars(1, 9, ac, 1);
        System.out.println(ac);
        //substring: String substring(int inicial, int final);
        String cad = cadena2.substring(1, 5);
        System.out.println(cad);
        //compareTo int compareTo(String);
        int res = cad1.compareTo(cad2);
        System.out.println(res); 
        //equals boolean equals(String cad2);
        if(cad1.equals(cad2)){
            System.out.println("si son iguales...");
        }else{
            System.out.println("No son iguales...");
        }//
        //boolean equalsIgnoreCase(String cad2);
        if(cad1.equalsIgnoreCase(cad2)){
            System.out.println("si son iguales...");
        }else{
            System.out.println("No son iguales...");
        }//
        //toUpperCase, toLowerCase
        System.out.println(cad1.toLowerCase());
        System.out.println(cad2.toUpperCase());
        //replace String replace(char c1, char c2);
        String c =  cad3.replace('n', 'N');
        System.out.println(c);
        //trim String trim(); Elimina los espacios
        String p = " Hoy "; 
        int p1 = p.length(); 
        System.out.println("P1: " + p1);
        int p2 = p.trim().length(); 
        System.out.println("P2: " + p2);







        
    }//fin main

}//fin class
