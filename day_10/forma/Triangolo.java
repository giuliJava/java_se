package day_10.forma;

public class Triangolo extends Forma{
	private double base;
	private double altezza;
	private double lato2;
	private double lato3;
	
	public Triangolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangolo(double raggioLato) {
		super(raggioLato);
		// TODO Auto-generated constructor stub
	}
	public Triangolo(double base, double altezza, double lato2, double lato3) {
		super();
		this.base = base;
		this.altezza = altezza;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getLato2() {
		return lato2;
	}
	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}
	public double getLato3() {
		return lato3;
	}
	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}
	
	@Override
	public double perimetroCirconferenza() {
		return (getBase() * getAltezza()) / 2;
		
		
	}
	@Override
	public double area() {
		return getBase() + getLato2() + getLato3();	
		
	}
	
	
	
}
