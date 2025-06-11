import java.util.Scanner;

public class ArmstrongSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, temp, r;
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        
        while (n > 0) {
            r = n % 10;
            sum += r * r * r;
            n /= 10;
        }

        if (temp == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
