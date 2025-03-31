package arrayModule;

public class ReverseArray {

    public void reverseArray(int arr[]) {
        int temp=0, l=0,r=arr.length-1;
        while(l<r){
            temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
        return;
    }

}
