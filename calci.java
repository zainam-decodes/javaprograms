import java.util.Scanner;

class calci {
     public static void main(String[] args) {
            char operator;
            Double number1, number2 , result;
            
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter operator (either +,-,* or /): ");
            operator=scanner.next().charAt(0);
            System.out.println("Enter number1 and number2 respectively:");
            number1 = scanner.nextDouble();
            number2=scanner.nextDouble();
     
            switch(operator) {
              case '+':
                 result= number1+number2;
                 System.out.println(number1 + "+" + number2 + "=" + result);
                 break;
              case '-':
                 result= number1-number2;
                 System.out.println(number1 + "-" + number2 + "=" + result);
                 break;
             case '*':
                 result= number1*number2;
                 System.out.println(number1 + "*" + number2 + "=" + result);
                 break;
            case '/':
                 result= number1/number2;
                 System.out.println(number1 + "/" + number2 + "=" + result);
                 break;
            default:
                 System.out.println("Invalid operator!");
                 break; 
} }}
