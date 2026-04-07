package rmi;

import java.rmiserver.UnicastRemoteObject;

public class Chatimpl extends UnicastRemoteObject implements ChatInterface{
    List<ClientCallback> clients;

    public class Chatimpl() throws RemoteException{
        clients = new ArrayList<>();
    }

    public void registerClient(ClientCallback client){
        clients.add(client);
        System.out.println("Client registered: " + client);
    }
}