package complejoDeportivo;

public class Cancha {
    private String nombre;
	private double precio;
	private String deporte;
	private int capacidad;
	
	
	public Cancha(double precio, String deporte, int capacidad) {
		
		this.precio = precio;
		this.deporte = deporte;
		this.capacidad = capacidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean esIgual(Cancha otra) {
		return nombre.equals(otra.getNombre())&&
				deporte.equals(otra.getDeporte());
	}
	
}
