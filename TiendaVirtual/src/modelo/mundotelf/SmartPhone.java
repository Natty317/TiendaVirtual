package modelo.mundotelf;
import mundo.interfac.IDevolucion;
public class SmartPhone extends Telefono implements IDevolucion{
	public String tipoSim;
	public boolean devuelto;

	public SmartPhone(int id, String datos, double precio, String marca, String modelo, String tipoSim) {
		super(id, datos, precio, marca, modelo);
		devuelto = false;
		this.tipoSim = tipoSim;
	}
	public String getTipoSim() {
		return tipoSim;
	}
	//Metodos
	@Override
	public void hacerDevolucion() {
		devuelto = true;	
	}
	public void mostrarDatos() {
		System.out.println("\n\n\n\t\t\t\t DATOS DEL PRODUCTO: SMARTPHONE");
		System.out.println("\n\t\t\t\t ID:"+getId());
		System.out.println("\n\t\t\t\t Precio:"+getPrecio());
		System.out.println("\n\t\t\t\t Datos:"+getDatos());
		System.out.println("\n\t\t\t\t Marca:"+getMarca());
		System.out.println("\n\t\t\t\t Modelo:"+getModelo());
		System.out.println("\n\t\t\t\t Tipo Sim:"+getTipoSim());

		if (devuelto == true) {
			System.out.println("\n\t\t\t\t El smartphone fue devuelto");
		}else {
			System.out.println("\n\t\t\t\t El smartphone no fue devuelto");
		}
	}
}
