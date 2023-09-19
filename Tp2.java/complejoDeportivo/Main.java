package complejoDeportivo;

import java.time.Duration;

public class Main {

	public static void main(String[] args) {
		Cancha f1= new Cancha(400,"Futbol", 10);
		
		Complejo cc1 = new Complejo();
		
		cc1.addCanchaFutbol(f1);
		

		System.out.println(); 
	}

}
