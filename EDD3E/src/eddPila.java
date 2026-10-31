public class eddPila {

    nodoPila ultimo; 
    int tamaño; 

    //Constructor
    public eddPila() {
        this.ultimo = null;
        this.tamaño = 0;
    }

    //Métodos

    public boolean pilaVacia(){
        return ultimo == null; 
    }//pilavacia

    public void push(int dato){
        nodoPila nodo = new nodoPila(dato);
        nodo.siguiente = ultimo;
        ultimo = nodo;
        tamaño++;
    }//

    public int pop(){
        int tmp = ultimo.dato;
        ultimo = ultimo.siguiente;
        tamaño--;
        return tmp;
    }//


    public int tamPila(){
        
        return tamaño;

    }//

    public void limpiarPila(){

        while(!pilaVacia()){
            pop();
        }//
    }//

    public int ultimoElemento(){
        return ultimo.dato; 
    }//


}//fin clase
