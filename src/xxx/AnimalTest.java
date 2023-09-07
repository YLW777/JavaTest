package xxx;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal(2, 5.0f);   // 5.0是float型別，需要做轉換
		a.speak();
		
		//時光飛逝，3年後，a變成5歲 和 25.0公斤
		
		a.setAge(5);
		a.setWeight(25.0f);
	}

}
