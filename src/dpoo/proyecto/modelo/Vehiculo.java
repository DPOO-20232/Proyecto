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
	
	public Estado estado;
	
	public Categoria categoria;
	
	public ArrayList <Renta> rentas = new ArrayList<>();
	
	public ArrayList <EnEmpresa> enEmpresa = new ArrayList<>();

	public Vehiculo(String placa, String marca, String modelo, String color, String tipoTransmision, Estado estado,
			Categoria categoria) {
		
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoTransmision = tipoTransmision;
		this.estado = estado;
		this.categoria = categoria;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoTransmision() {
		return tipoTransmision;
	}

	public void setTipoTransmision(String tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(ArrayList<Renta> rentas) {
		this.rentas = rentas;
	}

	public ArrayList<EnEmpresa> getEnEmpresa() {
		return enEmpresa;
	}

	public void setEnEmpresa(ArrayList<EnEmpresa> enEmpresa) {
		this.enEmpresa = enEmpresa;
	}
	
	public void agregarRenta(Renta renta) {
        rentas.add(renta);
    }
	
	public void agregarEnEmpresa(EnEmpresa empresa) {
        enEmpresa.add(empresa);
    }
	
	public void eliminarRenta(Renta renta) {
        rentas.remove(renta);
    }
	
	public void eliminarEnEmpresa(EnEmpresa empresa) {
        enEmpresa.remove(empresa);
    }
	
}
