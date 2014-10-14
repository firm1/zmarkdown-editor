/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import zmarkdown.javaeditor.pattern.Observable;
import zmarkdown.javaeditor.pattern.Observer;


public class Source extends JTextArea implements Observable, Observer{
    
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();
    private String path;
    private Font fonte;
    private Observable menu;
    private Color foreground;
    private Color background;

    public Source(String path, Font fonte, Color foreground, Color background) {
        this.setForeground(foreground);
        this.setBackground(background);
        this.observers=new ArrayList<Observer>();
        this.path=path;
        this.fonte = fonte;
        this.setFont(fonte);
        
        this.getDocument().addDocumentListener( new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                for(Observer obs:observers){
                    obs.update();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                for(Observer obs:observers){
                    obs.update();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                for(Observer obs:observers){
                    obs.update();
                }
            }
        });
    }

    
    public String getPath() {
        return path;
    }
    
    public void saveFile()
    {
        PrintWriter printer = null;
        try {
            printer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
            printer.print(this.getText());
        } catch (IOException ex) {
            Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printer.close();
        }
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
        if(!observers.contains(obj)) observers.add(obj);
        }
    }
 
    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
        observers.remove(obj);
        }
    }
 
    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<Observer>(this.observers);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
 
    }

    public Color getForeground() {
        return foreground;
    }
    
    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }
    
    public Color getBackground() {
        return background;
    }
    
    public void setBackground(Color background) {
        this.background = background;
    }
    
    public Font getFonte() {
        return fonte;
    }

    public void setFonte(Font fonte) {
        this.fonte = fonte;
    }
 
    @Override
    public Object getUpdate() {
        return this.getText();
    }

    @Override
    public void update() {
        if (fonte!=null) {
            this.setFont(fonte);
        }
    }

    @Override
    public void setObservable(Observable sub) {
        this.menu=sub;
    }
}
