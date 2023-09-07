package HomeWork;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("請輸入x的值");
				int x = sc.nextInt();
				System.out.println("請輸入y的值");
				int y = sc.nextInt();
				System.out.println(x + "的" + y + "次方等於" + cal.powerXY(x, y));
				break;
			} catch (CalException ce) {
				System.out.println(ce.getMessage());
			} catch (java.util.InputMismatchException ime) {
				System.out.println("輸入格式不正確");
			}
		}
	}

}
