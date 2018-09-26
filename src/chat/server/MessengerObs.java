/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author emanuel
 */
public class MessengerObs extends Observable{
    
    public List<Messege> sendMessege(String text, String username, List<Messege> list) throws RemoteException {
        list.add(new Messege(text, username));
//        System.out.println(m.readMessege().get(0));
        return list;
    }
    
    public void verify(){
        setChanged();
//        System.out.println(list.get(0));
        notifyObservers();
    }
}
