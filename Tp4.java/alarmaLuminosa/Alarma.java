public class Alarma{
    protected boolean rompeVidrio;
    protected boolean abrioPuertaVent;
    protected boolean detectarMovimiento;
    protected Timbre timbre;
    protected Luz luz;

    
    public Alarma(boolean rompeVidrio, boolean abrioPuertaVent, boolean detectarMovimiento, Timbre timbre,Luz luz) {
        this.rompeVidrio = rompeVidrio;
        this.abrioPuertaVent = abrioPuertaVent;
        this.detectarMovimiento= detectarMovimiento;
        this.timbre= timbre;
        this.luz=luz;
    }
    public boolean isRompeVidrio() {
        return rompeVidrio;
    }
    public void setRompeVidrio(boolean rompeVidrio) {
        this.rompeVidrio = rompeVidrio;
    }
    public boolean isAbrioPuertaVent() {
        return abrioPuertaVent;
    }
    public void setAbrirPuertaVent(boolean abrirPuertaVent) {
        this.abrioPuertaVent = abrirPuertaVent;
    }
    
    public boolean isDetectarMovimiento() {
        return detectarMovimiento;
    }
    public void setDetectarMovimiento(boolean detectarMovimiento) {
        this.detectarMovimiento = detectarMovimiento;
    }
    
   
    public void comprobar(){
        if(rompeVidrio || abrioPuertaVent || detectarMovimiento){
            timbre.hacerSonar();
            luz.encender();
        }
    }

}
