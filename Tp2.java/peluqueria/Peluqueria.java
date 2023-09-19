import java.time.LocalTime;
import java.time.LocalDate;

public class Peluqueria {
    private Peluquero[]peluqueros;
    private int cantPeluquero = 4;
    private Turno[]turnos;
    private int cantTurnos = 9;
    private int ultimoTurnoAgregado = 0;
    private int duracionTurno = 1;

    public Peluqueria() {
       peluqueros= new Peluquero[cantPeluquero];
       turnos= new Turno[cantTurnos];

    }
    public void agregarturno(int peluquero, LocalTime inicio, LocalDate fecha){
        turnos[ultimoTurnoAgregado]= new Turno(fecha, inicio, inicio.plusHours(duracionTurno), peluqueros[peluquero]);
        ultimoTurnoAgregado++;

    }
    public Turno disponiblePeluquero(int peluquero) { // El sistema además de registrar los turnos, debe poder buscar
        //el primer turno disponible, también el primero disponible con un determinado
        //peluquero  
        Peluquero p1= peluqueros[peluquero];
        int puntero = 0; //indice de recorrido del arreglo
        while((puntero<cantTurnos) && (!p1.equals(turnos[puntero].getNombre()))&&(turnos[puntero].estaDisponible())){
            puntero ++;
        }
        if(!p1.equals(turnos[puntero].getNombre())){
            
            if(turnos[puntero].estaDisponible()){

                return turnos[puntero];
            }else 
                return null;

        }else {

            return null;
        }
        
    }
    public Turno disponibleTurno() {
        int puntero= 0;
        while((puntero<turnos.length)&&(turnos[puntero].estaDisponible())){
            puntero ++;
            
        }
        if((turnos[puntero].estaDisponible())){
            return turnos[puntero];
        }else
            return 


    }
}