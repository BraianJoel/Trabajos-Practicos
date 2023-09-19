public class Caracteristica {
    private String nombreHabilidad;
    private int nivelHabilidad;

    public Caracteristica(String nombreHabilidad, int nivelHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
        this.nivelHabilidad = nivelHabilidad;
    }
    public String getNombreHabilidad() {
        return nombreHabilidad;
    }
    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }
    public int getNivelHabilidad() {
        return nivelHabilidad;
    }
    public void setNivelHabilidad(int nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }
    
    public boolean equals(Object c) {
        try{
        Caracteristica Aux =(Caracteristica) c;
        return this.nombreHabilidad.equals(Aux.getNombreHabilidad());//comparar con las caracterisitcas por nombres del personaje,para comparar strings se usa equals double float int null se usa ==( va direccion de memoria)
        } catch(Exception e){
            return false;
        }
    }
  

}
