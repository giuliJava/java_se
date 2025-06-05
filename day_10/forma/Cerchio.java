package day_10.forma;

public class Cerchio extends Forma{
	
	public Cerchio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerchio(double raggioLato) {
		super(raggioLato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetroCirconferenza() {
		return getRaggioLato() * Math.PI;
		
		
	}
	
	@Override
	public double area() {
		return Math.pow(getRaggioLato(),2) * Math.PI;	
		
	}

}
