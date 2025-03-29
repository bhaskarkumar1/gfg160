package arrayModule;
import java.util.Arrays;
public class SecondMax {

    //Approach 1 --> sorting
    public int getSecondLargest1(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int firstMax= arr[n-1];
        for(int  i=n;i>0;i--){
            if(arr[i-1]!=firstMax) return arr[i-1];
        }
        return -1;
    }


//    Approach 2 find the firstMax and then search for secondMax
//    keeping that secondMax should be samller then firstMax

    public int getSecondLargest2(int[] arr){
        int n=arr.length;
        int fMax=Integer.MIN_VALUE;
//        get the first max
        for(int i=0;i<n;i++){
            fMax=Math.max(fMax,arr[i]);
        }
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<fMax && sMax<arr[i]) sMax=arr[i];
        }
        return  sMax == Integer.MIN_VALUE ? -1 : sMax;
    }
}
