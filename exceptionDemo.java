import java.util.Scanner;

 class exceptionDemo {
    public static void main(String[] args) {
        int a,b;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number");
       a=s.nextInt();
   System.out.println("enter the number");
   b=s.nextInt();

   try{
 System.out.println(a/b);
 System.out.println("divide by zero");
   }
   catch(ArithmeticException e)
   {

    System.out.println(e);
   }

    }
}
