import java.util.Scanner;
class Circle {
   float radius;
   double pi= 3.4285;
   void area()  {
	double a = pi*radius*radius;
	System.out.println("area of circle: "+a);
     }	
   void circum()  {
	double cir = 2*pi*radius;
	System.out.println("diameter of circle: "+cir);
      }
   }
class Circle1  {
   public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius:");
	Circle obj= new Circle();
	obj.radius = sc.nextFloat();
	obj.area();
	obj.circum();
      }
   }

/*

C:\Users\prake\java1\javalab>javac java3a.java

C:\Users\prake\java1\javalab>java Circle1
enter the radius:
14.3
area of circle: 701.0939837025263
diameter of circle: 98.05510130786897

*/