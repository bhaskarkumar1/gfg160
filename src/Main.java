import arrayModule.MoveAllZeroToEnd;
import arrayModule.ReverseArray;
import arrayModule.SecondMax;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SecondMax sm= new SecondMax();
        int[] arr={10,5,10};
        System.out.println(sm.getSecondLargest1(arr));
        System.out.println(sm.getSecondLargest2(arr));
        int moveZero[] ={0,2,0,1,0,3};
        MoveAllZeroToEnd mv= new MoveAllZeroToEnd();
        mv.MoveAllZero2End(moveZero);
        System.out.println(Arrays.toString(moveZero));
        ReverseArray rev= new ReverseArray();
        rev.reverseArray(moveZero);
        System.out.println(Arrays.toString(moveZero));
    }
}