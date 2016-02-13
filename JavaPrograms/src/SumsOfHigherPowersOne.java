
public class SumsOfHigherPowersOne {
	public static void main(String[] args) {
		int distance = 40;
		for(int x=1;x<distance;x++) {
			for(int y=1;y<distance;y++) {
				for(int z=1;z<distance;z++) {
					int a = x*z;
					int b = y*z;
					int c = z*z;
					
					if(a*a*a + b*b*b == c*c) 
						System.out.println("a value: " + a + " b value: " + b + " c value: " + c);
				}
			}
		}

	}
}
