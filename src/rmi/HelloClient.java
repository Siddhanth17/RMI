package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);

            Hello stub = (Hello) registry.lookup("Hello Service");

            String response = stub.sayHello();

            System.out.println("Server says: "+ response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
