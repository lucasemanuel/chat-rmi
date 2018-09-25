/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.cliente;

import chat.rmi.Sender;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        Sender proxy = (Sender)Naming.lookup("rmi://127.0.0.1:10001/sender");
    
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            proxy.sendMessege(in.nextLine(), "Lucas");
        }
        
        in.close();
    }
    
}
