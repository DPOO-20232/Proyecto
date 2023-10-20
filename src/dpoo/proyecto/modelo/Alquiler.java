package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Alquiler {
	
	public ArrayList<ConductorAdicional> conductoresAdicionales = new ArrayList<>();
	
	public ArrayList<Seguro> segurosAdicionales = new ArrayList<>();
	
	public Vehiculo vehiculoAlquilado;
	
}
