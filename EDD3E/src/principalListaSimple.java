public class principalListaSimple {


    //Declarar la función principal 
    public static void main(String[] args) {

        //Declarar el objeto de la clase listaSimple 
        listaSimple ls = new listaSimple(); 
        
        //Agregar datos a la lista al inicio 
        ls.agregarNodoInicio("Berenice");
        ls.agregarNodoInicio("Abigail");
        ls.agregarNodoInicio("Mercedes");
        ls.agregarNodoInicio("America");      

        //Agregar datos a la lista al final 
        //ls.agregarNodosFinal("Berenice");
        //ls.agregarNodosFinal("Abigail");
        //ls.agregarNodosFinal("Mercedes");
        //ls.agregarNodosFinal("America");

        System.out.println("Encontrado: " + ls.buscarDato("America"));
        


        if(ls.listaVacia()){

            System.out.println("La lista simple esta vacia...");

        }else{

             ls.mostrarLista();
             System.out.println();
             System.out.println("Nodos totales: " + ls.totalNodos());

        }//  

        System.out.println();



        
        //Eliminar primer nodo de la lista
        //ls.eliminarNodoPrimero();

        System.out.println("Primer Nodo: " + ls.primerNodo());
        System.out.println("Ultimo Nodo: " + ls.ultimoNodo());

        System.out.println();
        
        ls.eliminarNodoPrimero();
        ls.eliminarNodoUltimo();
        ls.mostrarLista();        
        System.out.println();
        System.out.println("Nodos totales: " + ls.totalNodos());
        

        //Mostrar la lista simple
        //ls.mostrarLista();

       // System.out.println();//Salto de Linea

        //Total de nodos 
       // System.out.println("Nodos totales: " + ls.totalNodos());

        //Eliminar el primer nodo

        //Buscar nodos en la lista


        //Menu Principal
        /*System.out.println("1.- Agregar Nodo al Inicio");
        System.out.println("2.- Agregar Nodo al final");
        System.out.println("2.- Mostrar lista");
        System.out.println("3.- Eliminar nodo al inicio");
        System.out.println("4.- Eliminar nodo al final");
        System.out.println("5.- Buscar un nodo");
        System.out.println("6.- Total Nodos");
        System.out.println("7.- Metodo de Ordenacion");
        System.out.println("8.- Salir");*/
        
        
    }//fin main

}//fin clase
