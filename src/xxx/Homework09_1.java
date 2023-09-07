package xxx;

public class Homework09_1 implements Runnable{
	
	public Homework09_1() {
	}	
	
	public void run() {
		
		int r = (int)(Math.random()*2501) + 500;
		
		for(int a=1; a<=10; a++) {
			System.out.println(Thread.currentThread().getName() +"吃第" + a + "碗飯");
			
			try {
				Thread.sleep(r); // 暫停一秒
			} catch (Exception e) {
			}
			
		}
		System.out.println(Thread.currentThread().getName() + "吃完了!");
		
	}
	
	public static void main(String[] args) {
		Homework09_1 moon = new Homework09_1();
		Homework09_1 james = new Homework09_1();
		
		Thread tm = new Thread(moon);
		Thread tj = new Thread(james);
		
		tm.setName("饅頭人");
		tj.setName("詹姆士");
		
		System.out.println("=====大胃王快食比賽開始!=====");
		tm.start();
		tj.start();
		
		try {
			tm.join();
			tj.join();
		} catch(InterruptedException e) {	
		}
		
		System.out.println("=====大胃王快食比賽結束!=====");
	}
}
