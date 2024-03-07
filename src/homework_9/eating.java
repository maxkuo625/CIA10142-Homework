package homework_9;

public class eating extends Thread {
	
	public int count = 1;
	public String contestant;

	eating(String contestant) {
		this.contestant = contestant;
	}
	
	public void run() {
		while (count <= 10) {
			System.out.println(contestant + "吃第" + count + "碗飯");
			if (count == 10) {
				System.out.println(contestant + "吃完了!");
			}
			count++;

			try {
				long millis = (long) (Math.random() * 2501 + 500);
				Thread.sleep(millis);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----- 大胃王快食比賽開始! -----");

		eating e1 = new eating("饅頭人");
		eating e2 = new eating("詹姆士");

		e1.start();
		e2.start();

		try {
			e1.join();
			e2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("----- 大胃王快食比賽結束! -----");

	}

}
