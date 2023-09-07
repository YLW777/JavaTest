package homework9;

import java.io.PrintWriter;

public class homework9_2 {
	static int balance = 0;

	public static void main(String args[]) {
		PrintWriter out = new PrintWriter(System.out, true);
		Account account = new Account(out);
		Deposit mother = new Deposit(account, 2000, "媽媽", 10);
		Withdraw brown = new Withdraw(account, 1000, "熊大", 10);
		mother.start();
		brown.start();
		try {
			mother.join();
			brown.join();
		} catch (InterruptedException e) {
		}

	}
}

class Account {
	PrintWriter out;

	Account(PrintWriter out) {
		this.out = out;
	}

	synchronized void deposit(int amount, String name) {
		if (getBalance() >= 3000) {
			if (!Withdraw.finished) {
				out.println("媽媽看到餘額再3000以上，暫停匯款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		if (getBalance() < 3000) {
			setBalance(+amount);
			out.println(name + "存了" + amount + "帳戶共有" + getBalance());
			notify();
		}
	}

	synchronized void withdraw(int amount, String name) {
		if (getBalance() < amount) {
			out.println("熊大看到帳戶沒錢，暫停提款\n媽媽被熊大要求匯款!");
			if (!Deposit.finished) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			out.println("熊大被老媽告知帳戶已經有錢!");
		}
		if (getBalance() >= amount) {
			setBalance(-amount);
			out.println(name + "領了" + amount + "帳戶共有" + getBalance());
			if (getBalance() <= 2000) {
				out.println("熊大看到餘額再2000以下，要求匯款");
				notify();
			}
		}

	}

	int getBalance() {
		return homework9_2.balance;
	}

	void setBalance(int amount) {
		homework9_2.balance += amount;
	}
}

class Deposit extends Thread {
	Account account;
	int amount;
	String name;
	int count;
	public static boolean finished = false;

	Deposit(Account account, int amount, String name, int count) {
		this.account = account;
		this.amount = amount;
		this.name = name;
		this.count = count;
	}

	public void run() {
		for (int i = 0; i < count; i++) {
//			synchronized (homework9_2.class) {
			account.deposit(amount, name);
//			}
		}
		finished = true;
	}
}

class Withdraw extends Thread {
	Account account;
	int amount;
	String name;
	int count;
	public static boolean finished = false;

	Withdraw(Account account, int amount, String name, int count) {
		this.account = account;
		this.amount = amount;
		this.name = name;
		this.count = count;
	}

	public void run() {
		for (int i = 0; i < count; i++) {
//			synchronized(homework9_2.class) {
			account.withdraw(amount, name);
//			}			
		}
		finished = true;
	}
}