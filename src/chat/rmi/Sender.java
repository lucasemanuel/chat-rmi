/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.rmi;

import chat.server.Messege;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public interface Sender extends Remote{
    
    void sendMessege(String messege, String username) throws RemoteException;
    ArrayList<Messege> readMessege() throws RemoteException;

}
