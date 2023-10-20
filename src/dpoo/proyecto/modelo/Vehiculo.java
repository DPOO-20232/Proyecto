package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Vehiculo {
	
	private String placa;
	
	private String marca;
	
	private String modelo;
	
	private String color;
	
	private String tipoTransmision;
	
	public Categoria categoria;
	
	public ArrayList <Renta> rentas = new ArrayList<>();
	
	public ArrayList <EnEmpresa> enEmpresa = new ArrayList<>();
	
}
