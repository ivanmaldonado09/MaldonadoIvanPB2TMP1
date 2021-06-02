package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Videojuego implements Alquilable{

	private Integer codigo;
	private String descripcion;
	private TipoDeConsola tipo;
	private Double precioAlquiler;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
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

	public TipoDeConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
	}

	@Override
	public Double precioDeAlquiler() {

		return this.precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
		
	}

}
