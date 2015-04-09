public class Cylinder extends CircleSolid
{
	double height= 0.0;
	final double FN_height=3.0;
	
	public Cylinder(){
		setHeight(FN_height);
	}
	public Cylinder(double r,double h){
		setRadius(r);
		setHeight(h);
	}
	public void setHeight(double h){
		height=h;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return getArea()*getHeight();
	}
	public String toString(){
		return super.toString()+"\nCylinder: Height="+getHeight()+" Volume="+getVolume();
	}
	}
		