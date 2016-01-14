import java.util.Arrays;

public class FindTwinPrimes {
	
	public static void main(String[] args) {
		printSieve(100000,true);
	}
	
	static void printSieve(int upThrough, boolean wantTwins) {
        boolean[] primes;
        if(wantTwins) primes= fillSieveOfTwinPrimes(upThrough);
        else primes= fillSieveOfPrimes(upThrough);
        for(int i=0;i<primes.length;i++) 
             if(primes[i])
                System.out.print(i +", ");
        System.out.print("done");
    }
    
    public static boolean[] fillSieveOfPrimes(int upThrough) {
        boolean[] a = new boolean[upThrough];
        Arrays.fill(a,true);        
        a[0]=a[1]=false;       
        for (int i=2;i<a.length;i++) 
            if(a[i])
                for (int j=2;i*j<a.length;j++) 
                    a[i*j]=false;
        return a;
    }
    
    public static boolean[] fillSieveOfTwinPrimes(int upThrough) {
       boolean[] b = fillSieveOfPrimes(upThrough);
       for(int i=0;i<b.length;i++)
            if(b[i] && !b[i+2] &!b[i-2])
                b[i]=false;
       return b;
    }
    
    boolean isPrime(int n) {
        if (n == 2) return true;
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
