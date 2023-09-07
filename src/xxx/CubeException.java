package xxx;

public class CubeException extends Exception{
	
	public CubeException() {
		
	}
	
	public CubeException(String message) {
		super (message);
	}
	
	public double getVolume(double length) throws CubeException {
		double volume;
		
		if (length == 0 || length < 0) {
			throw new CubeException("正立方體邊長不得為或是負數");
		}
		
	}

}
