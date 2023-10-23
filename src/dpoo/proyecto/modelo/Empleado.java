package dpoo.proyecto.modelo;

public class Empleado {
	
	private String nombre;
	
	private int id;
	
	private String funcion;

	public Empleado(String nombre, int id, String funcion) {

		this.nombre = nombre;
		this.id = id;
		this.funcion = funcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	

}
