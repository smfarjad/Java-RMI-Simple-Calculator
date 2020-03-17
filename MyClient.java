import java.rmi.*;
import java.util.Scanner;   //for taking input from the user

public class MyClient {
public static void main(String args[]){

try{
Calculator stub=(Calculator)Naming.lookup("rmi://localhost:5001/calculator");

System.out.println("\nSimple Calculator!");
System.out.println("===========================");

Scanner reader = new Scanner(System.in);
char a;

do{
System.out.print("\n\nEnter two numbers: ");

//nextDouble() reads the next double from the keyboard
double a1 = reader.nextDouble();
double a2 = reader.nextDouble();

System.out.print("Enter an operator (+, -, *, /): ");
char op = reader.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.println(stub.add(a1,a2));
                break;
            case '-':
                System.out.println(stub.sub(a1,a2));
                break;
            case '*':
                System.out.println(stub.mult(a1,a2));
                break;
            case '/':
                System.out.println(stub.div(a1,a2));
                break;
            
            default:
                System.out.printf("Error: Invalid operator!");
                return;
        }

        System.out.print("Enter Y/y to continue and anything else to exit: ");
        a = reader.next().charAt(0);
} while(a=='Y'|| a=='y'); 

}catch(Exception e){System.out.println(e);}
}
}

