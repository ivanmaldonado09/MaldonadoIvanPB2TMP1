package ar.edu.unlam.pb2.parcial1.Enumeradores;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;



public class Videoclub {

	private String nombre;
	private List<Producto> productos;
	
	public Videoclub(String nombre) {
	this.nombre = nombre;
	this.productos = new LinkedList<>();
	}

	public void agregarProducto(Producto nuevoProducto) {
	this.productos.add(nuevoProducto);
		
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		for (int i = 0; i < this.productos.size(); i++) {
			if(this.productos!=null)
				return nuevoProducto;
		}
		return null;
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		if(nuevoProducto.estado.equals(Estado.DISPONIBLE)) {
			nuevoProducto.estado = Estado.VENDIDO;
			return true;
		}
		return false;
	}

}
