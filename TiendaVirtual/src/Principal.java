import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.mundotelf.*;
public class Principal {
	public static void main(String[] args) {
		int opcion = 0, opcion2=0;
		Scanner ingreso = new Scanner(System.in);
		//Construccion de objetos y llenar datos
		//Ropa
		Playera playera = new Playera(01, 15.00, 36, "Azul", "V");
		Jeans jean = new Jeans(02, 10.00, 42, "Negro", "Cintura", "Chicle");
		PlayeraPersonalizada playeraP= new PlayeraPersonalizada(03, 8.00, "Rojo", 34, "@natty317");
		SmartPhone smartPhone = new SmartPhone(04, "Bajo recarga", 600.00, "Iphone", "Iphone X", "32 GB");
		TelefonoHogar telefonoHogar = new TelefonoHogar(05, "No tiene acceso a datos", 25.00, "Movil", "Departamento", true);
		
		do {
			boolean j=false; 
			while(j==false) {
		System.out.println("                         _________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t MENU PRINCIPAL");
		System.out.println("                         _________________________________________________________________________________________________");
		System.out.println("\n\t\t\t\t\t\t\t     OPCIONES DE LA TIENDA");
		System.out.println("\n\t\t\t\t\t\t 1.Devolver producto");
		System.out.println("\n\t\t\t\t\t\t 2.Lectura de productos");
		System.out.println("\n\t\t\t\t\t\t 3.Salir");
		System.out.println("                         _________________________________________________________________________________________________");
		try {
			System.out.print("\n\n\t\t\t\t Seleccion:");
			opcion=ingreso.nextInt();
		}catch(java.util.InputMismatchException e) {
			System.out.println("\n\t\t\t\t Solo se admiten números");
			ingreso.nextLine();
		} 
		//java.util.InputMismatchException
		switch(opcion) {
		case 1:
			System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 1: Seleccione el producto a devolver");
			System.out.println("\n\t\t\t\t\t\t 1.Playera");
			System.out.println("\n\t\t\t\t\t\t 2.Jeans");
			System.out.println("\n\t\t\t\t\t\t 3.Smartphone");
			System.out.println("\n\t\t\t\t\t\t 4.Telefono para hogar");
			try {
				System.out.print("\n\n\t\t\t\t Seleccion:");
				opcion2=ingreso.nextInt();
			}catch(java.util.InputMismatchException e) {
				System.out.println("\n\t\t\t\t Solo se admiten números");
				ingreso.nextLine();
			} 
			switch(opcion2) {
			case 1:System.out.println("\n\t\t\t\t Se ha devuelto el producto Playera");
			        playera.hacerDevolucion();
			        break;
			case 2:System.out.println("\n\t\t\t\t Se ha devuelto el producto Jeans");
	               jean.hacerDevolucion();
	               break;
			case 3:System.out.println("\n\t\t\t\t Se ha devuelto el producto Smartphone");
			       smartPhone.hacerDevolucion();
	               break;
			case 4:System.out.println("\n\t\t\t\t Se ha devuelto el producto Telefono para hogar");
			       telefonoHogar.hacerDevolucion();
	               break;
			}
			break;
		case 2:
			System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 2:Seleccione que producto desea leer");
			playera.mostrarDatos();
			jean.mostrarDatos();
			playeraP.mostrarDatos();
			smartPhone.mostrarDatos();
			telefonoHogar.mostrarDatos();			
			break;

		case 3:
			System.out.println("Ud ha salido del programa");
			System.exit(3);
		default:
			System.out.println("\n\t\t\t\t La opción ingresada no es válida solo se admiten números entre 1 y 3");
		}

		j=true;
	}
}while(opcion !=3);
	}}