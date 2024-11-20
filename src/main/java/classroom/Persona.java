package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
       ///cedula = 3; //lo quito porque cedula es atributo de instancia y no se puede editar sin un objeto creado
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = "";
        cedula = 1; /// Agredado porque si un atributo es constante teiene que inicializarse
        totalPersonas++;
    }

    public Persona() {
        cedula = 0;
        totalPersonas++;
    } ///Creado para crear nuevos objetos sin necesidad de argumentos
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
