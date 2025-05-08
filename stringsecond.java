import java.util.StringTokenizer;
import java.util.Scanner;
class StringSecond
{
      public static void main(String[] ar)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the string:");
             String s1=sc.nextLine();
             StringTokenizer st=new StringTokenizer(s1,".");
             System.out.println("Tokens extracted from the string using Stringtokenizer:");
             while (st.hasMoreTokens())
             {
                    System.out.println(st.nextToken());
              }
      }
}
