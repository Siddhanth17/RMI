package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            Chatimpl obj = new Chatimpl();
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("Chat Service", obj);
            System.out.println("Chat Server is ready.");

        } catch (Exception e) {
            System.err.println("Chat Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}