package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator stub = (Calculator) registry.lookup("Calculator Service");

            double a = 10.0, b = 5.0;
            System.out.println("Addition: " + stub.add(a, b));
            System.out.println("Subtraction: " + stub.subtract(a, b));
            System.out.println("Multiplication: " + stub.multiply(a, b));
            System.out.println("Division: " + stub.divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}