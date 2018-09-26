/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.server;

import java.io.Serializable;

/**
 *
 * @author emanuel
 */
public class Messege implements Serializable{
    
    private String text;
    private String user;
    
    public Messege(String text, String user) {
        this.setText(text);
        this.setUser(user);
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user.toUpperCase();
    }
    
    public String toString(){
        return this.user +": "+ this.text;
    }
}
