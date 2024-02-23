package homework_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class train_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<train> list = new ArrayList<>();
		list.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new train(1254, "區間", "屏東", "基隆", 700));
		list.add(new train(118, "自強", "高雄", "台北", 500));
		list.add(new train(1288, "區間", "新竹", "基隆", 400));
		list.add(new train(122, "自強", "台中", "花蓮", 600));
		list.add(new train(1222, "區間", "樹林", "七堵", 300));
		list.add(new train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		System.out.println("for迴圈取值:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		
		System.out.println("for-each取值:");
		for(train t : list) {
			System.out.println(t);
		}
		System.out.println();
		
		System.out.println("Iterator取值");
		Iterator<train> k = list.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		

	}

}
