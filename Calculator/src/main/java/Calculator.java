import java.util.*;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Enter your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        char ch=sc.next().charAt(0);
        addition a=new addition();
        subtraction s=new subtraction();
        Multiply m=new Multiply();
        Division d=new Division();
        if(ch=='1') {
            a.add(num1, num2);
            a.display();
        }
        else if(ch=='2') {
            s.sub(num1, num2);
            s.display();
        }
        else if(ch=='3') {
            m.mul(num1, num2);
            m.display();
        }
        else if(ch=='4') {
            d.div(num1,num2);
            d.display();
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}