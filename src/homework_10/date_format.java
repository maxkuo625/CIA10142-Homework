package homework_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class date_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("請輸入日期(年月日，例如:20110131): ");
		Scanner sc = new Scanner(System.in);
		String regex = "^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$";
		String input;
		LocalDate date = null;
		while (date == null) {
			input = sc.nextLine();
			if (!input.matches(regex)) {
				System.out.println("日期格式不正確，請再輸入一次: ");
				continue;
			}
			
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd")
						.withResolverStyle(ResolverStyle.STRICT);
				date = LocalDate.parse(input, formatter);
			} catch (DateTimeParseException de) {
				System.out.println("輸入日期無效，請再輸入一次: ");
			}
		}
		

		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
		DateTimeFormatter formatter;
		while (true) {
			int format = sc.nextInt();
			switch (format) {
			case 1:
				formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				break;
			case 2:
				formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				break;
			case 3:
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				break;
			default:
				System.out.println("選擇無效，請重新輸入: ");
				continue;
			}
			break;
		}

		System.out.println(date.format(formatter));
		sc.close();

	}

}
