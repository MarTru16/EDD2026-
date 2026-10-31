public class eddCola {

    nodoCola primero, ultimo; 
    int tamaño; 

    public eddCola(){
        this.primero = ultimo = null; 
        this.tamaño = 0; 

    }//


    //Metodos
    public boolean empty(){
        return primero == null; 
    }//empty

    public void insert(int dato){
        nodoCola nuevo = new nodoCola(dato); 

        if(empty()){
            primero = nuevo; 
        }else{

            ultimo.siguiente = nuevo; 
        }//
        ultimo = nuevo; 
        tamaño++; 

    }//insert

    public int delete(){
        int aux = primero.dato; 
        primero = primero.siguiente; 
        tamaño--; 
        return aux; 

    }//delete

    public int start(){
        return primero.dato; 
    }//start

    public int size(){
        return tamaño; 
    }//size




}//fin clase
