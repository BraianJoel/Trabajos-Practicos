package complejoDeportivo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

	private LocalDate fecha;
	private LocalTime  horaInicio;
	private Persona usuario;
	private Cancha canchita;
	private LocalTime horaFin;
	
	
	public Turno(LocalDate fecha, LocalTime hora, Persona usuario, Cancha canchita) {
		this.fecha = fecha;
		this.horaInicio = hora;
		this.usuario = usuario;
		this.canchita = canchita;
		this.horaFin = LocalTime.of(hora.getHour()+1, hora.getMinute());
	}
	
	
	
	

	public Turno(LocalDate fecha, LocalTime horaInicio, Persona usuario, Cancha canchita, LocalTime horaFin) {
		super();
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.usuario = usuario;
		this.canchita = canchita;
		this.horaFin = horaFin;
	}





	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime hora) {
		this.horaInicio = hora;
	}

	public Persona getUsuario() {
		return usuario;
	}

	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

	public Cancha getCancha() {
		return canchita;
	}

	public void setCancha(Cancha canchita) {
		this.canchita = canchita;
	}
	
	public LocalTime getHoraFin() {
		return horaFin;
	}





	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}





	public boolean choca(Turno t1) {
		if ((canchita.esIgual(t1.getCancha()))&&
		    (fecha.equals(t1.getFecha()))){

			LocalTime x =t1.getHoraInicio();
			LocalTime y =t1.getHoraFin();
           if ((horaInicio.isAfter(y))||(horaFin.isBefore(x))||
        		   (horaFin.equals(x))||(horaInicio.equals(y))){
        	   return false;
           } else {
        		   return true;
        	   }
           }
		 
		
		return false;
	}
	
	
	
}
