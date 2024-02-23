package homework_8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class train_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<train> treeset = new TreeSet<>();
		treeset.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		treeset.add(new train(1254, "區間", "屏東", "基隆", 700));
		treeset.add(new train(118, "自強", "高雄", "台北", 500));
		treeset.add(new train(1288, "區間", "新竹", "基隆", 400));
		treeset.add(new train(122, "自強", "台中", "花蓮", 600));
		treeset.add(new train(1222, "區間", "樹林", "七堵", 300));
		treeset.add(new train(1254, "區間", "屏東", "基隆", 700));
		
		System.out.println("for-each取值:");
		for(train t : treeset) {
			System.out.println(t);
		}
		System.out.println();
		
		System.out.println("Iterator取值:");
		Iterator<train> i = treeset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
