package homework_7;

import java.io.*;
import java.util.*;

public class writerandom {

	static void random() {
		File outputFile = new File("data.txt");
		ArrayList<Integer> arrl = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			arrl.add(i);
		}
		ArrayList<Integer> arrl2 = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * arrl.size());
			int n = arrl.get(index);
			arrl2.add(n);
			arrl.remove(index);
		}
		try (FileOutputStream f = new FileOutputStream(outputFile, true); PrintStream p = new PrintStream(f);) {
			for (int x : arrl2) {
				p.printf("%d ", x);
			}
			p.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		random();

	}

}
