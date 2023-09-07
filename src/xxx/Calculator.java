package xxx;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator() {
		
	}
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int powerXY(int x, int y) throws CalException {
		double result;

		if(x==0 && y==0) {
//			System.out.println("0的0次方沒有意義!");
			throw new CalException("0的0次方沒有意義!");
		}else if (y<0) {
//			System.out.println("次方為負值，結果回傳不為整數!");
			throw new CalException("次方為負值，結果回傳不為整數!");
		}else {
			result = Math.pow(x, y);
			return (int)result;
		}	
//		return (int)result;
	}

}
