package xxx;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		//使用MyRectangle()建構子建立物件
		MyRectangle a = new MyRectangle();
		a.setWidth(10);
		a.setDepth(20);
		System.out.println(a.getArea());
		
		//使用MyRectangle(double width, double depth)建構子建立物件
		MyRectangle b = new MyRectangle(10, 20);
		System.out.println(b.getArea());
		
	}

}
