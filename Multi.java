class MultithreadingDemo extends Thread {
      public void run() 
    {
  try 
    {
//Displaying the thread that is running
      System.out.println("Thread " +Thread.currentThread().getId()+" is runnning");
      }
  catch(Exception e)
    { 
  //Throwing an exception
   System.out.println("Exception is caught ");
          }
     }
} 
//Main Class
public class Multi 
{
 public static void main (String[] args) {
 int n = 8;  //Number of threads 
for(int i=0; i<8;i++){
       MultithreadingDemo object = new MultithreadingDemo();
         object.start();
}
}
}
 
