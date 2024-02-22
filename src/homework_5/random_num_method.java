package homework_5;

public class random_num_method {

	public void randomAvg() {
		int r;
		int[] ranArr = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果：");
		for (int i = 0; i < 10; i++) {
			r = (int)(Math.random()*101);
			ranArr[i] = r;
			System.out.print(r + " ");
			sum += ranArr[i];
		}
		System.out.println();
		System.out.print("平均值：" + (sum/ranArr.length));
	}

}
