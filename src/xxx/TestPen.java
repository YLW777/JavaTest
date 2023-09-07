package xxx;

	abstract class Pen{
		
		protected String brand;
		protected int price;
		
		Pen(String brand, int price){
			this.brand = brand;
			this.price = price;
		}
		
		public void setBrand(String x) {
			this.brand = x;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public void setPrice(int price) {
			this.price = price; 
		}
		
		public int getPrice() {
			return price;
		}
		
		public abstract void write();
	}
	
	
	class Pencil extends Pen{ 
		
		public Pencil(String brand, int price){
			super(brand, price); 
		}
		
		
		public void write() {
			
			System.out.println("削鉛筆再寫");
		}
		
		@Override
		public int getPrice() {
			price = (int)(price *0.8);
			return price;
		}
	}
	
	class InkBrush extends Pen{
		
		public void write() {
			
			System.out.println("沾墨汁再寫");
		}
		
		@Override
		public int getPrice() {
			price = (int)(price *0.9);
			return price;
		}
	}
	
	public class TestPen {
		
		public static void main(String[] args) {
		
//			Pencil p = new Pencil();
			Pencil p1 = new Pencil("Lion", 20);
//			p.setBrand("Pilot");
//			p.setPrice(10);
//			p.write();
//			p.getPrice();
			p1.getPrice();
			System.out.println(p1.price);
			
			System.out.println();
			
			InkBrush i = new InkBrush();
//			InkBrush i1 = InkBrush("N");
			i.setBrand("Lamy");
			i.setPrice(3000);
			i.write();
			i.getPrice();
			System.out.println(i.price);
		}
	}
	

