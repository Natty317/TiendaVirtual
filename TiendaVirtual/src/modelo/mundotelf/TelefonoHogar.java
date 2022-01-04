package modelo.mundotelf;
import mundo.interfac.IDevolucion;
public class TelefonoHogar extends Telefono implements IDevolucion{
	public boolean alambrico;
	public boolean devuelto;
	//Contructor
	public TelefonoHogar(int id, String datos, double precio, String marca, String modelo, boolean alambrico) {
		super(id, datos, precio, marca, modelo);
		devuelto =false;
		this.alambrico = alambrico;
	}
	public boolean getAlambrico() {
		return alambrico;
	}
	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}
	//Metodos
	@Override
	public void hacerDevolucion() {
		devuelto = true;
	}
	public void mostrarDatos() {
		System.out.println("\n\n\n\t\t\t\t DATOS DEL PRODUCTO: TELEFONO HOGAR");
		System.out.println("\n\t\t\t\t ID:"+getId());
		System.out.println("\n\t\t\t\t Precio:"+getPrecio());
		System.out.println("\n\t\t\t\t Datos:"+getDatos());
		System.out.println("\n\t\t\t\t Marca:"+getMarca());
		System.out.println("\n\t\t\t\t Modelo:"+getModelo());
		if (alambrico == true) {
			System.out.println("\n\t\t\t\t El telefono para hogar es alambrico");
		}else {
			System.out.println("\n\t\t\t\t El telefono para hogar no es alambrico");
		}
		if (devuelto == true) {
			System.out.println("\n\t\t\t\t El Telefono para hogar fue devuelto");
		}else {
			System.out.println("\n\t\t\t\t El Telefono para hogar no fue devuelto");
		}	
	}
}
