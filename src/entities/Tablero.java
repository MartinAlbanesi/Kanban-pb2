package entities;

import java.util.*;

public class Tablero {
	private ArrayList<Tarea> tareas;
	private HashSet<Usuario> usuarios;
	
	public Tablero() {
		this.tareas = new ArrayList<Tarea>();
		this.usuarios = new HashSet<Usuario>();
	}

	public HashSet<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashSet<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void agregarUsuario(Usuario usuarioCualquiera) {
		usuarios.add(usuarioCualquiera);
	}
	
	
}
