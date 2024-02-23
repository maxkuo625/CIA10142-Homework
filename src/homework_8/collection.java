package homework_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = new ArrayList<>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short) 100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		Iterator<Object> o = list.iterator();

		System.out.println("Iterator取值:");
		while (o.hasNext()) {
			System.out.print(o.next() + " ");
		}
		System.out.println();
		
		System.out.println("for迴圈取值:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		System.out.println("for-each取值");
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();

		Iterator<Object> i = list.iterator();

		while (i.hasNext()) {
			Object j = i.next();
			if (!(j instanceof Number)) {
				i.remove();
			}
		}
		System.out.println("將非Number物件移除後:");
		for (Object obj : list) {
			System.out.print(obj + " ");
		}

	}

}
