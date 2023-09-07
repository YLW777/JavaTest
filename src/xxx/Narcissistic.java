package xxx;

// 2022/8/3 水仙花數 練習

public class Narcissistic {
	
	public static void main(String[] args) {
		
	
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k<= 9; k++) {
					int a = (int)Math.pow(k,3) + (int)Math.pow(j,3) + (int)Math.pow(i,3);
					if(a == (i*100 + j*10 + k)) {
						System.out.println(a);
					}
				}
				
			}
		}
				

	}
}
