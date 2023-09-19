package complejoDeportivo;

import java.time.LocalDate;

public class Complejo {
   
	private Cancha[] canchasFutbol;
	private int cantidadCanchasFutbol;
	private Cancha[] canchasPadle;
	private Persona[] socios;
	private Turno[] turnosFutbol;
	private int cantidadTurnosFutbol;
	private Turno[] turnosPadle;
	
	private double descuento;
	
	private int minimoSocio=4;
	
	public Complejo() {
		canchasFutbol = new Cancha[10];
		cantidadCanchasFutbol=0;
		
	}
	
	public void addCanchaFutbol(Cancha futbol) {
		if (cantidadCanchasFutbol<canchasFutbol.length) {
			canchasFutbol[cantidadCanchasFutbol]=futbol;
			cantidadCanchasFutbol++;
		}
	}
	
	public boolean puedoAlquilarCanchaFutbol(Turno t1) {
		for(int i=0;i<cantidadTurnosFutbol;i++) {
			if (turnosFutbol[i].choca(t1)) {
				return false;
			}
		}
		return true;
	}
	
	public double getPrecio(Cancha c1, Persona p1) {
		if (esSocio(p1)) {
			return c1.getPrecio()*(1-descuento);
		}
		return c1.getPrecio();
	}
	
	public boolean esSocio(Persona p1) {
		LocalDate dosMeses = (LocalDate.now()).minusMonths(2);
		int contador =0;
		for(int i =0; i<cantidadTurnosFutbol;i++) {
			Turno t1 = turnosFutbol[i];
			if(t1.getUsuario().esElMismo(p1)&&
					t1.getFecha().isAfter(dosMeses))
				 contador ++;
			    
		}
		
		return contador>minimoSocio;
	}
	
}
