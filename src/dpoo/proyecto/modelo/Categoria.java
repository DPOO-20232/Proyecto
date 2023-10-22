package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Categoria {
	
	private String nombre;
	
	private Double tarifaAlta;
	
	private Double tarifaBaja;
	
	public ArrayList <Vehiculo> automoviles = new ArrayList<>();

	public Categoria(String nombre, Double tarifaAlta, Double tarifaBaja) {
		
		this.nombre = nombre;
		this.tarifaAlta = tarifaAlta;
		this.tarifaBaja = tarifaBaja;
	}
	
	

}
