package entities;

public class Tarea {
	private String nombre;
	private EstadoDeLasTareas estado;
	private Usuario creador;
	private Usuario actual;
	
	public Tarea(String nombre, Usuario creador) {
		this.nombre = nombre;
		this.creador = creador;
		estado = EstadoDeLasTareas.PENDIENTE;
	}
	
	

}
