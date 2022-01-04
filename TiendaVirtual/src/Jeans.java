import mundo.interfac.IDevolucion;
public class Jeans extends Ropa implements IDevolucion {
	public String Corte;
	public String Genero;
	public boolean devuelto;
	//Constructor
	public Jeans(int id, double precio, int talla, String color, String corte, String genero) {
		super(id, precio, talla, color);
		devuelto = false;
		Corte = corte;
		Genero = genero;
	}
	//Getters y setters
	public String getCorte() {
		return Corte;
	}
	public String getGenero() {
		return Genero;
	}
	//Metodos
	@Override
	public void hacerDevolucion() {
		devuelto = true;
	}
	public void mostrarDatos() {
		System.out.println("\n\n\n\t\t\t\t DATOS DEL PRODUCTO: JEAN");
		System.out.println("\n\t\t\t\t ID:"+getId());
		System.out.println("\n\t\t\t\t Precio:"+getPrecio());
		System.out.println("\n\t\t\t\t Talla:"+getTalla());
		System.out.println("\n\t\t\t\t Color:"+getColor());
		System.out.println("\n\t\t\t\t Corte:"+getCorte());
		System.out.println("\n\t\t\t\t Genero:"+getGenero());
		if (devuelto == true) {
			System.out.println("\n\t\t\t\t El Jean  fue devuelto");
		}else {
			System.out.println("\n\t\t\t\t El Jean no fue devuelto");
		}
	}
}
