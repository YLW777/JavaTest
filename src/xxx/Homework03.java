package xxx;

import java.util.*;

public class Homework03 {
	//第一題
//	public static void main(String[] args) {
//		int a, b, c;
//		Scanner triangle = new Scanner(System.in);
//		System.out.println("請輸入3個數字:");
//		a = triangle.nextInt();
//		b = triangle.nextInt();
//		c = triangle.nextInt();
//		
//		if(a+b>c || a+c>b || b+c>a) {
//			if(a != b && a!=c && b!= c) {
//				if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
//					System.out.println("直角三角形");
//				}else {
//					System.out.println("其它三角形");
//				}
//			}else if(a == b && a==c){
//				System.out.println("正三角形");
//			}else{
//				System.out.println("等腰三角形");
//			}
//		}else{
//			System.out.println("不是三角形");
//		}
//	}
	
	//第二題
//	public static void main(String[] args) {
//		int answer = (int)(Math.random()*101);
//		System.out.println(answer);
//		System.out.println("===============");
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("開始猜數字吧");
//		int guessNum = input.nextInt();
//		
//		while(answer != guessNum) {
//			
//			if(answer < guessNum) {
//				System.out.println("答錯了，您猜的數字比較大，請再猜一次!");
//				guessNum = input.nextInt();
//			} else if(answer > guessNum) {
//				System.out.println("答錯了，您猜的數字比較小，請再猜一次!");
//				guessNum = input.nextInt();
//			} 
//		}
//		
//		if(answer == guessNum) {
//			System.out.println("答對了!答案就是"+ answer);
//		}
//	}


     //第三題
	public static void main(String[] args) {
		int num;
		int count = 0;
		
		Scanner lottery = new Scanner(System.in);
		System.out.println("阿文，請輸入一個您討厭的數字(1~9):");
		num = lottery.nextInt();

		//輸入不要的數字後，顯示6個不重複的亂數<進階>
//		int random;
//		HashSet rSet = new HashSet();
//		
//		while(true) {
//			
//			random = (int)(Math.random()*49)+1;
//			
//			if(random/10 != num && random%10 != num && random != num) {
//				rSet.add(random);
//							
//			}
//			
//			if(rSet.size()==6) {
//				System.out.println(rSet);
//				break;
//			}
//			
//		}
		
		
		//顯示可選擇的號碼及總數
//		for(int i=0;i<=4;i++) {
//			if(i==num) {
//				continue;
//			}
//			for(int j=0; j<=9; j++) {
//				if(j==num) {
//					continue;
//				}
//				
//				String selectedNum = "" + i + j;
//				
//				if(i==0 && j!=0) {
//					System.out.println(j);
//					count++;
//					continue;
//				}
//				
//				
//				if("00".equals(selectedNum)) {
//					continue;
//				}
//				count++;
//				int selectedNtoS = Integer.parseInt(selectedNum);
//				System.out.println(selectedNtoS);
//			}
//		}
//		
//		System.out.println("總共有"+ count + "個數字可選");
	}
}

