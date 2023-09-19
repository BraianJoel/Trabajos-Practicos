public class Main {
    public static void main(String[] args) {
        Luz luz= new Luz();
        Timbre timbre= new Timbre();
        
        Alarma alarma = new Alarma(false, false, false, timbre, luz);
        alarma.setRompeVidrio(true);
        alarma.comprobar();

    }    

}
