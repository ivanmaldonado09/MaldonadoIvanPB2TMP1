package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Libro extends Producto implements Vendible {

	private String autor;
	private String editorial;

	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor = autor;
		this.editorial = editorial;

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public Double precioDeVenta() {
		return null;
	}

	@Override
	public void setPrecioVenta(Double precio) {
		// TODO Auto-generated method stub

	}

}
