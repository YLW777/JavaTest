package xxx;

public class Homework02 {
	public static void main(String[] args) {
		//題目1. 1~1000偶數和
//		int i = 0, sum = 0;
//		while(i<1000) {
//			i+=2;
//			sum+=i;
//		}
//		System.out.println(sum); 
		
		//想法 2 + 4 + 6 + ...+ 1000  1: 2  2: 2+4  3: (2+4)+6

		
		//題目2. 1~10連乘積 for迴圈
//		int sum = 1;
//		for(int count = 1; count <=10; count++) {
//			sum*=count;
//		}
//		System.out.println(sum);	
		
		//題目3. 1~10連乘積 while迴圈
//		int sum = 1, count =1;
//		while(count<=10) {
//			sum=sum*count;
//			count++;
//		}
//		System.out.println(sum);
		
		
		//題目4. 
//		int i=0, count=0;
//		while(i<=81 && count<=9) {
//			i=i+1+2*count;
//			count++;
//			System.out.print(i+" "); 
//		}
		
		// 想法 1=0+1+2*0  4=1+1+2*1   9= 4+1+2*2    81= 64+1+2*8  100= 80+1+2*9
		
		//題目5.   1~49    1 2 3 5   15          4  14  24  34  44  40~49  
		int i=0, count=0;
		while(i<39) {
			i++;
			if(i==4 || i==14 || i==24 || i==34) {
				continue;
			}
			count++;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print(count+"個");
	
		
		//題目6.
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//題目7. 65 66 67 68 60 70
//		for(int i=1; i<=6; i++) {
//			char a= (char)(64+i);
//			for(int j=1; j<=i; j++) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
//		
//      查詢萬國碼
//		int convertCharA = (int)'A', convertCharB = (int)'B', convertCharC = (int)'C', convertCharD = (int)'D', convertCharE = (int)'E', convertCharF = (int)'F';
//		System.out.println(convertCharA);
//		System.out.println(convertCharB);
//		System.out.println(convertCharC);
//		System.out.println(convertCharD);
//		System.out.println(convertCharE);
//		System.out.println(convertCharF);
		
		
				
		
	}
}
