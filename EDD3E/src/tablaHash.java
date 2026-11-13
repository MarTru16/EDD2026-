import java.util.Hashtable;

public class tablaHash {


    public static void main(String[] args) {


        Hashtable<String, String> tabla = new Hashtable<>();
        Hashtable<Integer, String> table = new Hashtable<>(); 
        Hashtable<Float, String> table2 = new Hashtable<>(); 
 
        table.put(111,"Nombre: Hannia, Pais: Peru");
        table.put(222,"Nombre: Martin, Paisa: Colombia, Observacion: Casado con 2 hijos y sin trabajo");
        table.put(333, "Nombre: Gemma, Pais: Brasil"); 
        table.put(444, "Nombre: Estefania, Pais: Japon");
        table.put(555, "Nombre: Nacud, Pais: Mexico");

        System.out.println(table.get(111));
        
        
    
    
    }//fin 


}//fin clase 

