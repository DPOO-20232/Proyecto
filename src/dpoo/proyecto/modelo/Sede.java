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
		
	private int horarioApertura;
		
	private int horarioCierre;
	
	public AdministradorSede  adminSede;
	
	public ArrayList <Empleado> listadoEmpleados = new ArrayList<>();
		
	public ArrayList <Vehiculo> vehiculosSede = new ArrayList<>();
	
	public ArrayList <Renta> rentasActivas = new ArrayList<>();

	public Sede(String nombre, String ubicacion, int horarioApertura, int horarioCierre, AdministradorSede adminSede)
	
	{
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.adminSede = adminSede;
		
	}

	public Sede(String str) {
		this.nombre = str;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(int horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public int getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(int horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public AdministradorSede getAdminSede() {
		return adminSede;
	}

	public void setAdminSede(AdministradorSede adminSede) {
		this.adminSede = adminSede;
	}

	public ArrayList<Empleado> getListadoEmpleados() {
		return listadoEmpleados;
	}

	public void setListadoEmpleados(ArrayList<Empleado> listadoEmpleados) {
		this.listadoEmpleados = listadoEmpleados;
	}

	public ArrayList<Vehiculo> getVehiculosSede() {
		return vehiculosSede;
	}

	public void setVehiculosSede(ArrayList<Vehiculo> vehiculosSede) {
		this.vehiculosSede = vehiculosSede;
	}

	public ArrayList<Renta> getRentasActivas() {
		return rentasActivas;
	}

	public void setRentasActivas(ArrayList<Renta> rentasActivas) {
		this.rentasActivas = rentasActivas;
	}
	
	public void agregarEmpleado(Empleado empleado) {
        listadoEmpleados.add(empleado);
    }
	
	public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosSede.add(vehiculo);
    }
	
	public void agregarRenta(Renta renta) {
        rentasActivas.add(renta);
    }
	
	public static Sede valueOf(String str) {
        return new Sede(str);
    }
	
	public void eliminarEmpleado(Empleado empleado) {
		listadoEmpleados.remove(empleado);
	}
	
	public void eliminarVehiculo(Vehiculo vehiculo) {
		vehiculosSede.remove(vehiculo);
	}
	public void eliminarRenta(Renta renta) {
		rentasActivas.remove(renta);
	}


}