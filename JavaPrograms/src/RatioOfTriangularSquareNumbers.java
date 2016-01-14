
public class RatioOfTriangularSquareNumbers {

	public static void main(String[] args) {
		long i = 0;
        while(true) {
            if(isTriangleNumber(i) && isPerfectSquare(i))
                 System.out.println("number: " + i + " Square: " + Math.sqrt(i) + " Triangular Number: " +  triangularNumber(i) + " Ratio: " + triangularNumber(i)/Math.sqrt(i));
            i++;
        }
	}
	
	public static long triangularNumber(long i) {
        return (long)((-1 + Math.sqrt(1 - 4*-2*i)) / (2));
    }
    
    public static boolean isPerfectSquare(long i) {
        long closestRoot = (long) Math.sqrt(i);
        return i == closestRoot * closestRoot;
    }
    
    
    public static boolean isTriangleNumber(long i) {
        double r1, r2;
        r1 = ((-1 + Math.sqrt(1 - 4*-2*i)) / (2));
        return (r1 == (int)r1 && r1 > 0);
    }
}
