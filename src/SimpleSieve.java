import java.util.*;


//simple sieve algorithm
class SimpleSieve{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean[] check=new boolean[num+1];
        Arrays.fill(check,true);
        check[0]=false;
        check[1]=false;
        //start from 2 check until root of n
        for(int i=2;i*i<=num;i++){
            //if the current value is prime
            if(check[i]){
                //check all the numbers of the in the range of 
                //num increament by adding the current number to 
                //current number like if i=2 the j values will be
                //2,4,6,8,10
                for(int j=i;j*i<=num;j++){
                    check[i*j]=false;
                }
            }
        }
        for(int i=0;i<num+1;i++) if(check[i]) System.out.println(i);
        sc.close();
    }
}