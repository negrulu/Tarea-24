package cajero.automatico;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		String valorARetirar;
		String nuevaClave;
		
		do {
			System.out.println("**Banco del Pichincha seleccione una opción***\r\n"
					+ "\r\n"
					+ "1. Retirar dinero\r\n"
					+ "\r\n"
					+ "2. Cambiar de clave\r\n"
					+ "\r\n"
					+ "3. Bloquear cuenta\r\n"
					+ "\r\n"
					+ "4. SALIR");
			respuesta = entrada.nextInt();
			
			if (respuesta == 1) {
				System.out.println("Ingrese valor a retirar: ");
				Scanner entradaRespuesta1 = new Scanner(System.in);
				valorARetirar = entradaRespuesta1.nextLine();
				
				System.out.println("El valor a retirar es: "+valorARetirar);
			} else if (respuesta == 2) {
				System.out.println("Ingrese nueva clave: ");
				Scanner entradaRespuesta2 = new Scanner(System.in);
				nuevaClave = entrada.nextLine();
				System.out.println("Su clave ha sido cambiada");
			} else {
				System.out.println("Su cuenta ha sido bloqueada");
			}
			
		}while(respuesta == 4);
	}

}
