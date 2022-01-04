import mundo.interfac.IDevolucion;
public class Playera extends Ropa implements IDevolucion{
	public String corte;
	public boolean devuelto;
	//Constructor
	public Playera(int id, double precio, int talla, String color, String corte) {
		super(id, precio, talla, color);
		devuelto = false;
		this.corte = corte;
	}
	//Getters y setters
	public String getCorte() {
		return corte;
	}
	//Metodos
	@Override
	public void hacerDevolucion() {
		devuelto = true;
	}
	public void mostrarDatos() {
		System.out.println("\n\n\n\t\t\t\t DATOS DEL PRODUCTO: PLAYERA");
		System.out.println("\n\t\t\t\t ID:"+getId());
		System.out.println("\n\t\t\t\t Precio:"+getPrecio());
		System.out.println("\n\t\t\t\t Talla:"+getTalla());
		System.out.println("\n\t\t\t\t Color:"+getColor());
		System.out.println("\n\t\t\t\t Corte:"+getCorte());

		
		if (devuelto == true) {
			System.out.println("\n\t\t\t\t La playera  fue devuelta");
		}else {
			System.out.println("\n\t\t\t\t La playerano fue devuelta");
		}
	}
}
