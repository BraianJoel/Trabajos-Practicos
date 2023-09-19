public class AlarmaLuminosa extends Alarma{
    //private Luz luz;

    
    public AlarmaLuminosa(boolean rompeVidrio, boolean abrioPuertaVent, boolean detectarMovimiento, Luz luz, Timbre timbre) {
        super(rompeVidrio, abrioPuertaVent, detectarMovimiento, timbre,luz);
        //this.luz = luz;
    }

   /*  public Luz getLuz() {
        return luz;
    }


    public void setLuz(Luz luz) {
        this.luz = luz;
    }*/
     public void comprobar(){
        super.comprobar();
        //if(rompeVidrio || abrioPuertaVent || detectarMovimiento){
            luz.encender();
            timbre.hacerSonar();
           
        //}
    
    }
}