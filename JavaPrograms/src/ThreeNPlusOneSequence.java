import java.util.*;

public class ThreeNPlusOneSequence {

	public static void main(String[] args) {
		for(int i=2;i<1001;i++) {
			ArrayList<Integer> a = sequence(i);
			System.out.print(" starting n: " + i + " L(n): " + a.size() + ", ");
		}
	}
	
	
	public static ArrayList<Integer> sequence(int n) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		while(n!=1) {
			s.add(n);
			if(n%2==0) n=n/2;else n=3*n+1;
		}
		s.add(n);
		return s;
	}

}
