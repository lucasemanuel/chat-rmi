/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server;

import chat.rmi.Sender;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author emanuel
 */
public class Messenger extends UnicastRemoteObject implements Sender{
    
    public Messenger() throws RemoteException{
        super();
    }
    
    @Override
    public void sendMessege(String msg, String username) throws RemoteException {
        try{
            System.out.println(msg + username);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public void readMessege() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
