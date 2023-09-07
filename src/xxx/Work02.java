package work9;

class ACCOUNT {
	private int ACC = 0; // 戶頭

	synchronized public void mother(int mon) {
		while (ACC >= 3000) {
			System.out.println("戶頭超過3000，媽媽暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ACC += mon;

		System.out.println("老媽通知戶頭有錢：" + ACC);
		notify();
	}

	synchronized public void son(int mon) {
		int ti = 0;
		while (ACC < 2000) {
			System.out.println("熊大要求匯款");
			try {
				wait();
				continue;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		notify();
		ACC -= mon;

		System.out.println("熊大領取：" + mon + "；戶頭剩下" + ACC);
		if (ACC == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("沒錢了");
			notify();
		}
	}
}

class Mother extends Thread {
	ACCOUNT W;

	public Mother(ACCOUNT W) {
		this.W = W;
	}

	public void run() {
		for (int i = 1; i <= 12; i++)
			W.mother(2000); 
	}
}

class Son extends Thread {
	ACCOUNT W;

	public Son(ACCOUNT W) {
		this.W = W;
	}

	public void run() {
		for (int i = 1; i <= 12; i++)
			W.son(1000);
	}
}

public class Work02 {

	public static void main(String[] args) {
		ACCOUNT acc = new ACCOUNT();
		Mother mot = new Mother(acc);
		Son son = new Son(acc);

		mot.start();
		son.start();

	}
}
