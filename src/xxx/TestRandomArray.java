package xxx;

public class TestRandomArray {
	public static void main(String[] args) {
		//step 1 建立3個3*3陣列
		int x [][] = new int [3][3];
		int y [][] = new int [3][3];
		int z [][] = new int [3][3];
		
		//將亂數填入x陣列
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j<x[i].length; j++) {
				x[i][j] = (int)(Math.random()*31);
			}
		}
		
		//將亂數填入y陣列
		for(int i = 0; i<y.length; i++) {
			for(int j = 0; j<y[i].length; j++) {
				y[i][j] = (int)(Math.random()*31);
			}
		}
		
		
		//將x, y數值放入z陣列
		for(int i = 0; i<z.length; i++) {
			for(int j = 0; j<z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}		
		
		//將陣列數值顯示出來
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j<x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}		
		
		System.out.println("===================");
		
		for(int i = 0; i<y.length; i++) {
			for(int j = 0; j<y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}		
		
		System.out.println("===================");

		for(int i = 0; i<z.length; i++) {
			for(int j = 0; j<z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}		
		
		
				
				
//		int x1= (int)(Math.random()*31);
//		int x2= (int)(Math.random()*31);
//		int x3= (int)(Math.random()*31);
//		int x4= (int)(Math.random()*31);
//		int x5= (int)(Math.random()*31);
//		int x6= (int)(Math.random()*31);
//		int x7= (int)(Math.random()*31);
//		int x8= (int)(Math.random()*31);
//		int x9= (int)(Math.random()*31);
//		System.out.print(x1);
//		
//		int a [][]= {
//				{x1, x2, x3},	
//				{x4, x5, x6},
//				{x7, x8, x9}
//		};
//		
//		System.out.print(int a[1][1]);
	}

}
