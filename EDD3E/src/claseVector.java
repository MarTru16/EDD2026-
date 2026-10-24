import java.util.Vector;

public class claseVector {

    public static void main(String[] args) {

        //Clase Vector 
        Vector<String> colonias = new Vector<>();

        colonias.add("Linares");//0
        colonias.add("Obrera I");//1
        colonias.add("Nacional Colectiva 1era Etapa");//2
        colonias.add("Zona Centro");//3
        colonias.add("Burocratica Sector 2 y 3");//4
        
        System.out.println("Colonias: " + colonias);
        System.out.println("Total de colonias: " + colonias.size());

        System.out.println();//salto de linea

        //colonias.remove(2); 
        colonias.set(2,"Nacional Colectiva 2da Etapa");         

        System.out.println("Colonias: " + colonias);
        System.out.println("Total de colonias: " + colonias.size());

        //colonias.clear();

        //System.out.println("Colonias: " + colonias);

        



        
    }//fin main

}//fin clase
