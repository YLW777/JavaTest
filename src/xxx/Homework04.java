package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
		
//  	第一題
//		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		Arrays.sort(x);
//		int sum = 0;
//		
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//		}
//		
//		int avg = sum / x.length;
//		
//		System.out.println(avg);
//		
//		for (int i = 0; i < x.length; i++) {
//			if(x[i] > avg) {
//				System.out.print(x[i] + " ");
//			}
		
//      第二題
//		String s = "Hello World";
//		String[] sSplit = {"H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"};
//		
//		for (int i = sSplit.length-1; i >= 0; i--) {
//			System.out.print(sSplit[i]);	
//		}
		
//		第三題
//		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//
//		char vowel1 = 'a'; 
//		char vowel2 = 'e';
//		char vowel3 = 'i';
//		char vowel4 = 'o';
//		char vowel5 = 'u';
//		int count = 0;
//		
//		for (int i = 0; i < planet.length; i++) {
//			for (int j = 0; j < planet[i].length(); j++) {
//				if (planet[i].charAt(j) == vowel1 || planet[i].charAt(j) == vowel2 || planet[i].charAt(j) == vowel3 || planet[i].charAt(j) == vowel4 || planet[i].charAt(j) == vowel5) {
//					count++;
//				}
//	        }
//		}
//		
//		System.out.println(count);
		
//		第四題
//		Scanner m = new Scanner(System.in);
//		
//		int count = 0;
//		
//		int[][] loan = {{25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200}};
//		
//		System.out.println("請輸入金額:");
//		int money = m.nextInt();
//		
//		System.out.print("有錢可借的員工編號: ");
//			
//		for (int i = 1; i < loan.length; i++) {
//			for (int j = 0; j < loan[i].length; j++) {
//				if(money <= loan[1][j]) {
//					count++;
//					System.out.print(loan[0][j] + " ");
//				}
//			}
//		}
//		
//		System.out.println("共 " + count + " 人");
		
//		第五題
//		System.out.println("請輸入三個整數，分別代表西元年、月、日");
//		
//		Scanner y = new Scanner(System.in);
//		Scanner m = new Scanner(System.in);
//		Scanner d = new Scanner(System.in);
//		
//		int num1 = y.nextInt();
//		int num2 = m.nextInt();
//		int num3 = d.nextInt();
//		
//		int[] getDay = {num1, num2, num3};
//		
//		int[][] nYear = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
//		int[][] lYear = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
//		
//		int sumDay = 0;
//		
//		for (int i = 1; i < num2; i++) {
//			if((num1 % 4) == 0) {
//				if(num2 == 1) {
//					sumDay = 0;
//				}
//				else {
//					sumDay = sumDay + lYear[1][i-1];
//				}
//			}
//			else {
//				if(num2 == 1) {
//					sumDay = 0;
//				}
//				else {
//					sumDay = sumDay + nYear[1][i-1];
//				}
//			}	
//		}
//		
//		int totalDay = num3 + sumDay;
//		
//		System.out.println("輸入的日期為該年第" + totalDay + "天");
//		
//		
//		//平年陣列   閏年陣列
//		
//		// num2 做迴圈   i = 0; i < num2; i++   
//		
//		//算出該年的第幾天 一般非閏年   3月30
//		// 0-1  if 年份數字%4 = 0
//		// 1-1  if num2 = 2 , mToD = 29
//		// 1-2  else if ( ((i%2)餘數不等於0 && i<8)) ||  ((i%2)餘數等於0 && i>=8) ) , mToD = 31
//		// 1-3  else , mToD = 30
//		
//		// 0-2  else (也就是 年份數字%4 != 0，代表平年)
//		// 
//		
//		// 31天   1 3 5 7 8 10 12 
//		// 第一種情況 (i%2)餘數不等於0 && i<8 && i != 2
//		// 第二種情況
//		// 如果是3月  第一輪跑三次 i = 1 ; i < num2 ; i++
		
//		第六題
		
		int maxIndex1 = getMaxScoreIndex(new int[]{10, 35, 40, 100, 90, 85, 75, 70});
		int maxIndex2 = getMaxScoreIndex(new int[]{37, 75, 77, 89, 64, 75, 70, 95});
		int maxIndex3 = getMaxScoreIndex(new int[]{100, 70, 79, 90, 75, 70, 79, 90});
		int maxIndex4 = getMaxScoreIndex(new int[]{77, 95, 70, 89, 60, 75, 85, 89});
		int maxIndex5 = getMaxScoreIndex(new int[]{98, 70, 89, 90, 75, 90, 89, 90});
		int maxIndex6 = getMaxScoreIndex(new int[]{90, 80, 100, 75, 50, 20, 99, 75});
				
		int[] maxIndex = {maxIndex1+1, maxIndex2+1, maxIndex3+1, maxIndex4+1, maxIndex5+1, maxIndex6+1};
		
		int[] student = {1, 2, 3, 4, 5, 6, 7, 8};
		
//		System.out.println(maxIndex[0] + " " +  maxIndex[1] +  " " +  maxIndex[2] + " " +  maxIndex[3] + " " + maxIndex[4] + " " + maxIndex[5]);
		
		for(int j=0; j<student.length; j++) {
			int count = 0;
			for(int m=0; m < maxIndex.length; m++){
 				if(student[j] == maxIndex[m]) {
					count++;
				}
			}
			System.out.print(count + "\t");
		}
	}
	
	public static int getMaxScoreIndex(int[] testResult) {
		int maxScore = 0;
		int maxScoreIndex = 0;
		for (int i = 0; i < testResult.length; i++) {
			int score = testResult[i];
			if(score > maxScore) {
				maxScore = score;
				maxScoreIndex = i;
			}
		}
		return maxScoreIndex;
	}

	
	// maxScoreIndex + 1 該號同學 = 4 8 1 2 1 3
}
