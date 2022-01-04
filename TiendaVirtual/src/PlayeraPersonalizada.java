
public class PlayeraPersonalizada extends Ropa{
	
	public String Twitter;

	//Constructor
	public PlayeraPersonalizada(int id, double precio, String color, int talla, String twitter) {
		super(id, precio, talla, color);
		Twitter = twitter;
	}

	//Getters y setters
	public String getTwitter() {
		return Twitter;
	}
	
	
   //Metodos
	public void mostrarDatos() {
		System.out.println("\n\n\n\t\t\t\t DATOS DEL PRODUCTO: PLAYERA PERSONALIZADA");
		System.out.println("\n\t\t\t\t ID:"+getId());
		System.out.println("\n\t\t\t\t Precio:"+getPrecio());
		System.out.println("\n\t\t\t\t Talla:"+getTalla());
		System.out.println("\n\t\t\t\t Color:"+getColor());
		System.out.println("\n\t\t\t\t Twiter que va a ser estampado:"+getTwitter());
		System.out.println("\n\t\t\t\t No se puede hacer devolucion de este producto");


	}
	
}
