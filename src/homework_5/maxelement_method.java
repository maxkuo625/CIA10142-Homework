package homework_5;

import java.util.Arrays;

public class maxelement_method {

	public double maxElement(int[][] x) {
		int max;
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			max=x[0][2];
			} else max=x[1][2];
		return max;
		}
	
	public double maxElement(double[][] x) {
		double max;
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			max=x[0][2];
			} else max=x[1][2];
		return max;
		}
}
