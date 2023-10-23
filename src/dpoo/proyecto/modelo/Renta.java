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

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getRangoHorarioEntrega() {
		return rangoHorarioEntrega;
	}

	public void setRangoHorarioEntrega(String rangoHorarioEntrega) {
		this.rangoHorarioEntrega = rangoHorarioEntrega;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Sede getSedeRecogida() {
		return sedeRecogida;
	}

	public void setSedeRecogida(Sede sedeRecogida) {
		this.sedeRecogida = sedeRecogida;
	}

	public Sede getSedeEntrega() {
		return sedeEntrega;
	}

	public void setSedeEntrega(Sede sedeEntrega) {
		this.sedeEntrega = sedeEntrega;
	}
	
	
	
}
