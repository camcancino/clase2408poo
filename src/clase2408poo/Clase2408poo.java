package clase2408poo;
//clase auto

public class Clase2408poo {

    
    public static void main(String[] args) {
       auto fitito, taxi;
       
       fitito = new auto();
       taxi = new auto(); //ahorramos codigo creando dos objetos de una misma clase
       
        System.out.println(fitito.encendido);
        // llamamos al método 
        //no hicimos nada todavía asi que está en default
        fitito.Encender(); // cambiamos el estado del objeto con la propiedad encendido
        System.out.println(fitito.encendido);
        
        fitito.Apagar();
        System.out.println(fitito.encendido);
        
        taxi.Encender();
        
        //superheroes
        
        Superheroe Spiderman;
        Spiderman = new Superheroe();
        
        Spiderman.idsecreta = "Peter Parker";
        Spiderman.altura = 1.70 ;
        Spiderman.fuerza = "Poca fuerza";
        Spiderman.edad = 24;
        
        System.out.println(Spiderman.salvandogente);
        Spiderman.Salvargente();
        System.out.println(Spiderman.salvandogente);
        
        Spiderman.Descansar();
        System.out.println(Spiderman.salvandogente);
        
        
        
        
        
        
    }
    
}
