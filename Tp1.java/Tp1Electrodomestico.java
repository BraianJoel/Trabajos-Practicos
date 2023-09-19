

public class Tp1Electrodomestico {
    private String nombre;
    private String color;
    private double consumo;
    private double precio;
    private double peso;

     public Tp1Electrodomestico (String nombre) {
        this. color = "Gris plata";
        this.consumo = 10;
        this. precio = 100;
        this. peso = 2;
        this. nombre = nombre;
    }   
    public Tp1Electrodomestico(String nombre, String color, double consumo, double precio, double peso) {
        this. nombre = nombre;
        this. color = color;
        this.consumo = consumo;
        this. precio = precio;
        this. peso = peso;
    }   
    public String getNombre() {
		return nombre;
	  } 
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public void setColor(String color) {
      this.color = color;
    }
    public void setConsumo(double consumo) {
      this.consumo = consumo;
    }
    public String getColor() {
		  return color;
	  } 
     public double getConsumo() {
      return consumo;
    } 
    public double getPrecio() {
      return precio;
    }
    public void setPrecio(double precio) {
      this.precio = precio;
    }
    public double getPeso() {
      return peso;
    }
    public void setPeso(double peso) {
      this.peso = peso;
    }
    public boolean esBajoConsumo(){
      if(this.consumo<45){
        return true;
        
      }
      else {
        return false;
      }

    }
    public double calcularBalance(){
      return this.precio/this.peso;
    }
    public boolean esDeAltaGama(){
      if(calcularBalance()>3){
        return true;
      } else {
        return false;
      }
    }
    
    
       
}
