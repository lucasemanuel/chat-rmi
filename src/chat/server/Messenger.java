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

    @Override
    public void sendMessege(String msg) throws RemoteException {
        try{
            System.out.println(msg);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}