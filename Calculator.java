import java.rmi.*;
public interface Calculator extends Remote {
public String add(double x, double y) throws RemoteException;
public String sub(double x, double y) throws RemoteException;
public String mult(double x, double y) throws RemoteException;
public String div(double x, double y) throws RemoteException;
}

