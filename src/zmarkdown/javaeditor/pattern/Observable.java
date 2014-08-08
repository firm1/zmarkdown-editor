/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor.pattern;

/**
 *
 * @author firm1
 */
public interface Observable {
    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);
     
    //method to notify observers of change
    public void notifyObservers();
     
    //method to get updates from subject
    public Object getUpdate();
}
