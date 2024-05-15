import java.util.Scanner;

public class Addfunction {
    public static int AddTwo(int num1,int num2){
        int sum = num1+num2;
        System.out.println(sum);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        AddTwo(num1,num2);
    }
}
