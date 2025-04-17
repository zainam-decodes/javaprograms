interface Exam{
      void allowExam();
}
interface attendance{
    boolean hasRequiredAttendance();
    }
class Student implements Exam, attendance{
      int attend;
      String name;
      Student(String name,int attendance){
          this.attend=attendance;
          this.name=name;
        }
      public boolean hasRequiredAttendance(){
        return attend >=75;

       }
      public void allowExam(){
            if(hasRequiredAttendance()){
                 System.out.println(name+" is allowed for exam");
} else {
    System.out.println(name+" is not allowed for exam ");
       }
    }
}
public class ExamMulInherit{
    public static void main(String[] args){
          Student s1=new Student("xyz", 65);
          s1.allowExam();
          Student s2=new Student("Anurag",78);
          s2.allowExam();
 
}
 }
  

