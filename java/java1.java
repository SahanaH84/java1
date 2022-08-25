package java;

public class java1 {
    public static void main(String[] args) {
        circle obj=new circle();
        circle obj1=new circle(2.0);
        obj.getarea();
        obj.getradius();
    }
    
}
class circle
{
   private double radius=1.0;
   private String color="red";
   circle()
   {
       System.out.println("instance colour:"+color);
   }
   circle(double radius)
   {
       System.out.println("radius:"+radius);
   }
   void getarea()
   {
       double area;
       area=3.14*radius*radius;
       System.out.println("area:"+area);
   }
   void getradius()
   {
       System.out.println("instance radius:"+radius);
   }
           
}
