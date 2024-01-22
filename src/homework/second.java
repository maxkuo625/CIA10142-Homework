package homework;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int second = 256559;
		int sec = second % 60;
		int minute = second / 60;
		System.out.println("256559秒是" + minute + "分鐘" + sec + "秒");
		int min = 4275 % 60;
		int hour = minute / 60;
		System.out.println("256559秒是" + hour + "小時" + min + "分鐘" + sec + "秒");
		int hr = hour % 24;
		int day = hour / 24;
		System.out.println("256559秒是" + day + "天" + hr + "小時" + min + "分鐘" + sec + "秒");

	}

}
