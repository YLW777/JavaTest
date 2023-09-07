package xxx;


import java.util.*;


public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	

	
	public Train() {};
	public Train(int number,String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest =dest;
		this.price = price;
	}
	
	
	public String display() {
		return "班次:" + number + ",車種:" + type + ",出發地:" + start + ",目的地:" + dest + ",票價:" + (int)price;
	}
	
	public int getNumber() {
		return number;
	}	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	
	
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
	// 2-1 compareTo 實作方法
	public int compareTo(Train no2) {
		
		if (this.number > no2.number) {
			return 1;
		} else if (this.number == no2.number){
			return 0; 
		} else {
			return -1;
		}
		
	}
	
	// 2-2 compareTo實作方法
//	public int compareTo(Train no3) {
//		
//		if (this.number > no3.number) {
//			return -1;
//		} else if (this.number == no3.number){
//			return 0; 
//		} else {
//			return 1;
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		Train[] trainset= new Train[7];
		trainset[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		trainset[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		trainset[2] = new Train(118, "自強", "高雄", "台北", 500);
		trainset[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		trainset[4] = new Train(122, "自強", "台中", "花蓮", 600);
		trainset[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		trainset[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		
		// 1. 印出不重複的Train物件	
		
//		Set<Train> no1 = new HashSet<Train>();
//		
//		for(int i = 0; i <= 6; i++) {
//			no1.add(trainset[i]);
//		}
		
		//for each方法
//		for(Train t1: no1) {
//			System.out.println(t1.display());
//		}
		
		//使用Iterator迭代器
//		Iterator itForNo1 = no1.iterator();
//		while(itForNo1.hasNext()) {
//			System.out.println(((Train)(itForNo1.next())).display());
//		}
	
		// 2-1. 讓Train物件印出時，依班次編號由大到小排序
		
//		List<Train> no2 = new ArrayList<Train>();
//		
//		for(int i = 0; i <= 6; i++) {
//			no2.add(trainset[i]);
//		}
//		
//		Collections.sort(no2);
//		Collections.reverse(no2);
		
		// for迴圈
//		for(int j = 0; j < no2.size(); j++) {
//			System.out.println(((Train)no2.get(j)).display());
//		}
		
		// for each 方法
//		for(Train t2: no2) {
//		System.out.println(t2.display());
//		}
		
		// 使用Iterator迭代器
//		Iterator itForNo2 = no2.iterator();
//		while(itForNo2.hasNext()) {
//			System.out.println(((Train)(itForNo2.next())).display());
//		}		
		
		// 2-2. 讓Train物件印出時，依班次編號由大到小排序，且不印重複的Train物件
//		Set<Train> no3 = new TreeSet<Train>();
//		
//		for(int i = 0; i <= 6; i++) {
//			no3.add(trainset[i]);
//		}
	
//		Collections.sort(no3);
//		Collections.reverse(no3);
		
		// for each 方法
//		for(Train t3: no3) {
//		System.out.println(t3.display());
//		}
		
		// 使用Iterator迭代器
//		Iterator itForNo3 = no3.iterator();
//		while(itForNo3.hasNext()) {
//			System.out.println(((Train)(itForNo3.next())).display());
//		}		

	
	}
}
