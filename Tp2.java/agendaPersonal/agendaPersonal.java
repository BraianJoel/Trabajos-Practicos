import java.util.ArrayList;

public class agendaPersonal {
    private int reunion ;
    private ArrayList<Reunion>listaReunion = 0;
    
   
    public agendaPersonal(int reunion) {
        this. reunion = reunion;
    }

    public int getReunion() {
        return reunion;
    }

    public void setreunion(int reunion) {
        this.reunion = reunion;
        
    }   
    public void listaReunion() {
        ArrayList<Reunion> arreglo = new ArrayList<Reunion>();
		
		arreglo.add(new Reunion(20));
		Reunion p = arreglo.get(0);
		arreglo.add(0, new Reunion(9));
		arreglo.size();
		
		
		for(int i=0; i<arreglo.size();i++) {
			System.out.println(arreglo);
		}
    }
        
}
