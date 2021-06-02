package ar.edu.unlam.pb2.parcial1.Enumeradores;

import java.util.LinkedList;
import java.util.List;

public class Producto {
 

	
	protected Integer codigo;
	protected String descripcion;
	protected Estado estado;
	protected Cliente poseedor;
	
	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estado = Estado.DISPONIBLE;
	
	}

	
	public Estado getEstadoActual() {
		
		return this.estado;
	}

	public Cliente getQuienPoseeElProducto() {
		
		return this.poseedor;
	}
}
