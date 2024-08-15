import java.util.*;
/*

Euler's Totient function or Euler's Phi function
 
Co primes or relative primes
coprimes for 5 -> 4
coprimes for 7 -> 6
common factor (1,5) - 1;
common factor (2,5) - 1;
common factor (3,5) - 1;
common factor (4,5) - 1;

formulae: 
    if n is prime then no of coprimes = (n-1)
    if n is product of two distinct prime numbers(p,q) then no of coprimes = (p-1)(q-1)
    if n is composite number = n - (1-1/p1)(1-1/p2)...(1-1/pn);
 */


public class Class3EulersPhiAlgorithm {

    // static List<Integer> factors;

    // public static boolean isPrime(int n){
    //     if(i==2) return true;
    //     for(int i=2;i<=Math.pow(n,0.5);i++){
    //         if(n%i==0) return false;
    //     }
    //     return true;
    // }

    // public static void getFactors(int n){
    //     boolean []check = new boolean[n+1];
    //     for(int i=2;i*i<=n;i++){
    //         for(int j=i;j<n;j++){

    //         }
    //     }
    // }

    // public static long getAns(int n){
    //     if(isPrime(n)) return n-1;
    //     else{
            
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // factors=new ArrayList<>();
        int n= sc.nextInt();
        // long ans=getAns(n);
        double res=n;
        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0) n/=p;
                //res=res-res/p=>res(1-1/p);
                //res-=res/p;
                res=res*(1-(double)1/p);
            }
        }
        if(n>1) res-=res/n;
        System.out.println(res);
        sc.close();
    }
}
