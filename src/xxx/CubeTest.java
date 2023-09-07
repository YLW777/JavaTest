package xxx;

public class CubeTest {
	
	
	public static void main(String[] args) {
		
		Cube a = new Cube ();
		
		try {
			System.out.println(a.getVolume(1));
		} catch (CubeException x) {
			System.out.println(x.getMessage());
		}
	}

}
