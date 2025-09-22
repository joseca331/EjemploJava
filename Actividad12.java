package actividades;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		double numero = scanner.nextDouble();

		double valorAbsoluto = Math.abs(numero);

		        System.out.println("El valor absoluto es: " + valorAbsoluto);
		    }
		}
