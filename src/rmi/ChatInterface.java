package rmi;
import java.rmi.*;

public interface ChatInterface extends Remote {
    void sendMessage(String message) throws RemoteException;
    String registerClient(ClientCallback client) throws RemoteException;
}