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
			if (this.productos != null)
				this.productos.set(i, nuevoProducto);
			return nuevoProducto;
		}
		return null;
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto producto = buscarProducto(nuevoProducto);
		if (producto.estado.equals(Estado.DISPONIBLE)) {
			producto.estado = Estado.VENDIDO;
			nuevoProducto.poseedor = nuevoCliente;
			return true;
		}
		return false;
	}

	public Boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto producto = buscarProducto(nuevoProducto);
		if (producto.estado.equals(Estado.DISPONIBLE) && nuevoCliente.getEdad() >= 18) {
			producto.estado = Estado.ALQUILADO;
			producto.poseedor = nuevoCliente;
			return true;
		}
		return false;
	}

	public Boolean devolver(Producto nuevoProducto, Cliente nuevoCliente) {
		Producto producto = buscarProducto(nuevoProducto);
		if (producto.estado.equals(Estado.ALQUILADO)) {
			producto.estado = Estado.DISPONIBLE;
			return true;
		}
		return false;
	}
}
