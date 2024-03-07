package homework_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();
		while (set.size() < 5) {
			set.add((int) (Math.random() * 100 + 1));
		}

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			if (num == 1) {
				System.out.println("1不是質數");
				continue;
			}
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if ((num % i == 0)) {
					System.out.println(num + "不是質數");
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + "是質數");
			}
		}

	}

}
