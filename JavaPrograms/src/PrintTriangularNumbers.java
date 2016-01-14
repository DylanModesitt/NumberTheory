
public class PrintTriangularNumbers {

	public static void main(String[] args) {
		long i = 0;
        long startTime = System.currentTimeMillis();
        while(false||(System.currentTimeMillis()-startTime)<1000) {
            System.out.print((i*i + i)/2 + ", ");
            i++;
        }
	}

}
