package xxx;

import java.util.*;

public class Homework05 {
	
//第一題	
//	public static void main(String[] args) {
//		
//		Homework05 square = new Homework05();
//		
//		System.out.println("請輸入寬與高:");
//		
//		Scanner uwidth = new Scanner(System.in);
//		Scanner uheight = new Scanner(System.in);
//		
//		int width = uwidth.nextInt();
//		int height = uheight.nextInt();
//		
//		
//		square.starSquare(width, height);
//		
//	}
//	
//	public void starSquare(int width, int height) {
//		
//		for (int i=0; i< width; i++) {
//			for (int j=0; j< height; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
//	}
	
//  第二題	
//	public static void main(String[] args) {
//		
//		Homework05 rAvg = new Homework05();
//		
//		rAvg.randAvg();
//			
//	}
//		
//	public void randAvg() {
//		
//		System.out.println("本次亂數結果:");
//		
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			
//			int j = (int)(Math.random()*101);
//			System.out.print(j + " ");
//			sum += j;
//		}
//		
//		System.out.println();
//		System.out.println((double)(sum/10));
//		
//	}
	
//	第三題
	public static void main(String[] args) {
		
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}}; 
		double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
		
		Homework05 w = new Homework05();
		
		int[][] x = intArray;
		double[][] y = doubleArray;
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
	
	public int maxElement(int[][] x) {
		
		int a = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j< x[i].length; j++) {
				
				if(x[i][j]>a) {
					
					a = x[i][j];
				}
				
			}
		}
		
		return a;
		
	}
	
	public double maxElement(double[][] y) {
		
		double a = 0;
		
		for(int i = 0; i < y.length; i++) {
			
			for(int j = 0; j< y[i].length; j++) {
				
				if(y[i][j]>a) {
					
					a = y[i][j];
				}
				
			}
		}
		
		return a;
		
	}

	
// 第四題
// 請參考MyRectangle.java 及 MyRectangleMain.java
	

// 第五題	
	
//	public static void main(String[] args) {
//		
//		Homework05 random = new Homework05();
//		
//		random.genAuthCode();
//		
//
//		
//	}
//	
//	public void genAuthCode() {
//	
//		char[] select = {
//				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
//				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
//				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'			
//			};
//	
//		for(int i = 0; i < 8; i++) {
//		
//				int j = (int)(Math.random()*62);
//				System.out.print(select[j]);
//		
//			};
//	}

}
