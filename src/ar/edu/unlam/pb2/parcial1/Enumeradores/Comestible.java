package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Comestible extends Producto implements Vendible {

	public Comestible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.codigo = codigo;
		this.descripcion = descripcion;
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

	@Override
	public Double precioDeVenta() {
		return null;
	}

	@Override
	public void setPrecioVenta(Double precio) {
		// TODO Auto-generated method stub

	}

}
