package actividades;
		import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {



		   
		        Scanner scanner = new Scanner(System.in);

		        // Pedir los coeficientes
		        System.out.print("Introduce el coeficiente a: ");
		        double a = scanner.nextDouble();

		        System.out.print("Introduce el coeficiente b: ");
		        double b = scanner.nextDouble();

		        System.out.print("Introduce el coeficiente c: ");
		        double c = scanner.nextDouble();

		        // Calcular el discriminante
		        double discriminante = b * b - 4 * a * c;

		        // Verificar si hay soluciones reales
		        if (discriminante > 0) {
		            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
		            System.out.println("Soluciones reales:");
		            System.out.println("x1 = " + x1);
		            System.out.println("x2 = " + x2);
		        } else if (discriminante == 0) {
		            double x = -b / (2 * a);
		            System.out.println("Solución única real:");
		            System.out.println("x = " + x);
		        } else {
		            System.out.println("No existen soluciones reales.");
		        }

		
		    }
		}
