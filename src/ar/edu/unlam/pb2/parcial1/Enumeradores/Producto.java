package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Producto {
 

	
	protected Integer codigo;
	protected String descripcion;
	protected Estado estado;

	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estado = estado.DISPONIBLE;
	}

	public Estado getEstadoActual() {
		
		return this.estado;
	}
}
