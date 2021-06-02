package ar.edu.unlam.pb2.parcial1.Enumeradores;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Pelicula extends Producto implements Alquilable, Vendible {

	
	private Genero genero;
	private Integer anoEstreno;
	private String director;
	private List<String> actores;
	private Double precioVenta;
	private Double precioAlquiler;

	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoEstreno, String director) {
		super(codigo, descripcion);
		this.genero = genero;
		this.anoEstreno = anoEstreno;
		this.director = director;
		this.actores = new LinkedList<>();
		this.precioVenta = 0.0;
		this.precioAlquiler = 0.0;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoEstreno;
	}

	public void setAnoDeEstreno(Integer anoEstreno) {
		this.anoEstreno = anoEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public Double precioDeVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public Double precioDeAlquiler() {
		return this.precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public void agregarActor(String actorAAgregar) {
		this.actores.add(actorAAgregar);

	}

	public Boolean actua(String actor) {
		for (String string : actores) {
			if (string.equals(actor))
				return true;
		}
		return false;
	}

}
