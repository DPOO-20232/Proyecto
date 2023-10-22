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
			BufferedReader br = new BufferedReader(new FileReader("./data/Sede.txt"));
			Sede sedeActual = null;
			Sede sedeRecogida = null;
			
			if (br != null) {
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
					int numeroLicenciaSede = Integer.parseInt(partes[23]);
					String paisExpedicionLicencia = partes[24];
					LocalDate fechaVencimientoLicencia = LocalDate.parse(partes[25], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					File fotoLicencia = new File(partes[43]);
					LicenciaConduccion licenciaConductorAdicionalSede = new LicenciaConduccion(numeroLicenciaSede, paisExpedicionLicencia, fechaVencimientoLicencia, fotoLicencia);
					ArrayList<ConductorAdicional> conductoresAdicionalesSede = new ConductorAdicional(licenciaConductorAdicionalSede);
					String nombreSeguroSede = partes[44];
					Double costoSeguroSede = Double.parseDouble(partes[45]);
					ArrayList<Seguro> segurosAdicionalesSede = new Seguro(nombreSeguroSede, costoSeguroSede);
					Alquiler vehiculoEnAlquilerSede = new Alquiler(conductoresAdicionalesSede, segurosAdicionalesSede, placaVehiculoAlquiladoSede);
					String nombreCategoriaReservadaSede = partes[44];
					Categoria categoriaReservadaSede = new Categoria(nombreCategoriaReservadaSede, tarifaAlta, tarifaBaja);
					Reserva reservasActivas = new Reserva(categoriaReservadaSede);
					String sedeRecogidaEn = partes[46];
					String sedeEntregaEn = partes[47];
					ArrayList<Renta> rentasActivas = new Renta (fechaInicioRentaSede, fechaFinRentaSede, rangoHorarioEntregaSede, tarifaSede, vehiculoEnAlquilerSede, reservasActivas, sedeRecogidaEn, sedeEntregaEn);
	                
	            }

	            if (sedeActual != null) {
	                sedes.add(sedeActual);
	            }
					
				
				br.close();
			} else {
				JOptionPane.showConfirmDialog(null, "El archivo de texto no existe");
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Se produjo un Error ");
		}
		
		
	}

}
