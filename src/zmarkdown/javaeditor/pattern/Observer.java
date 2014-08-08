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
public interface Observer {
    //method to update the observer, used by subject
    public void update();
     
    //attach with subject to observe
    public void setObservable(Observable sub);
}
