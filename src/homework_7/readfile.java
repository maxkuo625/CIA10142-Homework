package homework_7;

import java.io.*;

public class readfile {
	
	public static int reader(FileInputStream f) throws IOException{
		int count = 0;
		while (( f.read()) != -1) {
			count +=1;
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File inputFile = new File("C:\\eclipse-workspace\\CIA10142_Homework\\src\\homework_7\\Sample.txt");
		try(FileInputStream fs = new FileInputStream(inputFile);
			FileReader f1 = new FileReader(inputFile);
			FileReader f2 = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(f2);
			){
			int count = 0;
			int count2 = 0;
			int count3 = 0;
			String s;
			count = reader(fs);
			while(f1.read() != -1) {
				count2++;
			}
			while ((s = br.readLine()) != null) {
				if(s.length() > 0){
					count3 ++;
				}
			}
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料 %n",count,count2,count3);
		}catch (IOException ie) {
			ie.printStackTrace();
		}
			catch(Exception e){
			e.printStackTrace();
		}
		
		

	}

}
