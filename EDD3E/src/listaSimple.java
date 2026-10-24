public class listaSimple {


    //Declarar 
    Nodo primero, ultimo;    
    int contador = 0; 

    //Constructor
    public listaSimple(){

        this.primero = null; 
        this.ultimo = null; 
        
    }// 


    //Funciones 
    //validar que la lista este vacia 
    public boolean listaVacia(){

        return primero == null; 

    }//fin lista vacia


    //agregar nodos al inicio de la lista simple
    public void agregarNodoInicio(String dato){
        contador++;
        //Creando un objeto de la clase Nodo
        Nodo nodo = new Nodo(dato);
        
        if(listaVacia()){

            primero = nodo; 
            ultimo  = primero; 

        }else{

           nodo.siguiente = primero; 
           primero = nodo;           
               

        }//fin if - else 

    }//fin agregar nodos inicio  


    //Agregar nodos al final de la lista simple
    public void agregarNodosFinal(String dato){
        contador++;
        Nodo nodo = new Nodo(dato);
        
        if(listaVacia()){

            primero = nodo; 
            ultimo = primero; 

        }else{

            ultimo.siguiente = nodo;
            ultimo = nodo;  

        }//else

    }//fin nodosfinal

    //Mostrar lista simple

    public void mostrarLista(){

        Nodo aux = primero; 

        while(aux != null){

            System.out.print("[" + aux.dato + "] ---> ");
            aux = aux.siguiente;

        }//while

    }//fin mostrar lista


    //Total de nodos agregados
    public int totalNodos(){
        return contador;
    }//fin total nodos 


    //


    //Eliminar nodo al inicio 
    public void eliminarNodoPrimero(){

        if(contador == 1){

            primero = null; 
            ultimo = primero;

        }else{

            primero = primero.siguiente;     
            
        }//else

        contador--; 

    }//fin eliminar nodo primero

    //Eliminar nodo al final 
   public String eliminarNodoUltimo(){

    String eliminado = ultimo.dato; 

    Nodo aux = primero; 

    while(aux.siguiente != ultimo){

        aux = aux.siguiente; 

    }//

    ultimo = aux; 
    ultimo.siguiente = null; 

    contador--;
    
    return eliminado;    

   }//


    //Mostrar primer nodo de la lista 
    public String primerNodo(){

        return primero.dato; 

    }//

    //Mostrar ultimo nodo de la lista 
    public String ultimoNodo(){

        return ultimo.dato; 

    }//

    //Buscar un elemento en la lista enlazada 
    public boolean buscarDato(String dato){

        boolean encontrado = false; 
        Nodo aux = primero; 

        while (encontrado!=true) {

            if(dato.equals(aux.dato)){

                encontrado = true; 

            }else{

                aux = aux.siguiente; 


            }//

            if(encontrado == true) break; 

        }//fin while

        return encontrado; 

    }//




}//fin class
