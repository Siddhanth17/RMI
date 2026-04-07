package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args){
        try {
            HelloImpl obj = new HelloImpl();

            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("Hello Service",obj);

            System.out.println("server Started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
