package Cal;
import java.util.Scanner;

/**
 *
 * @author mhshi
 */

public class Calculator {
    
    void performAdd(int x,int y)
        {
            System.out.println();
            System.out.printf("result = %d\n",x+y);
            
            for(int i=0;i<32;i++)
            System.out.print("------");
        }
    void performSubtraction(int x,int y)
        {
            System.out.println();
            System.out.printf("result = %d\n",Math.abs(x-y));
            System.out.println("(Showing you non negative interger)");
            
            for(int i=0;i<32;i++)
            System.out.print("------");
        }
     void performMultiplication(int x,int y){
            System.out.println();
            System.out.printf("result = %d\n",x*y);
                
                for(int i=0;i<32;i++)
            System.out.print("------");
        }
    void performDivision(float x,float y){
            System.out.println();
            System.out.printf("result = ");
            System.out.println(x/y);
            
            for(int i=0;i<32;i++)
            System.out.print("------");
        }
    
    public static void main(String[] args)
    {
        int a,b,c;
        boolean on = true;
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t");
        for(int i=0;i<34;i++)
            System.out.print("*");
        
        System.out.println("\n\t\t* 👍Welcome to \"Java Calculator\"👍 *");
        
        System.out.print("\t\t");
        for(int i=0;i<34;i++)
            System.out.print("*");
        
        
        System.out.print("\nEnter your username : ");
        String username = input.nextLine();
        System.out.print("Enter your password : ");
        int password = input.nextInt();
        
        for(int i=0;i<32;i++)
            System.out.print("------");
        
        while(on){
            System.out.println("What do you wnat to do :?\n"
                    + "1.Addition\n"
                    + "2.Subtraction\n"
                    + "3.Multiplication\n"
                    + "4.Division");
            System.out.println();
            
            System.out.print("->");
            int no = input.nextInt();
            if(no<=0 || no>=5){
                System.out.print("You have entered a wrong number!"
                +" please try again");
            System.out.print("->");
            no = input.nextInt();
            }
            
            Calculator calculator = new Calculator();
            
            for(int i=0;i<32;i++)
            System.out.print("------");
            System.out.println();
            
            if(no==1){
                System.out.println("\nCalculator in Addition mode :");
                System.out.println();
            
                System.out.print("Enter a number :");
                a=input.nextInt();
                System.out.print("Enter another number :");
                b=input.nextInt();
                
                calculator.performAdd(a,b);
            }
            
            else if(no==2){
            System.out.println("\nCalculator in Subtraction mode :");
            System.out.println();
            
                System.out.print("Enter a number :");
                a=input.nextInt();
                System.out.print("Enter a number :");
                b=input.nextInt();
                
                calculator.performSubtraction(a,b);
            }
            
            
            else if(no==3){
                System.out.println("\nCalculator in Multiplication mode ::");
                System.out.println();
                
                System.out.print("Enter a number :");
                a=input.nextInt();
                System.out.print("Enter a number :");
                b=input.nextInt();
                
                calculator.performMultiplication(a,b);
            }
            
            else if(no ==4){
                System.out.println("\nCalculator in Division mode :");
                System.out.println();
                   
                System.out.print("Enter a number :");
                a=input.nextInt();
                System.out.print("Enter a number :");
                b=input.nextInt();
                
                calculator.performDivision((a),(b));
            }
            
            
            System.out.println("\nPress 1: If you want to quit\n"
                    + "Otherwise: Press any number except 1 😂");
            
            System.out.print("->");
            c= input.nextInt();
            if(c==1)
                on=false;
            else on=true;
            for(int i=0;i<32;i++)
            System.out.print("------");
            System.out.println();
        }
        
        System.out.print("\t\t");
        for(int i=0;i<41;i++)
            System.out.print("*");
        System.out.println("\n\t\t* 😍 Thank you for uisng my calculator 😍 *");
        System.out.print("\t\t");
        for(int i=0;i<41;i++)
            System.out.print("*");
        System.out.println();
    }
        
}
