import java.util.*;
class StringBuild{
       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String");
            String s1=sc.next();
            s1=s1.concat("hey");
            System.out.println("String after concatenation is  "+s1);
            StringBuilder sb=new StringBuilder("hello");
            sb.append("hi");
            System.out.println("string after appending is "+sb);
          }
}
