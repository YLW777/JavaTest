package xxx;

public class TestBMI {
	public static void main(String[] args) {
		double weight = 48;
		double height = 163;
		double bmi = weight/((height/100)*(height/100)); 
		// double BMI = weight/Math.pow(height, 2); //次方運算函式可在library找到
		
		System.out.println(bmi);
		System.out.printf("BMI=%.3f%n", bmi);
		
		if (bmi >= 24) {
			System.out.println("您的體重過胖");
		}	else if (bmi >= 18.5) {
			System.out.println("您的體重正常");
		}   else {
			System.out.println("您的體重過瘦");
		}
	}
}
