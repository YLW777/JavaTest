package xxx;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalTest {

	public static void main(String[] args) {	

		while(true){
			
			Scanner a = new Scanner(System.in);
			Scanner b = new Scanner(System.in);
		
			try {
				System.out.println("請輸入x的值:");
				int x = a.nextInt();
				
				System.out.println("請輸入y的值:");
				int y = b.nextInt();

				Calculator test = new Calculator (x, y);
				System.out.println(x + "的" + y + "次方等於" + test.powerXY(x, y));
				break;
			}
			catch(InputMismatchException mismatch) {
				System.out.println("輸入格式不正確");
			}
			catch(CalException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
