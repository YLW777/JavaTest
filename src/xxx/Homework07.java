package xxx;

import java.io.*;
import java.util.*;
import java.math.*;

public class Homework07 {

//	第一題
//	public static void main(String[] args) throws Exception {
//		
//		File sp = new File("C:\\Homework07", "Sample.txt");
//		
//		long countspLength = sp.length();
//		
//		FileReader sampleRead = new FileReader("C:\\Homework07\\Sample.txt");
//		BufferedReader bfSampleRead = new BufferedReader(sampleRead);
//		
//		/*bfSampleRead.mark(0);
//		bfSampleRead.reset();
//		可運用在非循序性 randomaccessfile
//		*/
//		int countChar = 0;
//		int countLine = 0;
//
//		while((bfSampleRead.read()) != -1) {
//			countChar++;
//		}
//		
//		bfSampleRead.close();
//		sampleRead.close();
//		
//		sampleRead = new FileReader("C:\\Homework07\\Sample.txt");
//		bfSampleRead = new BufferedReader(sampleRead);
//		
//		while((bfSampleRead.readLine()) != null) {
//			countLine++;			
//		}
//
//		System.out.println("Sample.txt檔案共有" + countspLength + "個位元組，" + countChar + "個字元，" + countLine + "列資料");
//		
//		bfSampleRead.close();
//		sampleRead.close();
//		
//	}
	
//	第二題
	
//	int selectNum =  (int)(Math.random()*1000) + 1 ;
//	
//	public static void main(String[] args) throws Exception {
//		
//		FileOutputStream dataWrite = new FileOutputStream("C:\\Homework07\\Data.txt", true);
//		BufferedOutputStream bfDataWrite = new BufferedOutputStream(dataWrite);
//		PrintStream psBfDataWrite = new PrintStream(bfDataWrite);
//		
//		for(int i = 0; i < 10; i++) {
//			int selectNum =  (int)(Math.random()*1000) + 1 ;
//			psBfDataWrite.println(selectNum);
//		}
//		
//		psBfDataWrite.close();
//		bfDataWrite.close();
//		dataWrite.close();
//	}
	
//	第三題
//	
//	public static void copyFile(File a, File b) throws IOException {
//		
//		FileReader in = new FileReader(a);
//		FileWriter out = new FileWriter(b);
//		int c;
//
//		while ((c = in.read()) != -1) { 
//			out.write(c);
//			System.out.print((char) c);
//			System.out.flush();
//		}
//
//		in.close();
//		out.close();
//		
//	}
//	
//	public static void main(String[] args) throws IOException{
//		
//		File inputFile = new File("src\\xxx\\toBeCopied.txt");
//		File outputFile = new File("copiedDone.txt");
//		
//		copyFile(inputFile, outputFile);
//	}
	
//	第四題 & 第五題
	
	public static void main(String[] args) throws Exception{
		
		File dataFolder = new File("C:\\data1"); 
		dataFolder.mkdir();
		
		File file = new File("C:\\data1\\Object.ser");
		
		DogHW07[] doggy = new DogHW07[2];
		doggy[0] = new DogHW07("汪一");
		doggy[1] = new DogHW07("汪二");
		CatHW07[] kitty = new CatHW07[2];
		kitty[0] = new CatHW07("喵一");
		kitty[1] = new CatHW07("喵二");
		
		FileOutputStream fos = new FileOutputStream(file, true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < doggy.length; i++) {
			oos.writeObject(doggy[i]);
		}
		for (int j = 0; j < kitty.length; j++) {
			oos.writeObject(kitty[j]);
		}
		oos.close();
		fos.close();
		
//		FileInputStream fis = new FileInputStream(file);
//		ObjectInputStream ois = new ObjectInputStream(fis);
//
//		try {
//			while (true) {
//				((AnimalHW07) ois.readObject()).speak();
//				System.out.println();
//			}
//				 	
//		} catch (Exception e) {
//			System.out.println("結束");
//		}
//		
//		ois.close();
//		fis.close();
//	
	}
}
