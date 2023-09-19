import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Duration;

public class Reunion {
    private String tema;
    //private double duracion;
    private String lugar;
    private double fin;
    private double inicio;
    private int cantReunion;
    private ArrayList<persona>listaPersonas;
    private LocalDate fecha;
    private  Duration duracion;
    private LocalTime localTime1;
    private LocalTime localTime2;

    public Reunion ( String tema, double duracion, String lugar, int cantReunion ) {
        //this.fecha= fecha;
        this.tema=tema;
        //this.duracion = duracion;
        this.lugar=lugar;
        listaPersonas = new ArrayList<persona>();
        LocalDate localDate = LocalDate.of(0,0,0);
        LocalDate hoy = LocalDate.now();
        Period dias4 = Period.ofDays(4);
        
       
        
    }
    public Reunion(double fin, double inicio) {
        this.fin = fin;
        this.inicio = inicio;
    }
    public Reunion(int cantReunion){
        this.cantReunion= cantReunion;
    }
    //public String getFecha() {
       // return fecha;
    //}

    //public void setFecha(String fecha) {
     //   this.fecha = fecha;
    //}

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    //public double getDuracion() {
     //   return duracion;
    //}

    //public void setDuracion(double duracion) {
      //  this.duracion = duracion;
    //}

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void ListaPersona() {
        ArrayList<persona> arreglo = new ArrayList<persona>();
		
		arreglo.add(new persona(20));
		persona l = arreglo.get(0);
		arreglo.add(0, new persona(9));
		arreglo.size();
		System.out.println(arreglo);
		for(int i=0; i<arreglo.size();i++) {
			System.out.println(listaPersonas);
		}
    }
    public String getDatosCompletos() {
		return tema + "-" + duracion + "-" + lugar + "-" + listaPersonas;
	}

    //public boolean horaSePisa( t1) {
    //if((duracion.equals(t1.getDuracion()))&&(fecha.equals(t1.getFecha))){

    //}
	//}
    public  Duration getDuration () {
        LocalTime localTime1 = LocalTime.of(10 , 20);
        LocalTime localTime2 = LocalTime.of(17, 35);
        Duration duracion = Duration.between(localTime1, localTime2); 

        return duracion;
    }
    
}

