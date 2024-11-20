package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"),FUNDAMENTACION(20, "Fundamentacion"),ELECTIVA(30,"Electiva");///Agrego estos parámetros porque el constructor necesita de dos argumentos para inicializarse
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
