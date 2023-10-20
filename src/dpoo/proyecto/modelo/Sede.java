package dpoo.proyecto.modelo;
	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Sede {
		
	private String nombre;
		
	private String ubicacion;
		
	private String horarioApertura;
		
	private String horarioCierre;
	
	public AdministradorSede  adminSede;
	
	public ArrayList <Empleado> listadoEmpleados = new ArrayList<>();
		
	public ArrayList <Vehiculo> vehiculosSede = new ArrayList<>();
	
	public ArrayList <Renta> rentasActivas = new ArrayList<>();
	
	
	
	
}