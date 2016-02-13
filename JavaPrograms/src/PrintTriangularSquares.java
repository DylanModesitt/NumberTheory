
public class PrintTriangularSquares {

	public static void main(String[] args) {
		long i = 0;
        while(true) {
            if(isPerfectSquare((i*i + i)/2))
                 System.out.print((i*i + i)/2  + ", ");
            i++;
        }
	}
	
	public static boolean isPerfectSquare(long i) {
        long closestRoot = (long) Math.sqrt(i);
        return i == closestRoot * closestRoot;
    }
    
    
    public static boolean isTriangleNumber(long i) {
        double r1, r2;
        r1 = ((-1 + Math.sqrt(1 - 4*-2*i)) / (2));
        r2 = ((-1 - Math.sqrt(1 - 4*-2*i)) / (2));
        return (r1 == (int)r1 && r1 > 0 || r2 == (int)r2 && r2 > 0);
    }

}
