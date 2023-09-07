package xxx;

public class Student {
	int score = 80;
	
	public void play(int hours) {
		score-=hours;
	}
		
	public void study(int hours) {	
		score+=hours;
	}
	
	public static void main(String[] args) {
		Student abby = new Student();
		Student david = new Student();
		
		abby.play(2);
		david.study(3);
		
		System.out.println(abby.score);
		System.out.println(david.score);		
	}
}
