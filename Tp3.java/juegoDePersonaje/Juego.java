//import java.util.ArrayList;

public class Juego {
    private Personaje[]villanos;
    private Personaje[]heroes;
    //private ArrayList<Jugador>jugadores;
    //private ArrayList<Personaje>carta;
    private int contadorV =0;
    private int contadorH=0;
    
    public Juego(Personaje[]villanos, Personaje[]heroes) {
        villanos = new Personaje[3];
        heroes = new Personaje[3];
    } 
    public void addVillanos(Personaje r) {
        if(contadorV<=villanos.length){
             villanos[contadorV]= r;
             contadorV ++;
        }

    }
    public void addHeroes(Personaje t) {
        if(contadorH<=heroes.length){
            heroes[contadorH]=t;
            contadorH ++;
        }
    }
    // comparar  según caracteristicas de los personajes quien gana o pierde


    public String getResultado(Personaje r , Personaje t){
        int i=0;
        int j=0;
        Caracteristica[]CaracteristicaR=r.getCaracteristicas();
        Caracteristica[]CaracteristicaT=t.getCaracteristicas();

        while(i<CaracteristicaR.length){

            while(j<CaracteristicaT.length){
                CaracteristicaR[i].equals(CaracteristicaT[j]);
                if(i<j){
                    return ("Gana super Heroe");

                }else
                    return ("Gana villano");
            }
            i++;
        } return ("empataron");
    }
}
