package studentinfo;
public class eligible extends Student {
  int marks;
  public eligible (String name, int marks) {
             super(name);
             this.marks=marks;
     }
 public void checkEligible(){
             display();
             showRole();
             if(marks>=40) {
                            System.out.println("Status:Eligible for exam ");
                   } else { 
               System.out.println("Status : Not Eligible for exam " );
 } 
} }