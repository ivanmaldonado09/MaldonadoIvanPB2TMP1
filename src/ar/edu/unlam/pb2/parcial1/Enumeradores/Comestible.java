package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Comestible implements Vendible{

	private Integer codigo;
	private String descripcion;
	
	public Comestible(Integer codigo, String descripcion) {
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
