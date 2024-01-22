package homework;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(5+5);
		//此為預設整數型別int數值5+型別int數值5，所得為十進位之和int數值10
		System.out.println(5+'5');
		//此為預設整數型別int數值5+型別char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		System.out.println(5+"5");
		//此為預設整數型別int數值5+型別String字串5，整數與字串相加為串接相連，所得為String字串55

	}

}
