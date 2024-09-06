import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class simple_calc {
   public static void main(String args[]){

      char oper;
      double result;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the operation to perform '+,-,*,/' :");
      oper = input.next().charAt(0);

      System.out.println("Enter the 1st number:");
      double n1 =input.nextDouble();

      System.out.println("Enter the 2st number:");
      double n2 =input.nextDouble();

      switch (oper){
         case '+':
            result= n1+n2;
            System.out.println("calculating....");
            System.out.println(n1 + " + " + n2 + " = " + result);
            break;

         case '-':
            result=n1-n2;
            System.out.println("calculating....");
            System.out.println(n1 + " - " + n2 + " = " + result);
            break;

         case '/':
            result=n1/n2;
            System.out.println("calculating....");
            System.out.println(n1 + " / " + n2 + " = " + result);
            break;

         case '*':
            result=n1*n2;
            System.out.println("calculating....");
            System.out.println(n1 + " * " + n2 + " = " + result);
            break;

         default:
            System.out.println("!!Error!!  Invalid Operator");

      }

   }
}
