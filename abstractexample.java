abstract class Shape{
    abstract double area();
    void display(){
     System.out.println("displays area of shape");
  }
}
class Circle extends Shape {
   private double radius;
   Circle(double radius){
    this.radius=radius;
}
 double area(){
   return Math.PI*radius*radius;
}
}
public class abstractexample{
    public static void main(String[] args){
       Shape circle = new Circle(5.5);
       System.out.println("Area of Circle is :"+circle.area());
 }
}
