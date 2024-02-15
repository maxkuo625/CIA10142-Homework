package homework_4;

public class planet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] p={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"} ;
		int vowel = 0;
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < p[i].length(); j++) {
				switch(p[i].charAt(j)) {
				case 'a':
					vowel++;
					break;
				case 'e':
					vowel++;
					break;
				case 'i':
					vowel++;
					break;
				case 'o':
					vowel++;
					break;
				case 'u':
					vowel++;
					break;
				}
			}
		}
		System.out.println("p陣列中共有" + vowel + "個母音");

	}

}
