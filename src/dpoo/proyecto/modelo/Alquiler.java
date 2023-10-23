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
	
	public Sede vehiculoAlquilado;

	public Alquiler(ArrayList<ConductorAdicional> conductoresAdicionales, ArrayList<Seguro> segurosAdicionales,
			Sede vehiculoAlquiladoPlaca) {
	
		this.conductoresAdicionales = conductoresAdicionales;
		this.segurosAdicionales = segurosAdicionales;
		this.vehiculoAlquilado = vehiculoAlquiladoPlaca;
	}

	public ArrayList<ConductorAdicional> getConductoresAdicionales() {
		return conductoresAdicionales;
	}

	public void setConductoresAdicionales(ArrayList<ConductorAdicional> conductoresAdicionales) {
		this.conductoresAdicionales = conductoresAdicionales;
	}

	public ArrayList<Seguro> getSegurosAdicionales() {
		return segurosAdicionales;
	}

	public void setSegurosAdicionales(ArrayList<Seguro> segurosAdicionales) {
		this.segurosAdicionales = segurosAdicionales;
	}

	public Sede getVehiculoAlquilado() {
		return vehiculoAlquilado;
	}

	public void setVehiculoAlquilado(Sede vehiculoAlquilado) {
		this.vehiculoAlquilado = vehiculoAlquilado;
	}
	
	public void agregarConductor(ConductorAdicional conductor) {
        conductoresAdicionales.add(conductor);
    }
	
	public void agregarSeguro(Seguro seguro) {
        segurosAdicionales.add(seguro);
    }

	public void eliminarConductor(ConductorAdicional conductor) {
		conductoresAdicionales.remove(conductor);
	}
	
	public void eliminarSeguro(Seguro seguro) {
		segurosAdicionales.remove(seguro);
	}
}
