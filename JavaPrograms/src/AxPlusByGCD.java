
public class AxPlusByGCD {

	public static void main(String[] args) {
		int[] result = solveXandYPositiveMin(6,15);
		System.out.println(" g value: " + result[0] + " x value: " + result[1] + " y value: " + result[2]);
	}
	
	public static int[] solveXandYPositiveMin(int a, int b) {
		
		if(a == 0 || b==0) {
			int[] r = {-1,-1,-1};
			return r;
		} 
		int x = 1;
		int g = a;
		int v = 0;
		// set w = b. This will keep track of all the remainders
		int w = b;
		
		// check if the remainder has been calculated to be 0 yet
		while(w!=0) {
			// a mod b
			int t = g%w;
			int q = g/w;
			int s = x -q*v;
			x = v;g = w;
			v = s;w = t;
		}
		// calculate y value now that the remainder (w) is 0
		int y = (g - a*x)/b;
		int[] r = {g,x,y};
		return r;
	}
}
