import java.util.Scanner;
class Swap
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter two integers");
     int a=s.nextInt();
     int b=s.nextInt();
     System.out.println("before swapping" +a+ "" +b);
     int temp;
     temp=a;
     a=b;
     b=temp;
     System.out.println("after swapping" +a+ "" +b);
   }
}