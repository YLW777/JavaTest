package xxx;

public class Elephant extends Animal{
	
	public Elephant(){
	
	}
//	在什麼都還沒寫的情況下，Java會自動給一個不帶參數的建構子。且此建構子因為還沒寫任何super()，Java也會預設一個隱形的super();
//  報錯的原因是因為從父類別中並無 無參數的建構子，無法呼叫到對應的建構子	
	
	private String name;
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	@Override  //給Java編譯器或工具的資訊，可以告訴Java編譯器或工具:這邊是用Override，Java編譯器或工具會以Override語法檢查程式碼是否符合規定，如不符合會報錯
	public void speak() {
		super.speak();
		System.out.println(this.name);
	}
	
	//之後熟悉後，可以直接寫 speak() ，讓Java工具自動幫你完成呼叫父類別， 最上方會顯示 @Override，這是一種Annotation標註  (JDK 5後開始): 給Java編譯器或工具的資訊
	
	public static void main(String[] args) {
		Elephant b = new Elephant(8, 1200.0f, "、大象");
		Animal a = new Animal(3, 8.0f);   //宣告變數並初始化
		
		a.speak();
		System.out.println();
		b.speak();
	}

}
