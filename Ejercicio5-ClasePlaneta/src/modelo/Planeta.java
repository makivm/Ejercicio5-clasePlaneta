package modelo;

import java.util.Objects;

public class Planeta {
	//declaracion de atributos de la clase
	private String nombre;
	private int cantidad;
	private double masakg;
	private double volumen;
	private int diametro;
	private int distancia;
	private String tipo;
	private boolean observable;
	public static final int UA=149597870;

	// Constructor de inicializacion
	public Planeta() {
		this.nombre = "null";
		this.cantidad = 0;
		this.masakg = 0;
		this.volumen = 0;
		this.diametro = 0;
		this.distancia = 0;
		this.tipo="TERRESTRE";
		this.observable = false;
	}

	// Constructor con parametros
	public Planeta(String nombre, int cantidad, double masa, double volumen, int diametro, int distancia,String tipo,boolean observable) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.masakg = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distancia = distancia;
		this.tipo=compruebaTipo(tipo);
		this.observable = observable;
		
	}

	// Constructor de copia
	public Planeta(Planeta p) {
		this.nombre = p.nombre;
		this.cantidad = p.cantidad;
		this.masakg = p.masakg;
		this.volumen = p.volumen;
		this.diametro = p.diametro;
		this.distancia = p.distancia;
		this.tipo=p.compruebaTipo(tipo);
		this.observable = p.observable;
		
	}

	// Metodo tostring
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidad=" + cantidad + ", masa=" + masakg + ", volumen=" + volumen
				+ ", diametro=" + diametro + ", distancia=" + distancia + ",tipo=" + tipo + ",observable=" + observable + "]";
	}

	// Metodo para calcular la densidad. Densidad=masa/volumen
	public double calculaDensidad() {
		return this.masakg / this.volumen;
	}

	// Metodo para determinar si un planeta del sistema solar es exterior (cuando
	// esta mas alla del cinturon de asterioides-> distancia>3.4UA (UA=149597870)
	public boolean planetaExterior(){
		if((this.distancia*1000000)<= 3.4*UA) 
			return false;
		else return true;
	}
		
	//Metodo para determinar si el tipo es correcto. SI no lo es, ponemos terrestre
	public String compruebaTipo(String tipo) {
		switch(tipo){
			case "ENANO":
				return "ENANO";
				
			case "GASEOSO":
				return "GASEOSO";
			default:
				return "TERRESTRE";
		}
	}

	//Metodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getMasa() {
		return masakg;
	}

	public void setMasa(double masa) {
		this.masakg = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isObservable() {
		return observable;
	}

	public void setObservable(boolean observable) {
		this.observable = observable;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planeta other = (Planeta) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
