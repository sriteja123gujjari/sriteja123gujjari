import java.util.Scanner;

public class averageAndRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum =0;
        int range = 0;

        for(int i =num1;i<=num2;i++){
            sum +=i;
            range +=1;
        }
        System.out.println(sum);

        float average =(float)sum/range;
        System.out.println(average);
    }
}
