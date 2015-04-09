public abstract class CircleSolid
{		
	double radius=0.0;
	final double FN_radius=3.0;
	
	public CircleSolid(){		//default Constructor
		setRadius(FN_radius);
	}
	public CircleSolid(double r){	//Non-default Constructor
		setRadius(r);
	}
	public double getRadius(){			
		return radius;
	}
	public void setRadius(double rd){
		radius=rd;
	}
	public double getCircumference(){
		return Math.PI*2*getRadius();
	}
	public double getArea(){
		return Math.PI*Math.pow(getRadius(),2);
	}
	public abstract double getVolume();
	public String toString(){
		return "CircleSolid: Radius="+getRadius();
	}
	
}
	
	