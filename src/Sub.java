
import java.math.BigInteger;

public class Sub {

	public static int gcd(int k, int m){
		while (k != m) {
			if (k > m){
				k = k-m;
			}
			else{
				m = m-k; 
			}
		}
		return k;
	}
	public static boolean isPrime(int p){
		if(p==2){
			return true;
		}
		if(p<2||p%2==0){
			return false;
		}
		for(int i = 3; i*i <= p; i+=2){
			if(p % i == 0){
				return false;
			}
		}
		return true;
	}
	public static int sumOfFactors(int n){
        int prod=1;
        for(int k=2;k*k<=n;k++){
            int p=1;
            while(n%k==0){
                p=p*k+1;
                n/=k;
            }
            prod*=p;
        }
        if(n>1)
            prod*=1+n;
        return prod;
    }
	public static long factorial(int n){
		if (n == 0) return 1;
        else 		return n * factorial(n-1);
	}
	public static boolean isPalindrome(String s){
		if(s.substring(0, s.length()/2).equals(new StringBuilder(s.substring((s.length()+1)/2, s.length())).reverse().toString())){
			return true;
		}
		return false;
	}
	public static boolean isPermutation(String is, String js){
        if(is.length() != js.length()){
        	return false;
        }
		for (int i = 0; i<is.length(); i++){
            js = js.replaceFirst(""+is.charAt(i), "");
        }
        if(js.equals("")){
        	return true;
        }
        return false;
    }
	public static int choose(int n, int k){
		if(k == 0){
			return 1;
		}
		return (n * choose(n - 1, k - 1)) / k;
	}
	public static long choose(long n, long k){
		if(k == 0){
			return 1;
		}
		return (n * choose(n - 1, k - 1)) / k;
	}
	public static BigInteger sqrt(BigInteger n){
        BigInteger r = BigInteger.ONE.shiftLeft(n.bitLength() / 2);
        
        while (!(r.pow(2).compareTo(n) <= 0 && 
        		n.compareTo(r.add(BigInteger.ONE).pow(2)) < 0)){
            r = r.add(n.divide(r)).divide(BigInteger.valueOf(2));
        }
        return r;
	}
}
