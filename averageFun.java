import java.util.Scanner;

public class averageFun {
    public static int Average(int a,int b,int c){
        int average = (a+b+c)/2;
        System.out.println("The average is : "+average);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Enter number2 : ");
        int b = sc.nextInt();
        System.out.println("Enter number3 : ");
        int c = sc.nextInt();
        Average(a, b, c);
    }
}
