package java;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
       Bill obj=new Bill();
       obj.cal();
    }
    
}
class Bill
{
     Scanner sc=new Scanner(System.in);
     double cnum;
     String cname,type;
     double pread,cread,n;
     void cal()
     {
     System.out.println("Enter customer number:");
     cnum=sc.nextDouble();
     System.out.println("Enter customer name:");
     cname=sc.next();
     System.out.println("Enter previous reading:");
     pread=sc.nextDouble();
     System.out.println("Enter current reading:");
     cread=sc.nextDouble();
     System.out.println("Enter type of connection:");
     type=sc.next();
     if(type.toLowerCase().equals("domestic"))
     {
         if(cread<=100)
         {
            n=(cread*1.5);
            System.out.println("Tarif:"+n);
         }
         else if(cread>100&&cread<=200)
         {
            n=150+((cread-100)*3);
            System.out.println("Tarif:"+n);
         }
         else if(cread>200&&cread<=500)
         {
            n=150+300+((cread-200)*4.50);
            System.out.println("Tarif:"+n);
         }
         else
         {
            n=150+300+1350+((cread-500)*7);
            System.out.println("Tarif:"+n);
         }
     }
     else if(type.toLowerCase().equals("commercial"))
     {
         if(cread<=100)
         {
            n=(cread*2.5);
            System.out.println("Tarif:"+n);
         }
         else if(cread>100&&cread<=200)
         {
            n=250+((cread-100)*5);
            System.out.println("Tarif:"+n);
         }
         else if(cread>200&&cread<=500)
         {
            n=250+500+((cread-200)*6.50);
            System.out.println("Tarif:"+n);
         }
         else if(cread>500)
         {
            n=250+500+1950+((cread-500)*9);
            System.out.println("Tarif:"+n);
         }
     }
     else
     {
         System.out.println("Wrong type");
     }
}
}
