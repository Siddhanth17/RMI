package rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Calculatorimpl extends UnicastRemoteObject implements Calculator{
    public Calculatorimpl() throws RemoteException {
        super();
    }
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }
    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }

}