package classroom;

public class Asignatura {

    public String nombre;
    ///String n = nombre; lo quito porque se repite el atributo
    public double codigoInterno; ///Cambio el tipo a double para que sea compatible con los métodos cambiados
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        ///this(0); lo quito porque la clase no tiene ningún atributo que sea un número
    }

    public Asignatura(Tipo tipo,int codigoInterno) {
        this("Sin nombre", codigoInterno, 0,tipo); ///Intercambio tipo con codigoInterno para que no haya ambiguedad entre los constructores
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(double codigoInterno) {
        this.codigoInterno = codigoInterno;
    }///Lo cambio para dar prioridad al métdo de abajo

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
