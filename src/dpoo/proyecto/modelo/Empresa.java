package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Empresa {
	
	public ArrayList <Cliente> clientes = new ArrayList<>();
	
	public ArrayList <Sede> sedes = new ArrayList<>();
	
	public ArrayList <Categoria> categorias = new ArrayList<>();
	
	public static void crearArchivo(String nombreArchivo, String contenido) {
		
		String nombre = "./data/";
		
		nombre += nombreArchivo;
		
		File archivo = new File(nombre);
		
		try {
			
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("El archivo " + nombreArchivo + " se modifico correctamente");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void obtenerTextoSede(){
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("./data/Sedes.txt"));
			Sede sedeActual = null;
			
			String linea = br.readLine();
			while (linea != null) {
				
				String[] partes = linea.split(";");
				String nombreSede = partes[0];
				String ubicacion = partes[1];
				int horarioApertura = Integer.parseInt(partes[2]);
				int horarioCierre = Integer.parseInt(partes[3]);
				String administradorSede = partes[4];
				int idAdministrador = Integer.parseInt(partes[5]);
				AdministradorSede adminSede = new AdministradorSede(administradorSede, idAdministrador);
				
				if (sedeActual == null || !sedeActual.getNombre().equals(nombreSede)) {
					
			        if (sedeActual != null) {
			         
			            sedes.add(sedeActual);
			        }
			       
			        sedeActual = new Sede(nombreSede, ubicacion, horarioApertura, horarioCierre, adminSede);
			    }

			    String nombreEmpleado = partes[6];
			    int idEmpleado = Integer.parseInt(partes[7]);
			    String funcionEmpleado = partes[8];
			    Empleado empleadoSede = new Empleado(nombreEmpleado, idEmpleado, funcionEmpleado);
			    sedeActual.agregarEmpleado(empleadoSede);
			    
			    String placa = partes[9];
				String marca = partes[10];
				String modelo = partes[11];
				String color = partes[12];
				String tipoTransmision = partes[13];
				Estado estado = partes[14].equals("disponible") ? Estado.DISPONIBLE : partes[14].equals("alquiler")? Estado.ALQUILER : partes[14].equals("reserva") ? Estado.RESERVA: partes[14].equals("lavado")? Estado.LAVADO : Estado.MANTENIMIENTO;
				String nombreCategoria = partes[15];
				Double tarifaAlta = Double.parseDouble(partes[16]);
				Double tarifaBaja = Double.parseDouble(partes[17]);
				Categoria categoria = new Categoria(nombreCategoria, tarifaAlta, tarifaBaja);
				Vehiculo vehiculoSede = new Vehiculo(placa, marca, modelo, color, tipoTransmision, estado, categoria);
				sedeActual.agregarVehiculo(vehiculoSede);
				
				LocalDate fechaInicioRentaSede = LocalDate.parse(partes[18], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				LocalDate fechaFinRentaSede = LocalDate.parse(partes[19], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				String rangoHorarioEntregaSede = partes[20];
				Double tarifaSede = Double.parseDouble(partes[21]);
				String placaVehiculoAlquiladoSede = partes[22];
				Sede vehiculoAlquilado = Sede.valueOf(placaVehiculoAlquiladoSede);
				int numeroLicenciaSede = Integer.parseInt(partes[23]);
				String paisExpedicionLicencia = partes[24];
				LocalDate fechaVencimientoLicencia = LocalDate.parse(partes[25], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				File fotoLicencia = new File(partes[26]);
				LicenciaConduccion licenciaConductorAdicionalSede = new LicenciaConduccion(numeroLicenciaSede, paisExpedicionLicencia, fechaVencimientoLicencia, fotoLicencia);
				ArrayList<ConductorAdicional> conductorAdicionalSede = new ArrayList<>(); new ConductorAdicional(licenciaConductorAdicionalSede);
				String nombreSeguroSede = partes[27];
				Double costoSeguroSede = Double.parseDouble(partes[28]);
				ArrayList<Seguro> seguroAdicionalSede = new ArrayList<>(); new Seguro(nombreSeguroSede, costoSeguroSede);
				Alquiler vehiculoEnAlquilerSede = new Alquiler(conductorAdicionalSede, seguroAdicionalSede, vehiculoAlquilado);
				String nombreCategoriaReservadaSede = partes[29];
				Categoria categoriaReservadaSede = new Categoria(nombreCategoriaReservadaSede, tarifaAlta, tarifaBaja);
				Reserva reservaActiva = new Reserva(categoriaReservadaSede);
				String sedeRecogidaEn = partes[30];
				Sede sedeRecogida =Sede.valueOf(sedeRecogidaEn);
				String sedeEntregaEn = partes[31];
				Sede sedeEntrega = Sede.valueOf(sedeEntregaEn);
				Renta rentaActiva = new Renta (fechaInicioRentaSede, fechaFinRentaSede, rangoHorarioEntregaSede, tarifaSede, vehiculoEnAlquilerSede, reservaActiva, sedeRecogida, sedeEntrega);
				sedeActual.agregarRenta(rentaActiva);
				linea = br.readLine();
			    
			}

			if (sedeActual != null) {
			    sedes.add(sedeActual);
			}
				
			
			br.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Se produjo un Error ");
		}
		
		
	}
	
	public void obtenerTextoClientes() {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("./data/Clientes.txt"));
			String linea = br.readLine();
			while (linea != null) {
				
				String[] partes = linea.split(";");
				String nombre = partes[0];
				String datosContacto = partes[1];
				LocalDate fechaNacimiento = LocalDate.parse(partes[2], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				String nacionalidad = partes[3];
				File imagenDocumento = new File(partes[4]);
				int numero = Integer.parseInt(partes[5]);
				String paisExpedicion = partes[6];
				LocalDate fechaVencimiento = LocalDate.parse(partes[7], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				File fotoLicencia = new File(partes[8]);
				LicenciaConduccion datoslicencia = new LicenciaConduccion(numero, paisExpedicion, fechaVencimiento, fotoLicencia);
				LocalDate fechaInicio = LocalDate.parse(partes[9], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				LocalDate fechaFinal = LocalDate.parse(partes[10], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				String rangoHorarioEntrega = partes[11];
				Double tarifa = Double.parseDouble(partes[12]);
				String VehiculoAlquilado = partes[13];
				Sede vehiculoAlquilado = Sede.valueOf(VehiculoAlquilado);
				int numeroLicencia = Integer.parseInt(partes[14]);
				String paisExpedicionLicencia = partes[15];
				LocalDate fechaVencimientoLicencia = LocalDate.parse(partes[16], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				File fotoLicenciaAdicional = new File(partes[17]);
				LicenciaConduccion licenciaConductorAdicional = new LicenciaConduccion(numeroLicencia, paisExpedicionLicencia, fechaVencimientoLicencia, fotoLicenciaAdicional);
				ArrayList<ConductorAdicional> conductoresAdicionales = new ArrayList<>(); new ConductorAdicional(licenciaConductorAdicional);
				String nombreSeguro = partes[18];
				Double costoSeguro= Double.parseDouble(partes[19]);
				ArrayList<Seguro> seguroAdicionalSede = new ArrayList<>(); new Seguro(nombreSeguro, costoSeguro);
				Alquiler vehiculoEnAlquiler = new Alquiler(conductoresAdicionales, seguroAdicionalSede, vehiculoAlquilado);
				String nombreCategoriaReservada = partes[20];
				Double tarifaAlta = Double.parseDouble(partes[21]);
				Double tarifaBaja = Double.parseDouble(partes[22]);
				Categoria categoriaReservada = new Categoria(nombreCategoriaReservada, tarifaAlta, tarifaBaja);
				Reserva reservaActiva = new Reserva(categoriaReservada);
				String sedeRecogidaEn = partes[23];
				Sede sedeRecogida =Sede.valueOf(sedeRecogidaEn);
				String sedeEntregaEn = partes[24];
				Sede sedeEntrega = Sede.valueOf(sedeEntregaEn);
				ArrayList<Renta> rentasActivas = new ArrayList<>(); new Renta (fechaInicio, fechaFinal, rangoHorarioEntrega, tarifa, vehiculoEnAlquiler, reservaActiva, sedeRecogida, sedeEntrega);
				Cliente losClientes = new Cliente(nombre, datosContacto, fechaNacimiento, nacionalidad, imagenDocumento, datoslicencia, rentasActivas);
				clientes.add(losClientes);
				linea = br.readLine();

			}
			
			br.close();

		} catch(Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Se produjo un Error ");
		}
		
	}
	
	public void obtenerTextoCategoria() {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("./data/Categorias.txt"));
			Categoria categoriaActual = null;
			
			String linea = br.readLine();
			while (linea != null) {
				
				String[] partes = linea.split(";");
				String nombre = partes[0];
				Double tarifaAlta = Double.parseDouble(partes[1]);
				Double tarifaBaja = Double.parseDouble(partes[2]);
				
				if (categoriaActual == null || !categoriaActual.getNombre().equals(nombre)) {
					
			        if (categoriaActual != null) {
			         
			            categorias.add(categoriaActual);
			        }
			       
			        categoriaActual = new Categoria(nombre, tarifaAlta, tarifaBaja);
			    }

				String placa = partes[3];
				String marca = partes[4];
				String modelo = partes[5];
				String color = partes[6];
				String tipoTransmision = partes[7];
				Estado estado = partes[8].equals("disponible") ? Estado.DISPONIBLE : partes[14].equals("alquiler")? Estado.ALQUILER : partes[14].equals("reserva") ? Estado.RESERVA: partes[14].equals("lavado")? Estado.LAVADO : Estado.MANTENIMIENTO;
				Vehiculo vehiculoCategoria = new Vehiculo(placa, marca, modelo, color, tipoTransmision, estado, categoriaActual);
				categoriaActual.agregarVehiculo(vehiculoCategoria);
				linea = br.readLine();
				
				
			}
			if (categoriaActual != null) {
			    categorias.add(categoriaActual);
			}
			
			
			br.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Se produjo un Error ");
		}
		
		
	}
	

}
