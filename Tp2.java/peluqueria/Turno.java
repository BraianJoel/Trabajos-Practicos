import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
    private LocalDate fecha;
    private LocalTime inicio;
    private LocalTime fin;
    private Cliente cliente ;
    private Peluquero nombre;

    public Turno(LocalDate fecha, LocalTime inicio, LocalTime fin, Peluquero nombre) {
        this.fecha = fecha;
        this.inicio = inicio;
        this.fin = fin;
        this.cliente = null;
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getFin() {
        return fin;
    }

    public void setFin(LocalTime fin) {
        this.fin = fin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Peluquero getNombre() {
        return nombre;
    }

    public void setNombre(Peluquero nombre) {
        this.nombre = nombre;
    }
    public boolean estaDisponible() {
       return (cliente == null);
    }
    




}
