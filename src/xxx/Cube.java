package xxx;

public class Cube {
	private double length;
	private double volume;
	
	public Cube () {};
	public Cube (double length) {
		this.length = length;
	};
	
	public void setLength(double length) {
		this.length = length;
	};
	
	public double getLength() {
		return length;
	};
	
	public double getVolume(double length) {
		this.volume =  length*length*length;
		return volume;
	}

}
