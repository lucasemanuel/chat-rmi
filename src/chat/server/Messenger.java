/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server;

import chat.rmi.Sender;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author emanuel
 */
public class Messenger extends UnicastRemoteObject implements Sender{
    
    private List<Messege> listMessege = new ArrayList<Messege>();

    public Messenger() throws RemoteException{
        super();
    }
    
    @Override
    public void sendMessege(String text, String username) throws RemoteException {
        try{
            System.out.println(text + username);
            this.listMessege.add(new Messege(text, username));
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<Messege> readMessege() throws RemoteException {
        return (ArrayList<Messege>) this.listMessege;
    }

}
