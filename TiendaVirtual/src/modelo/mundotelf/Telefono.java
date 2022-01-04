package modelo.mundotelf;
public class Telefono {
	protected int id;
	protected String datos;
	protected double precio;
	protected String marca;
	protected String modelo;
	// Constructor
	public Telefono(int id, String datos, double precio, String marca, String modelo) {
		super();
		this.id = id;
		this.datos = datos;
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
	}
	//Getters y setters
	public int getId() {
		return id;
	}
	public String getDatos() {
		return datos;
	}
	public double getPrecio() {
		return precio;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
}
