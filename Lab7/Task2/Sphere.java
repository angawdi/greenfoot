public class Sphere extends CircleSolid
{
	public Sphere(){
		setRadius(FN_radius);
	}
	public Sphere(double r){
		setRadius(r);
	}
	public double getVolume(){
		return 4/3*Math.PI*Math.pow(getRadius(),3);
	}
	public String toString(){
		 return super.toString()+"\nSphere: Volume="+getVolume();
		 
	}
	
}
	