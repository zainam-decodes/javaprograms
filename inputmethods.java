import java.util.Scanner;
public class inputmethods{
   public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
 //basic input methods
     System.out.println("Enter your name:");
     String name=scanner.next();
     scanner.nextLine();
     System.out.println("Enter your college name:");
     String college=scanner.nextLine();
     System.out.println("Enter your rollno:");
     int rollNumber=scanner.nextInt();
     System.out.println("Enter  your 1st year marks percentag:");
     float marks=scanner.nextFloat();
     scanner.close();
     System.out.println("-----your details----\n");
     System.out.println("Name:"+name);
     System.out.println("\n College:"+college);
     System.out.println("\nRollno:"+rollNumber);
     System.out.println("\nPercentage:"+marks);
     }
}

