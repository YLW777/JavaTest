package xxx;

import java.math.BigInteger;
import java.util.*;

public class Homework08{
	
	 public static void main(String[] args) {
		 List<Object> a = new ArrayList();
		 a.add(new Integer(100));
		 a.add(new Double(3.14));
		 a.add(new Long(21L));
		 a.add(new Short("100"));
		 a.add(new Double(5.1));
		 a.add("Kitty");
		 a.add(new Integer(100));
		 a.add(new Object());
		 a.add("Snoopy");
		 a.add(new BigInteger("1000"));
	 
	 
		 //使用for
//		 for(int i = 0; i < a.size(); i++) {
//			 Object obj = a.get(i);
//			 System.out.println(obj);
//		 }
	 
		 //使用for each
//		 for(Object obj: a) {
//			 System.out.println(obj);
//		 }
		 
		 //使用Iterator
//		 Iterator it1 = a.iterator();
//		 while(it1.hasNext()) {
//			 System.out.println(it1.next());
//		 }
		 
		 //移除非java.lang.Number物件  如不能轉型 就remove
//		 for(int j = 0; j < a.size();) {
//			 Object obj = a.get(j);
//			 if(!(obj instanceof Number)) {
//				 a.remove(obj);
//			 } else{
//		 		j++;
//	 		 }
//		 }
		 
		 // 使用for
//		 for(int i = 1; i < a.size(); i++) {
//			 System.out.println(a.get(i));
//		 }
		  
		 // 使用for each
//		 for(Object obj: a) {
//		 System.out.println(obj);
//	     }
		 
		 // 使用迭代器
//		 Iterator it2 = a.iterator();
//		 while(it2.hasNext()) {
//			 System.out.println(it2.next());
//		 }
		 
		 
	 }
}
