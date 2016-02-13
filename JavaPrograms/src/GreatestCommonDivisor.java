
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(gcd2(54321,9876));
	}
	
	public static long gcd1(long given1, long given2) {
		if(given1 == 0 || given2 == 0) return -1;
		long a = given1%given2;
		long b = given2%a;
		long t = 0;
		while(b != 0) {
			t = b;
			b = a%b;
			a = t;
		}
		return a;
	}
	
	public static long gcd2(long a, long b) {
		if(b==0) return a;
		else return gcd2(b,a%b);
	}
}
