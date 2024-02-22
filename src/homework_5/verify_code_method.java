package homework_5;

public class verify_code_method {

	public void genAuthCode() {
		int[] code = new int[8];
		int r;
		for (int i = 0; i < code.length; i++) {
			while (true) {
				r = (int) (Math.random() * 75) + 48;
				if ((47 < r && r < 58) || (64 < r && r < 91) || (96 < r && r < 123)) {
					code[i] = r;
					System.out.print((char) code[i]);
					break;
				}
			}
		}
	}
}