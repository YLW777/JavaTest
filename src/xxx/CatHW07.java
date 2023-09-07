package xxx;

import java.io.Serializable;

public class CatHW07 extends AnimalHW07 implements Serializable {
	
	private static final long serialVersionUID = 1;
	
	private String name;
	
	public CatHW07(String name) {
		super(name);
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
