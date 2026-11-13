public class dispersionTabla {

    String nombre; 
    int edad; 

    //Constructor 
    public dispersionTabla(String nombre, int edad){

        this.nombre = nombre; 
        this.edad = edad; 

    }//fin dispersionTabla

    //Métodos Setter y Getter 
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }//

    public String getNombre(){
        return nombre;
    }//

    public void setEdad(int edad){
        this.edad = edad; 
    }//

    public int getEdad(){
        return edad; 
    }//

    public String toString(){
        return "Nombre: " + this.nombre + "Edad: " + this.edad; 
    }

}//fin clase
