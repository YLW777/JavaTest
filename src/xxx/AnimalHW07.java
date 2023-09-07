package xxx;

import java.io.Serializable;

public class AnimalHW07 implements Serializable{
	
	
	private String name;
	
	public AnimalHW07(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Animal " + name + " speaking!");
	}

}
