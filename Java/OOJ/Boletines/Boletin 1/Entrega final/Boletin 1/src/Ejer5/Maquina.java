package Ejer5;

public class Maquina {
	private int capacidadCafe;
	private int capacidadLeche;
	private int capacidadVasos;
	private static double PrecioCafeS;
	private static double PrecioLeche;
	private static double PrecioCafeyLeche;
	private double modenero;
	private double pedidoD;
	
	public Maquina() {
		super();
		this.capacidadCafe=50;
		this.capacidadLeche=50;
		this.capacidadVasos=80;
		this.PrecioCafeS=1.20;
		this.PrecioLeche=1.00;
		this.PrecioCafeyLeche=1.5;
		this.modenero=0;
		this.pedidoD=0;
	}
	
	public Maquina(int capacidadCafe,int capacidadLeche,int capacidadVasos,double PrecioCafeS,double PrecioLeche,double PrecioCafeyLeche,double modenero,double pedidoD){
		this();
		this.capacidadCafe=capacidadCafe;
		this.capacidadLeche=capacidadLeche;
		this.capacidadVasos=capacidadVasos;
		this.PrecioCafeS=PrecioCafeS;
		this.PrecioLeche=PrecioLeche;
		this.PrecioCafeyLeche=PrecioCafeyLeche;
		this.modenero=modenero;
		this.pedidoD=pedidoD;
	}
	
	public void llenarDeposito() {
		if((50<=capacidadCafe||capacidadCafe<=0) && (50<=capacidadLeche||capacidadLeche<=0) && (80<=capacidadVasos||capacidadVasos<=0)){
			capacidadCafe=50;
			capacidadLeche=50;
			capacidadVasos=80;
		}
	}
	
	public double vaciarModenero() {
		return modenero=this.modenero-this.pedidoD;
	}

	public void setCapacidadCafe(int capacidadCafe) {
		this.capacidadCafe = capacidadCafe;
	}


	public void setCapacidadLeche(int capacidadLeche) {
		this.capacidadLeche = capacidadLeche;
	}

	public void setCapacidadVasos(int capacidadVasos) {
		this.capacidadVasos = capacidadVasos;
	}

	public static void setPrecioCafeS(double precioCafeS) {
		PrecioCafeS = precioCafeS;
	}

	public static void setPrecioLeche(double precioLeche) {
		PrecioLeche = precioLeche;
	}

	public static void setPrecioCafeyLeche(double precioCafeyLeche) {
		PrecioCafeyLeche = precioCafeyLeche;
	}


	public void setModenero(double modenero) {
		this.modenero = modenero;
	}

	public void setPedidoD(double pedidoD) {
		this.pedidoD = pedidoD;
	}	
	
	@Override
	public String toString() {
		return "Maquina [capacidadCafe=" + capacidadCafe + ", capacidadLeche=" + capacidadLeche + ", capacidadVasos="
				+ capacidadVasos + "]";
	}
	
}
