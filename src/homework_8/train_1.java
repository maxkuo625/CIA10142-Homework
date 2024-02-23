package homework_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class train_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<train> set = new HashSet<>();
		set.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new train(1254, "區間", "屏東", "基隆", 700));
		set.add(new train(118, "自強", "高雄", "台北", 500));
		set.add(new train(1288, "區間", "新竹", "基隆", 400));
		set.add(new train(122, "自強", "台中", "花蓮", 600));
		set.add(new train(1222, "區間", "樹林", "七堵", 300));
		set.add(new train(1254, "區間", "屏東", "基隆", 700));

		Iterator<train> i = set.iterator();

		System.out.println("Iterator取值:");
		while (i.hasNext()) {

			train t = i.next();
			System.out.println(t);
		}
		System.out.println();

		System.out.println("for-each取值:");
		for (train t : set) {

			System.out.println(t);
		}
		System.out.println();

	}

}
