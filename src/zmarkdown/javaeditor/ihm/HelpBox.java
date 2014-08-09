/*
 * The MIT License
 *
 * Copyright 2014 firm1.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package zmarkdown.javaeditor.ihm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;

/**
 *
 * @author firm1
 */
public class HelpBox extends JPanel {

    private Source textarea;
    JButton bold, italic, h1, h2, barre, abbr, exp, ind, center, right, bullet, number, quote, link, pic, code, touche;

    public HelpBox(Source textarea) {
        this.textarea = textarea;
        //buttons
        this.bold = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_bold.png")));
        this.italic = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_italic.png")));
        this.h1 = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_heading_1.png")));
        this.h2 = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_heading_2.png")));
        this.barre = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_strikethrough.png")));
        this.abbr = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_uppercase.png")));
        this.exp = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_superscript.png")));
        this.ind = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_subscript.png")));
        this.center = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_align_center.png")));
        this.right = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_align_right.png")));
        this.bullet = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_list_bullets.png")));
        this.number = new JButton(new ImageIcon(this.getClass().getResource("/resources/text_list_numbers.png")));
        this.quote = new JButton(new ImageIcon(this.getClass().getResource("/resources/comment.png")));
        this.link = new JButton(new ImageIcon(this.getClass().getResource("/resources/link.png")));
        this.pic = new JButton(new ImageIcon(this.getClass().getResource("/resources/picture.png")));
        this.code = new JButton(new ImageIcon(this.getClass().getResource("/resources/page_white_code.png")));
        this.touche = new JButton(new ImageIcon(this.getClass().getResource("/resources/keyboard.png")));

        //buttons
        this.bold.setToolTipText("Gras");
        this.italic.setToolTipText("Italique");
        this.h1.setToolTipText("Titre 1");
        this.h2.setToolTipText("Titre 2");
        this.barre.setToolTipText("Barré");
        this.abbr.setToolTipText("Abbréviation");
        this.exp.setToolTipText("Exposant");
        this.ind.setToolTipText("Indice");
        this.center.setToolTipText("Centrer");
        this.right.setToolTipText("Aligner à droite");
        this.bullet.setToolTipText("Liste à puces");
        this.number.setToolTipText("Liste ordonnée");
        this.quote.setToolTipText("Citation");
        this.link.setToolTipText("Lien");
        this.pic.setToolTipText("Image");
        this.code.setToolTipText("Code");
        this.touche.setToolTipText("Touche clavier");

        Action boldAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "**", "**");
            }
        };
        Action italicAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "*", "*");
            }
        };
        Action barreAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "~~", "~~");
            }
        };
        Action expAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "^", "^");
            }
        };
        Action indAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "~", "~");
            }
        };
        Action centerAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "-> ", " <-");
            }
        };
        Action rightAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "-> ", " ->");
            }
        };
        Action h1Action = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "#", "\n");
            }
        };
        Action h2Action = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "## ", "\n");
            }
        };
        Action toucheAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                circle(getTextarea(), "||", "||");
            }
        };
        Action bulletAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vertical(getTextarea(), "- ", false);
            }
        };
        Action numberAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vertical(getTextarea(), ". ", true);
            }
        };
        Action quoteAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                vertical(getTextarea(), "> ", false);
            }
        };
        /*
        bold.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK), "CTRLG");
        italic.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_I,InputEvent.CTRL_MASK), "CTRLI");
        barre.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_5,InputEvent.CTRL_MASK), "CTRL5");
        exp.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,InputEvent.CTRL_MASK), "CTRL+");
        ind.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,InputEvent.CTRL_MASK), "CTRL-");
        touche.getInputMap(textarea.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_T,InputEvent.CTRL_MASK), "CTRLT");
        
        bold.getActionMap().put("CTRLG", boldAction);
        italic.getActionMap().put("CTRLI", italicAction);
        barre.getActionMap().put("CTRL5", barreAction);
        exp.getActionMap().put("CTRL+", expAction);
        ind.getActionMap().put("CTRL-", indAction);
        touche.getActionMap().put("CTRLT", toucheAction);
        */      
        bold.addActionListener(boldAction);
        italic.addActionListener(italicAction);
        barre.addActionListener(barreAction);
        exp.addActionListener(expAction);
        ind.addActionListener(indAction);
        center.addActionListener(centerAction);
        right.addActionListener(rightAction);
        h1.addActionListener(h1Action);
        h2.addActionListener(h2Action);
        touche.addActionListener(toucheAction);
        bullet.addActionListener(bulletAction);
        number.addActionListener(numberAction);
        quote.addActionListener(quoteAction);        
        
        this.setLayout(new FlowLayout());
        this.add(this.bold);
        this.add(this.italic);
        this.add(this.barre);
        this.add(this.abbr);
        this.add(this.touche);
        this.add(this.exp);
        this.add(this.ind);
        this.add(this.center);
        this.add(this.right);
        this.add(this.bullet);
        this.add(this.number);
        this.add(this.h1);
        this.add(this.h2);
        this.add(this.quote);
        //this.add(this.link);
        //this.add(this.pic);
        //this.add(this.code);
    }

    public Source getTextarea() {
        return textarea;
    }

    public void circle(Source text, String seq1, String seq2) {
        int p1 = text.getSelectionStart();
        int p2 = text.getSelectionEnd();

        text.insert(seq2, p2);
        text.insert(seq1, p1);
    }

    public void vertical(Source text, String seq, boolean num) {
        try {
            int lineStart = text.getLineOfOffset(text.getSelectionStart());
            int lineEnd = text.getLineOfOffset(text.getSelectionEnd());
            int cpt = 1;
            for (int i = lineEnd; i >= lineStart; i--) {
                if (!num) {
                    text.insert(seq, text.getLineStartOffset(i));
                } else {
                    text.insert(cpt + seq, text.getLineStartOffset(i));
                    cpt++;
                }
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
}
