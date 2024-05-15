import java.util.Arrays;
import java.util.Scanner;

public class ArraysT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {45,12,18,31,1,63};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 93;
        arr[3] = 23;
    }
}
