import java.io.*;
class LAttend extends Exception 
{
       LAttend(String str) 
      {
            super(str);
       }
           public static void main(String[] args) throws IOException {
                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                  System.out.println("Enter the record submission status as (true/false)");
                  String ans=br.readLine();
                  boolean recordSubmitted = ans.equalsIgnoreCase("false");
                try {
                   System.out.println("Enter the held classes : ");
                   double h=Double.parseDouble(br.readLine());
                   System.out.println("Enter the attended classes : ");
                   double at=Double.parseDouble(br.readLine());
                   double p=(at/h)*100;
                   System.out.println("Attendance percentage is : " +p);
                   if(p<75) {
                          LAttend lat=new LAttend("YOU ARE NOT ALLOWED FOR JAVA LAB EXAM ");
                        throw lat; 
                           } 
                            }  
                 catch(LAttend la){
                 System.out.println(la);
                  }
                 catch(IOException ie) {
                 System.out.println(ie);
                  }  
                 finally {
                    if(recordSubmitted){
                        System.out.println("YOU ARE NOT ALLOWED FOR LAB EXAM WITHOUT RECORD");
                       } 
                    else {
                      System.out.println("YOU ARE ALLOWED FOR LAB EXAM ONLY IF YOU HAVE A RECORD AND ATTENDANCE ");
                     }
                     }
                     }
                     }


 
