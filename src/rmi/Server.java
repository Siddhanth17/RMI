package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class Server{
    public static void main(String[] args){
        try {
           Calculator obj = new Calculatorimpl();
           Registry registry = LocateRegistry.createRegistry(1099);
           registry.bind("Calculator Service", obj);
              System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}