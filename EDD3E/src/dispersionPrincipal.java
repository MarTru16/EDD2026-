import java.util.Enumeration;
import java.util.Hashtable;

public class dispersionPrincipal {

    public static void main(String[] args) {

        //

        //Declarar los objetos 
        dispersionTabla td1 = new dispersionTabla("Benita", 29);
        dispersionTabla td2 = new dispersionTabla("Pedro", 18);
        dispersionTabla td3 = new dispersionTabla("Sofia", 35); 

        //Declarar Tabla Hash 
        Hashtable<String, Integer> tabla = new Hashtable<>(); 

        tabla.put(td1.getNombre() ,td1.getEdad());
        tabla.put(td2.getNombre(), td2.getEdad());
        tabla.put(td3.getNombre(), td3.getEdad()); 

        String aux; 
        Enumeration<String> keys = tabla.keys(); 
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(tabla.get(aux));

        }//





        
    }//fin main 

}//fin clase
