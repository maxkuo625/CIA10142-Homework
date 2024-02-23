package homework_7;

import java.io.*;

public class file {

	static void copyFile(File inputFile, File outputFile) throws IOException {
		try (FileReader in = new FileReader(inputFile); 
			FileWriter out = new FileWriter(outputFile);) {
			int n;
			while ((n = in.read()) != -1) {
				out.write(n);
			}
		}
	}

	static void copyObject(Animals[] anis, File file) throws IOException {
		try (FileOutputStream f = new FileOutputStream(file);) {
			ObjectOutputStream oup = new ObjectOutputStream(f);
			for (Animals ani : anis) {
				oup.writeObject(ani);
			}
		}
	}

	static void readObject(File file) throws IOException, ClassNotFoundException{
		try(FileInputStream fr = new FileInputStream(file); ){
			ObjectInputStream inp = new ObjectInputStream(fr);
			while(true){
				((Animals) inp.readObject()).speak();
				System.out.println("--------------------");
			}
		}catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File inputFile = new File("C:\\javawork\\www2.txt");
		File outputFile = new File("C:\\javawork\\www3.txt");
		File zoo = new File("C:\\data");
		zoo.mkdir();
		File myZoo = new File("C:\\data\\Object.dat");
		Animals[] zoomer = { new Cat("Laisy"), new Cat("Timmy"), new Dog("Lucky"), new Dog("Labooo") };
		copyObject(zoomer, myZoo);
		readObject(myZoo);

	}

}
