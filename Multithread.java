class Multithread implements Runnable {
     public void run() {
     System.out.println("thread is running...");
     }
     
     public static void main(String args[]) {
     Multithread m1=new Multithread();
     Thread t1 = new Thread(m1);
     t1.start();
 }
}

