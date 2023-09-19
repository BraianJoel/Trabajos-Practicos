package complejoDeportivo;

public class Persona {

	
	private String nombre;
    private boolean esSocio;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean esSocio() {
		return esSocio;
	}
	
	public boolean esElMismo(Persona p1) {
		return p1.getNombre().equals(p1);
	}
}
