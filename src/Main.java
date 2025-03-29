import arrayModule.SecondMax;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SecondMax sm= new SecondMax();
        int[] arr={10,5,10};
        System.out.println(sm.getSecondLargest1(arr));
        System.out.println(sm.getSecondLargest2(arr));
    }
}