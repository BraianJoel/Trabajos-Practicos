public class Personaje {
    private String nombre;
    private String nombrePersonaje;
    private Caracteristica[]Caracteristicas;
    //private double peso;
    //private double altura;
    //private int edad;

    public Personaje(String nombre, String nombrePersonaje) {
        this.nombre = nombre;
        this.nombrePersonaje = nombrePersonaje;
        Caracteristicas = new Caracteristica[5];
        //this.peso = peso;
        //this.altura = altura;
        //this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }
    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }
    public Caracteristica[] getCaracteristicas() {
        return Caracteristicas;
    }
    public void setCaracteristicas(Caracteristica[] caracteristicas) {
        Caracteristicas = caracteristicas;
    }
    /*public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }*/
    public static void main (String[]args){
        Personaje p1 = new Personaje("Dylan", "Delariel");
        Personaje p2 = new Personaje("Simon", "Mordord");
        Personaje ganador= p1.getResultado(p2);
        System.out.println(ganador.getNombre());
    }
}
