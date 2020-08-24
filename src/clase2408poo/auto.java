package clase2408poo;


public class auto {
    //estado
    boolean encendido = false; //por defecto
    // String Marca (no afecta el estado)
    //propiedad
    // el estado lo puedo cambiar a través de un método
    
    //no devuelve nada pero cambia el estado del objeto de esa clase
    public void Encender(){ //método para cambiar un estado
        encendido = true;
    }
    
    public void Apagar(){
        encendido = false;
    }
}
