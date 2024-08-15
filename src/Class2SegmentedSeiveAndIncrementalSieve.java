import java.util.*;

public class Class2SegmentedSeiveAndIncrementalSieve {

    static boolean[] ans;

    public static void segmentedSeive(int start,int end){
        int l=start;
        int h=end;
        int sm;
        for(int i=2;i<=Math.sqrt(h);i++){
            sm=(l/i)*i;
           // if(sm<l)
        }
    }

    public static void main(String[] args) {
        int start=15;
        int end=30;
        ans=new boolean[end-start+1];
        segmentedSeive(start,end);
        System.out.println(Arrays.toString(ans));
    }
}
