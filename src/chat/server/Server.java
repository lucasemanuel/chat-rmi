/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server;

import chat.rmi.Sender;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author emanuel
 */
public class Server {
    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException{

        LocateRegistry.createRegistry(10001);
        Sender stub = new Messenger();
        Naming.bind("rmi://127.0.0.1:10001/sender", stub);

    }
    
}
