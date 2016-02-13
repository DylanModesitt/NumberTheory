import java.util.*;
public class KnownGCDKnownLCM {
	
	public static void main(String[] args) {
		ArrayList<Integer[]> result = abResult(18,720);
		for(Integer[] r: result) {
			System.out.println("m value: " + r[0] + " n value: " + r[1] + " gcd(m,n): " + gcd(r[0],r[1]) + " lcm(m,n): " + lcm(r[0],r[1]));
		}
	}
	
	public static ArrayList<Integer[]> abResult(int gcd, int lcm) {
		ArrayList<Integer[]> ab = new ArrayList<Integer[]>();
		int abProduct = gcd * lcm;
		for(int i=gcd;i<=abProduct/2;i+=gcd) {
	       if (abProduct%i == 0) {
	    	   int j = abProduct/i;
	    	   if(gcd(i,j) == gcd) {
	    		   Integer[] abResult = new Integer[2];
		    	   abResult[0] = i;
		    	   abResult[1] = j;
		    	   ab.add(abResult);
	    	   }
	       }
	    }
		return ab;
	}
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
		
	
}
