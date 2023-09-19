public class Cliente {
    private String nombre;
    private boolean esFrecuente;
    private Turno ultimoTurno;
   

    public Cliente(String nombre) {
        this.nombre = nombre;
       
    }
    public Cliente(boolean esFrecuente, Turno ultimoTurno) {
        this.esFrecuente = esFrecuente;
        this.ultimoTurno = ultimoTurno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEsfrecuente() {
        return esFrecuente;
    }
    public Turno getUltimoTurno() {
        return ultimoTurno;
    }
    public void setUltimoTurno(Turno ultimoTurno) {
        this.ultimoTurno = ultimoTurno;
       
    }
    public void setEsfrecuente(boolean esFrecuente) {
        this.esFrecuente = esFrecuente;
    }
  

    
}

