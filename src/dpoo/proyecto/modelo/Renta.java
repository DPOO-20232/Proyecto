package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Renta {
	
	private Date fechaInicio;
	
	private Date fechaFinal;
	
	private String rangoHorarioEntrega;
	
	private Double tarifa;
	
	public Alquiler alquiler;
	
	public Reserva reserva;
	
	public Sede sedeRecogida;
	
	public Sede sedeEntrega;
	
}
