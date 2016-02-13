
public class SumsOfHigherPowersAEqualsB {
	public static void main(String[] args) {
		int distance = 1000;
		for(int x=1;x<distance;x++) {
				for(int z=1;z<distance;z++) {
					int aAndB = x*z;
					int c = z*z;
					
					if(2*(aAndB*aAndB*aAndB) == c*c) 
						System.out.println("a value: " + aAndB + " b value: " + aAndB + " c value: " + c);
				}
			}
		}
	}
