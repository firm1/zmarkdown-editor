/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import zmarkdown.javaeditor.ihm.Editor;

/**
 *
 * @author firm1
 */
public class ZMarkdownJavaEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Editor edit = new Editor();
        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        edit.setExtendedState(JFrame.MAXIMIZED_BOTH);
        edit.setVisible(true);
    }
}
