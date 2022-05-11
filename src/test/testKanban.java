package test;

import static org.junit.Assert.*;
import org.junit.Test;
import entities.Tablero;

public class testKanban {

	@Test
	public void queSePuedaCrearUnTableroKanban() {
		//Preparacion
		Tablero nuevo;
				
		//Ejecucion
		nuevo = new Tablero();
				
		//Validacion
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaCrearUnaTarea() {
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuario() {
		
	}
	
	@Test
	public void queSePuedanAgregarTareas() {
		
	}
	
	@Test
	public void queSePuedanActualizarTareas() {
		
	}

}
