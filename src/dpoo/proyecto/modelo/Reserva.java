package dpoo.proyecto.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Reserva {
	
	public Categoria categoriaReservada;

	public Reserva(Categoria categoriaReservada) {

		this.categoriaReservada = categoriaReservada;
	}

	public Categoria getCategoriaReservada() {
		return categoriaReservada;
	}

	public void setCategoriaReservada(Categoria categoriaReservada) {
		this.categoriaReservada = categoriaReservada;
	}

}
