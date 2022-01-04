
public class Ropa {

	protected int id;
	protected double precio;
	protected int talla;
	protected String color;

	//Constructor
	
	public Ropa(int id, double precio, int talla, String color) {
		this.id = id;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
	}

	//Getters y setters
	
	public int getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public int getTalla() {
		return talla;
	}
	
	
	
	
}
