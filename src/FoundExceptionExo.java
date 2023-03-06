import java.util.Scanner;

public class FoundExceptionExo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Saisissez une première valeur :");
			int valueOne = scan.nextInt();
			System.out.println("Saisissez une seconde valeur :");
			int valueTwo = scan.nextInt();
			Operations(valueOne, valueTwo);
		} catch(java.lang.ArithmeticException ae) {
			System.out.println("C'est une exception arithmétique " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("C'est une exception " + e);
		} finally {
			System.out.println("On passe toujours par ici !");
		}
		scan.close();
	}
	
	public static void Operations(double a, double b) throws ArithmeticException, Exception {
		if(b == 0) throw new ArithmeticException("-> division par zéro");
	}
}