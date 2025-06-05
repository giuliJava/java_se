package day_10.forma;

public class Quadrato extends Forma{
	
	public Quadrato() {
		super();
		
	}
	public Quadrato(double raggioLato) {
		super(raggioLato);
		
	}
	
	@Override
	public double perimetroCirconferenza() {
		return getRaggioLato() * 4;
		
		
	}
	@Override
	public double area() {
		return Math.pow(getRaggioLato(), 2);	
		
	}
	

}
