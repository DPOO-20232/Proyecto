package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;

public class Renta {
	
	private LocalDate fechaInicio;
	
	private LocalDate fechaFinal;
	
	private String rangoHorarioEntrega;
	
	private Double tarifa;
	
	public Alquiler alquiler;
	
	public Reserva reserva;
	
	public Sede sedeRecogida;
	
	public Sede sedeEntrega;

	public Renta(LocalDate fechaInicio, LocalDate fechaFinal, String rangoHorarioEntrega, Double tarifa,
			Alquiler alquiler, Reserva reserva, Sede sedeRecogida, Sede sedeEntrega) {
		
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.rangoHorarioEntrega = rangoHorarioEntrega;
		this.tarifa = tarifa;
		this.alquiler = alquiler;
		this.reserva = reserva;
		this.sedeRecogida = sedeRecogida;
		this.sedeEntrega = sedeEntrega;
	}
	
	
	
}
