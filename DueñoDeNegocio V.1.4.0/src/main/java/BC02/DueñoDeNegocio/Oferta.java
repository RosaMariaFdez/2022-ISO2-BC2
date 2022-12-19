public class Oferta {

	private int idOferta;
	private String nombre;
	private double precio;
	private int puntos;
	private string fechaInicio;
	private string fechaFin;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public string getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(string fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public string getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(string fechaFin) {
		this.fechaFin = fechaFin;
	}

}