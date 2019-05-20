package extra;

public class fibanocci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
	
		System.out.println(a);
		System.out.println(b);
		for (int t = 0; t < 13; t++) {
			int i = b;
			b = a + b;
		
			System.out.println(b);
			a = i;

		}

	}

}
