package xxx;

//餘額超過3000 媽媽停止匯款
//餘額為2000以下 熊大要求媽媽匯款
//帳戶餘額低於熊大提款金額，熊大會暫停提款，直到媽媽告訴他錢已入帳
//媽媽一次匯款2000 熊大一次提款1000
//模擬匯款10次和提款10次情形

	
class Balance{
	private int money = 0;
		
	synchronized public void remit(int amount) {
		while (money >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有:" + money);
		notify();
	}
		
	synchronized public void withdraw(int amount) {
		while (money <= amount) {
			System.out.println("媽媽被熊大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(money >= 2000){
		        System.out.println("熊大被老媽告知帳戶已經有錢！");
		    }
		}

		money -= amount;
		System.out.println("熊大領了" + amount + "，帳戶共有:" + money);
		if (money <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}
	
class Brown extends Thread{
	Balance balance;
		
	public Brown(Balance balance) {
		this.balance = balance;
	}
		
	public void run() {
		for (int i = 1; i <= 10; i++)
			balance.withdraw(1000); 
	}
}
	
class Mom extends Thread{
	Balance balance;
		
	public Mom(Balance balance) {
		this.balance = balance;
	}
		
	public void run() {
		for (int i = 1; i <= 10; i++)
			balance.remit(2000); 
	}
}
	
	
public class Homework09__2 {
	public static void main(String[] args) {
		Balance balance = new Balance();
		
		Brown brown = new Brown(balance);
		Mom mom = new Mom(balance);
		brown.start();
		mom.start();
	}
}
