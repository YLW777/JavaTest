package xxx;

public class Animal {
	private int age;
	private float weight;
	
	//保留無參數的建構子
	public Animal() {
		// 1. 給子類別的對應
		// 2. 給日後搭配的工具(框架)使用，框架會利用此建構子幫忙建立物件
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.print(this.age + "歲、" + this.weight + "公斤");
		}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println(this.age + "歲");
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
		System.out.println(this.weight + "公斤");
	}
}
