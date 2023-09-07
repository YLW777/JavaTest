package xxx;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;

public class Homework10 {

	
	//第一題 亂數產生5個介於1~100間的整數，並同時判斷是否為質數
	
//	public static void isPrime(int j){
//		
//		boolean bl = true; // 先預設布林值為true
//		
//		for(int i=2; i<=Math.sqrt(j); i++){
//			if(j % i == 0 && j != 2 || j == 1){
//				bl = false;
//				//排除兩種情況之非質數：1. 該數字可被2~其平方根數整除且非2 、 2. 該數字不是1
//			}
//		}
//		
//		// 預設布林值為true時，為質數 ; 為false時，不是質數
//		
//		if(bl){
//			System.out.println(j + "是質數");
//		}else {
//			System.out.println(j + "不是質數");
//		}
//		
//	}
	
	//第一題 亂數產生5個介於1~100間的整數，並同時判斷是否為質數
	
//	public static void main(String[] args) {
//		
//		for(int i = 1; i <= 5; i++) {
//			
//			boolean bl = true;
//			
//			int j = (int)(Math.random()*100)+1;		
//			
//			if(j == 2) {
//				bl = true;
//			
//			} else if(j == 1 || j % 2 == 0) {
//				bl = false;
//			
//			} else {
//				for(int k = 3; k <= Math.sqrt(j); k++ ) {
//					if(j % k == 0) {
//						bl = false;
//					}
//				}
//			}
//			
//			if(bl) {
//				System.out.println(j + "是質數");
//			}else {
//				System.out.println(j + "不是質數");
//			}
//		}			
//
//	}
	
	//第二題 輸入一個任意數後，可選擇 千分比/百分比/科學記號，格式不符會顯示提醒訊息
	
//	public static void main(String[] args) {
//		
//		Boolean bl = true;
//		
//		while(bl) {
//			try {
//				Scanner n = new Scanner(System.in);
//		
//				System.out.println("請輸入數字:");
//				double n1 = n.nextDouble();
//				System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
//	
//				String num = "[1-3]";
//				String select;
//	
//				while(!(select = n.next()).matches(num)){
//					System.out.println("請輸入數字1或2或3，請再輸入一次！");
//					System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
//				}
//			
//				
//				switch(select) {
//					case "1" :
//						Format dfm1 = new DecimalFormat("#,###");
//						System.out.println(dfm1.format(n1));
//						break;
//					case "2" :
//						Format dfm2 = new DecimalFormat("#%");
//						System.out.println(dfm2.format(n1));
//						break;
//					case "3" :	
//						Format dfm3 = new DecimalFormat("#.#E00");
//						System.out.println(dfm3.format(n1));
//						break;
//				}
//				
//				bl = false;
//			} catch(InputMismatchException e) {
//				System.out.println("數字格式不正確，請再輸入一次！");
//			}
//
//		}
//	}
	
	//第三題 使用者輸入日期後，可轉換為三種格式的日期，輸入非數字日期格式，則會顯示提醒訊息
	
//	public static void main(String[] args) {
//		Scanner n = new Scanner(System.in);
//		
//		System.out.println("0請輸入日期(年月日，例如:20110131):");
//		String input;
//		
//		String ymd = "^\\d{8}$";
//		
//		while (!(input = n.next()).matches(ymd)) {
//			System.out.println("數字格式不正確，請再輸入一次!");
//			System.out.print("請輸入日期(年月日，例如:20110131):");
//		}
//				
//		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
//		String select;
//		
//		String num = "[1-3]";
//		
//		while(!(select = n.next()).matches(num)) {
//			System.out.println("數字格式不正確，請再輸入一次!");
//			System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
//		}
//		
//		switch(select) {
//		case "1" :
//			
//			System.out.println("年/月/日: " + input.substring(0, 4) + "/" + input.substring(4, 6) + "/" + input.substring(6));
//			break;
//		case "2" :
//			
//			System.out.println("月/日/年: " + input.substring(4, 6) + "/" + input.substring(6) + "/" + input.substring(0, 4));
//			break;
//		case "3" :	
//			
//			System.out.println("日/月/年: " + input.substring(6) + "/" + input.substring(4, 6) + "/" + input.substring(0, 4));
//			break;			
//	}
//		
//	}
	
}

