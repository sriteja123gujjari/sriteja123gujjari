import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();       
            System.out.println(isArmstrong(a));          
       }


    static boolean isArmstrong(int a){
        int original = a;
        int sum = 0;

        while(a > 0){
            int rem = a % 10;
            a = a/10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

}
