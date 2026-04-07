package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Chatimpl extends UnicastRemoteObject implements ChatInterface {
    private final List<ClientCallback> clients;

    public Chatimpl() throws RemoteException {
        super();
        clients = new ArrayList<>();
    }

    @Override
    public String registerClient(ClientCallback client) throws RemoteException {
        clients.add(client);
        System.out.println("Client registered: " + client);
        return "Registered";
    }

    @Override
    public void sendMessage(String message) throws RemoteException {
        for (ClientCallback client : clients) {
            client.receiveMessage(message);
        }
    }
}