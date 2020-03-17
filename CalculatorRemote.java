import java.rmi.*;
import java.rmi.server.*;

public class CalculatorRemote extends
UnicastRemoteObject implements Calculator {
CalculatorRemote() throws RemoteException{
super(); }

public String add(double x, double y){
String result;
result = "Sum : " + (x+y);
return result;}

public String sub(double x, double y){
String result;
result = "Difference(first value - second value) : " + (x-y);
return result;}

public String mult(double x, double y){
String result;
result = "Product : " + (x*y);
return result;}

public String div(double x, double y){
String result;
if(y==0) result="Division: Math Error! You cannot divide by 0.";
else result = "Quotient : " + (x/y) + "\nRemainder : " +(x%y);
return result;}

}

