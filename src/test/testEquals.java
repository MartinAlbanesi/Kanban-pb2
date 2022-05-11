package test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

import entities.Tablero;
import entities.Usuario;

public class testEquals {

	@Test
	public void queSePuedaValidarQueDosUsuariosSonIgualesATravesDelOperadorIgualIgual() {
		Usuario usuarioActual = new Usuario("Walter");
		Usuario usuarioEsperado = new Usuario("Walter");
		
		if(usuarioActual == usuarioEsperado) {
			System.out.println("Los usuarios son iguales");
		}
		else {
			System.out.println("Los usuarios son diferentes");
		}
	}
	
	@Test
	public void queSePuedaValidarQueDosUsuariosSonIgualesATravesDelEquals() {
		Usuario usuarioActual = new Usuario("Walter");
		Usuario usuarioEsperado = new Usuario("Walter");
		
		if(usuarioActual.equals(usuarioEsperado)) {
			System.out.println("Los usuarios son iguales");
		}
		else {
			System.out.println("Los usuarios son diferentes");
		}
	}
	
	@Test
	public void queSePuedaValidarQueDosUsuariosSonIgualesATravesDelNombreUtilizandoOperadorIgualIgual() {
		Usuario usuarioActual = new Usuario("Walter");
		Usuario usuarioEsperado = new Usuario("Walter");
		
		if(usuarioActual.getNombre() == usuarioEsperado.getNombre()) {
			System.out.println("Los usuarios son iguales");
		}
		else {
			System.out.println("Los usuarios son diferentes");
		}
	}
	
	@Test
	public void queSePuedaValidarQueDosUsuariosSonParecidos() {
		Usuario usuarioActual = new Usuario("walter@unlam.edu.ar");
		Usuario usuarioEsperado = new Usuario("walter");
		
		if(usuarioActual.getNombre().contains(usuarioEsperado.getNombre())) {
			System.out.println("Los usuarios son iguales");
		}
		else {
			System.out.println("Los usuarios son diferentes");
		}
	}
	
	@Test
	public void queSePuedaValidadSiElTableroContieneUnUsuario() {
		Usuario usuarioCualquiera = new Usuario("juanramon@unlam.edu.ar");
		Usuario usuarioEsperado = new Usuario("walter@unlam.edu.ar");
		Usuario noLoAgregamos = new Usuario("andres@unlam.edu.ar");
		Tablero actual = new Tablero();
		
		actual.agregarUsuario(usuarioCualquiera);
		actual.agregarUsuario(usuarioEsperado);
		
		HashSet<Usuario> usuariosEnElTablero = actual.getUsuarios();
		
		assertTrue(usuariosEnElTablero.contains(usuarioEsperado));
		assertFalse(usuariosEnElTablero.contains(noLoAgregamos));
	}


}
