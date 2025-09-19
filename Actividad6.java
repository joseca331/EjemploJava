package actividades;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("introduce la primera nota: ");
		
		int nota1 = sc.nextInt();
		
		System.out.println("introduce la segunda nota");
		
		
		int nota2 = sc.nextInt();
		

		double notaMedia = (nota1 + nota2)/2;
		
		
		System.out.print("la nota media es: " + notaMedia);
		
		
		
		
		
		

	}

}
