package xxx;

public class Homework01 {
	public static void main(String[] args) {
		//題目一
		int num1 = 12, num2 = 6;
			System.out.println(num1 + num2); //12和6兩數值的和
			System.out.println(num1 * num2); //12和6兩數值的積
			System.out.println("====================");		
			
		//題目二
		int eggNum = 200;
			System.out.println("共" + eggNum/12 + "打" + eggNum%12 + "顆");
			System.out.println("====================");
			
		//題目三 (256559 sec 天時分秒) 一天24時 一時60分 一分60秒    一天 24*60*60秒
		int wholeSec = 256559, 
			a = 24*60*60, 
			b = 60*60, 
			day = wholeSec/a, 
			hour = (wholeSec%a)/b, 
			min = ((wholeSec%a)%b)/60, 
			sec = ((wholeSec%a)%b)%60;
			System.out.println(day + "天" + hour + "時" + min + "分" + sec + "秒");
			System.out.println("====================");
			
		//題目四 
		final double PI = 3.1415;
		int radius = 5;
		// printf ("%.2f", 3.14159)
			System.out.println("園面積為" + radius*radius*PI);
			System.out.printf("%.4f", radius*radius*PI);
			System.out.print("\n");
			System.out.println("園周長為" + radius*2*PI);
			System.out.printf("%.4f", radius*2*PI);
			System.out.print("\n");
			System.out.println("====================");
			
		//題目五 本金150萬  FV ＝ PV×（1 ＋ R）n 次方 FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
		// double f=Math.pow(a,b); /*a和b套用到此行的程式(a的b次方等於f)*/  System.out.println("2的3次方等於"+f);
		double principal = 1.5e6;
		double money = Math.pow((principal*1.02), 10);
//		BigDecimal newMoney = new BigDecimal (money);
			System.out.println(money);
			System.out.println("====================");
		
		//題目六
		int convertChar = (int)'5';
			System.out.println(5 + 5); // 單純為2個整數資料型別之數字相加
			System.out.println(5 + '5'); // 數字 與 字元
			System.out.println(convertChar); // 字元和整數，兩資料型別可互相轉換，由此程式碼執行結果可得知字元'5'轉換成整數數字53
			System.out.println(5 + "5"); // 整數(數字)資料型別 + 字串資料型別，會用「串接」方式
	}
}
