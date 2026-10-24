public class eddPila {


    //Declarar 
    nodoPila cima, fondo; 
    int contador = 0; 

    //Constructor 
    public eddPila(){

        this.cima = null; 
        this.fondo = null; 

    }//fin constructor


    //Metodos - Operaciones 
    public void push(int dato){   
        contador++;      
        nodoPila nodo = new nodoPila(dato); 

        if(contador == 0){

            cima = nodo; 
            fondo = cima; 

        }else {

            nodo.siguiente = cima; 
            cima = nodo; 

        }//


    }//fin push

    public void pop(){
        contador--; 
        if(contador == 1){

            cima = null; 
            fondo = cima; 

        }else{

            cima = cima.siguiente; 
        }//

    }//fin pop 

    public boolean stackEmpty(){
        return fondo == null; 
    }//

    public void stackFull(){

    }//

    public void stackClear(){
        
    }//

    public int stackCima(){
        return cima.dato; 
    }//

    public int stackSize(){
        return  contador; 
    }//fin size




}//fin clase
