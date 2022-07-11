package modelo;

public class Planeta {
	private String nombre;
	private int cantidad;
	private double masa;
	private double volumen;
	private int diametro;
	private int distancia;
	private String tipo;
	private boolean observable;

	// Constructor de inicializacion
	public Planeta() {
		super();
		this.nombre = "null";
		this.cantidad = 0;
		this.masa = 0;
		this.volumen = 0;
		this.diametro = 0;
		this.distancia = 0;
		this.tipo="TERRESTRE";
		this.observable = false;
	}

	// Constructor con parametros
	public Planeta(String nombre, int cantidad, double masa, double volumen, int diametro, int distancia,String tipo,boolean observable) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distancia = distancia;
		this.tipo=compruebaTipo(tipo);
		this.observable = observable;
		
	}

	// Constructor de copia
	public Planeta(Planeta p) {
		super();
		this.nombre = p.nombre;
		this.cantidad = p.cantidad;
		this.masa = p.masa;
		this.volumen = p.volumen;
		this.diametro = p.diametro;
		this.distancia = p.distancia;
		this.tipo=p.tipo;
		this.observable = p.observable;
		
	}

	// Metodo tostring
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidad=" + cantidad + ", masa=" + masa + ", volumen=" + volumen
				+ ", diametro=" + diametro + ", distancia=" + distancia + ",tipo=" + tipo + ",observable=" + observable + "]";
	}

	// Metodo para calcular la densidad. Densidad=masa/volumen
	public double calculaDensidad() {
		return this.masa / this.volumen;
	}

	// Metodo para determinar si un planeta del sistema solar es exterior (cuando
	// esta mas alla del cinturon de asterioides-> distancia>3.4UA (UA=149597870)
	public boolean planetaExterior(){
	int UA=149597870;
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
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
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
	
	
}
