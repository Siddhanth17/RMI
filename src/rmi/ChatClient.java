package rmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ChatClient extends UnicastRemoteObject implements ClientCallback{
    protected ChatClient() throws Exception{
        super();
    
    }

    public void receiveMessage(String message){
        System.out.println("Received: " + message);
    }
}