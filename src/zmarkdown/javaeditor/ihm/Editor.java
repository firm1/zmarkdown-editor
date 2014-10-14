/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor.ihm;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.DefaultMutableTreeNode;
import zmarkdown.javaeditor.Chapter;
import zmarkdown.javaeditor.EMarkdown;
import zmarkdown.javaeditor.Extract;
import zmarkdown.javaeditor.Part;
import zmarkdown.javaeditor.Tutorial;
import zmarkdown.javaeditor.pattern.Observable;
import zmarkdown.javaeditor.pattern.Observer;

/**
 *
 * @author firm1
 */
public class Editor extends javax.swing.JFrame implements Observable{

    private Tutorial tutorial;
    EMarkdown md;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        this.sources=new ArrayList<Observer>();
        md=new EMarkdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuQuit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zest'Editor");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setText("<html>\n  <head>\n\n  </head>\n  <body>\n  <table style=\"padding:10px;\">\n  <tr>\n  <td valign=\"top\" >\n   <h1>Zest'Editor</h1>\n   <h2>Rédigez vos documents en zMarkdown</h2>\n   <p>\nZest'Editor est un outil de rédaction, qui permet de rédiger un texte en zMarkdown et d'avoir un aperçu <strong>en temps réel</strong> de vos modifications. Les fonctionnalités principales offertes par Zest'Editor sont les suivantes :\n<ul>\n<li>La rédaction de vos tutoriels en <strong>hors ligne</strong>, c'est à dire sans avoir besoin d'une connexion internet</li>\n<li>Le support de la syntaxe <a href=\"http://zestedesavoir.com/tutoriels/221/rediger-sur-zds/\">zMarkdown</a></li>\n<li>La prévisualisation instantanée des modifications du texte</li>\n<li>La navigation dans le sommaire d'un tutoriel sous forme d'arbre</li>\n<li>La personnalisation de l'éditeur selon vos gouts(police d'écriture, couleur de texte, couleur de fond, look and feel)</li>\n<li>Les boutons d'aide à la rédaction (gras, italique, listes, touches, etc.)</li>\n<li>Le téléchargement des archives des tutoriels publiés</li>\n</ul>\n   </p>\n<p>\nZest'Editor met à votre disposition des raccourcis claviers qui améliorent votre productivité lors de la rédaction. Pour plus d'information, veuillez consulter la <a href=\"http://zestedesavoir.com/forums/sujet/1003/editeur-offline-pour-les-tutoriels-de-zds/\">fiche de présentation du projet</a> en ligne.\n</p>\n  </td>\n  <td style=\"width:33%\" valign=\"top\">\n   <h1>OpenSource</h1>\n   <h2>Zest'Editor entièrement libre</h2>\n   <p>\n   Zest'Editor est un logiciel sous licence <i>Open Source</i>. Ce qui signifie que tout le monde peux consulter, modifier et réutiliser son code source qui est sous <a href=\"http://opensource.org/licenses/MIT\">licence MIT</a>.\n   </p>\n<img src=\"http://zestedesavoir.com/media/galleries/817/f02587cc-1803-4319-a95b-a6a1449b7798.png\" />\n<p>\nCe dernier est hébergé et versionné sur la plateforme GitHub en tant que dépot git via <a href=\"https://github.com/firm1/zmarkdown-editor\">ce lien</a>\n</p>\n<p>\nLe code est écrit essentiellement en langage Java, il s'appuie sur la bibliothèque Jython pour faire appel au parseur zMarkdown utilisé pour le site internet, pour éviter la réecriture de celui-ci. L'avantage est donc que Zest'Editor pourra bénéficier des mises à jour du dépot <a href=\"https://github.com/zestedesavoir/Python-ZMarkdown\">zMarkdown</a> automatiquement.\n</p>\n  </td>\n  <td style=\"width:33%\" valign=\"top\">\n   <h1>Zeste de Savoir</h1>\n   <h2>Partagez vos connaissances</h2>\n   <p>\n   Zeste de Savoir est un site internet qui vous permets de partager vos connaissances. Vous pourre y trouver des tutoriels et de tous les niveaux, des articles ainsi qu'un forum d'entraide animés par et pour la communauté.\n   </p>\n<p>\nTous les membres peuvent écrire et publier du contenu (articles, tutoriels) sur le site. Pour assurer la qualité et la pédagogie du contenu, l'équipe du site valide chaque cours avant publication.\n</p>\n<br />\n   <p>\n<img src=\"http://zestedesavoir.com/media/galleries/817/16f9ec90-e7ac-4cde-9d95-d4eed1cb9f19.png\"/>\n   </p>\n  </td>\n  </tr>\n  </table>\n  </body>\n</html>\n");
        jEditorPane1.setToolTipText("");
        jScrollPane4.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane4, java.awt.BorderLayout.CENTER);
        jPanel1.add(filler1, java.awt.BorderLayout.LINE_END);

        jTabbedPane1.addTab("Acceuil", jPanel1);

        jPanel2.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Tutoriel", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        menuFile.setText("Fichier");

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpen.setText("Ouvrir");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSave.setText("Enregistrer");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);
        menuFile.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Fermer l'onglet");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFile.add(jMenuItem1);

        jMenuItem11.setText("Préférences");
        menuFile.add(jMenuItem11);
        menuFile.add(jSeparator3);

        menuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuQuit.setText("Quitter");
        menuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuitActionPerformed(evt);
            }
        });
        menuFile.add(menuQuit);

        jMenuBar1.add(menuFile);

        jMenu1.setText("Affichage");

        jMenuItem2.setText("Police");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.setText("Couleurs");

        jMenuItem3.setText("Texte");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Fond");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenu1.add(jMenu2);

        jMenu4.setText("Look and Feel");

        jMenuItem6.setText("Système d'exploitation");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Sea Glass");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem5.setText("jGoodies");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu5.setText("jTattoo");

        jMenuItem9.setText("Aero");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Windows");
        jMenu5.add(jMenuItem10);

        jMenu4.add(jMenu5);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("En ligne");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Télécharger une archive");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Aide");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        for (Observer src:this.sources) {
            if (src instanceof Source) {
                ((Source) src).saveFile();
            }
        }
        /*
        JPanel now=(JPanel)jTabbedPane1.getSelectedComponent();
        for (Component component:now.getComponents()) {
            if (component instanceof JSplitPane){
                JSplitPane split = (JSplitPane) component;
                for (Component spcomp:split.getComponents()) {
                    if (spcomp instanceof JPanel){
                        JPanel globe = (JPanel) spcomp;
                        for (Component gb:globe.getComponents()) {
                            if (gb instanceof JScrollPane){
                                JScrollPane scroll = (JScrollPane) gb;
                                JViewport pack = scroll.getViewport();
                                for (Component sp:pack.getComponents()) {
                                    if (sp instanceof Source){
                                        Source source = (Source) sp;
                                        source.saveFile();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }*/
    }//GEN-LAST:event_menuSaveActionPerformed


    public void initEditor(JPanel panel, DefaultMutableTreeNode node)
    {
        String path = tutorial.getPath()+File.separator+mappingRowFile.get(node);
        JSplitPane spliter = new JSplitPane();
        spliter.setResizeWeight(.5d);
        JScrollPane scrollLeft = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollLeft.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("Texte zMarkdown")));

        Source textarea = new Source(path, this.defaultFont, this.foreground, this.background);
        textarea.setLineWrap(true);
        HelpBox help=new HelpBox(textarea);
        
        scrollLeft.setViewportView(textarea);
        JScrollPane scrollRight = new JScrollPane();
        scrollRight.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("Rendu Final")));

        Render textpane = new Render(md);
        textarea.register(textpane);
        textpane.setObservable(textarea);
        scrollRight.setViewportView(textpane);
        
        JPanel globe=new JPanel();
        globe.setLayout(new BorderLayout());
        globe.add(help, BorderLayout.NORTH);
        globe.add(scrollLeft, BorderLayout.CENTER);
        spliter.setLeftComponent(globe);
        spliter.setRightComponent(scrollRight);
        
        panel.add(spliter, java.awt.BorderLayout.CENTER);
        
        // chargement du contenu des fichiers
        StringBuilder chaine=new StringBuilder();
        try {
            Scanner scanner=new Scanner(new File(path));
            // On boucle sur chaque champ detecté
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                chaine.append(line);
                chaine.append('\n');
            }
            scanner.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        textarea.setText(chaine.toString());
        textpane.update();
        register(textarea);
        textarea.setObservable(this);
        
    }
    public void actualiseTree()
    {
        if (tutorial != null) {
            mappingRowFile = new HashMap<DefaultMutableTreeNode, String>();
            mappingRowTitle = new HashMap<DefaultMutableTreeNode, String>();
            mappingRowPanel = new HashMap<DefaultMutableTreeNode, JPanel>();
            tree = new JTree();
            DefaultMutableTreeNode racine = new DefaultMutableTreeNode(tutorial.getTitle()) ;
            if (tutorial.getParts().size()>0) {
                DefaultMutableTreeNode ti_node=new DefaultMutableTreeNode("Introduction", false);
                mappingRowFile.put(ti_node, "introduction.md");
                mappingRowTitle.put(ti_node, "Introduction");
                racine.add(ti_node);
                for (Part part:tutorial.getParts())
                {
                    DefaultMutableTreeNode p_node=new DefaultMutableTreeNode(part.getTitle());
                    DefaultMutableTreeNode pi_node=new DefaultMutableTreeNode("Introduction", false);
                    mappingRowFile.put(pi_node, part.getPathIntroduction());
                    mappingRowTitle.put(pi_node, "Introduction");
                    p_node.add(pi_node);
                    for (Chapter chapter:part.getChapters()) {
                        DefaultMutableTreeNode c_node=new DefaultMutableTreeNode(chapter.getTitle());
                        DefaultMutableTreeNode ci_node=new DefaultMutableTreeNode("Introduction", false);
                        mappingRowFile.put(ci_node, chapter.getPathIntroduction());
                        mappingRowTitle.put(ci_node, "Introduction");
                        c_node.add(ci_node);
                        for (Extract extract:chapter.getExtracts()) {
                            DefaultMutableTreeNode e_node=new DefaultMutableTreeNode(extract.getTitle(), false);
                            mappingRowFile.put(e_node, extract.getPathText());
                            mappingRowTitle.put(e_node, extract.getTitle());
                            c_node.add(e_node);
                        }
                        DefaultMutableTreeNode cc_node=new DefaultMutableTreeNode("Conclusion", false);
                        mappingRowFile.put(cc_node, chapter.getPathConclusion());
                        mappingRowTitle.put(cc_node, "Conclusion");
                        c_node.add(cc_node);
                        p_node.add(c_node);
                    }
                    DefaultMutableTreeNode pc_node=new DefaultMutableTreeNode("Conclusion", false);
                    mappingRowFile.put(pc_node, part.getPathConclusion());
                    mappingRowTitle.put(pc_node, "Conclusion");
                    p_node.add(pc_node);
                    racine.add(p_node);
                }
                DefaultMutableTreeNode tc_node=new DefaultMutableTreeNode("Conclusion", false);
                mappingRowFile.put(tc_node, "conclusion.md");
                mappingRowTitle.put(tc_node, "Conclusion");
                racine.add(tc_node);
            }
            if (tutorial.getChapter()!=null)
            {   
                DefaultMutableTreeNode i_node=new DefaultMutableTreeNode("Introduction", false);
                mappingRowFile.put(i_node, "introduction.md");
                mappingRowTitle.put(i_node, "Introduction");
                racine.add(i_node);
                for (Extract extract:tutorial.getChapter().getExtracts()) {
                    DefaultMutableTreeNode e_node=new DefaultMutableTreeNode(extract.getTitle(), false);
                    mappingRowFile.put(e_node, extract.getPathText());
                    mappingRowTitle.put(e_node, extract.getTitle());
                    racine.add(e_node);
                }
                DefaultMutableTreeNode c_node=new DefaultMutableTreeNode("Conclusion", false);
                mappingRowFile.put(c_node, "conclusion.md");
                mappingRowTitle.put(c_node, "Conclusion");
                racine.add(c_node);
            }
            tree = new JTree(racine);
            this.jPanel2.add(new JScrollPane(tree));
            
            MouseListener ml = new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    DefaultMutableTreeNode node=(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    if (node != null && e.getClickCount()==2 && node.getChildCount()==0) {
                        if (!mappingRowPanel.containsKey(node)){
                            JPanel pan=new JPanel();
                            pan.setLayout(new java.awt.BorderLayout());
                            jTabbedPane1.addTab(mappingRowTitle.get(node), pan);
                            jTabbedPane1.revalidate();
                            initEditor(pan, node);
                            mappingRowPanel.put(node, pan);
                        }
                        jTabbedPane1.setSelectedComponent(mappingRowPanel.get(node));
                    }
                }
            };
            tree.addMouseListener(ml);
        }
    }
    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        JFileChooser dialog = new JFileChooser(new File("."));
	dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	if (dialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    File file = dialog.getSelectedFile();
            tutorial = new Tutorial(file.getAbsolutePath());
            boolean check=tutorial.initMetadata();
            if (!check) { 
                new JOptionPane().showMessageDialog(this, "Désolé, vous avez sélectionner le répertoire \""+file.getAbsolutePath()+"\", \nIl ne contient pas de tutoriel Zeste de Savoir. Veuillez sélectionner la racine du répertoire du tutoriel pour pouvoir l'éditer.\n Merci",  "Mauvais répertoire sélectionné", JOptionPane.ERROR_MESSAGE);
            }
            else {
                actualiseTree();
            }
	}
    }//GEN-LAST:event_menuOpenActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jTabbedPane1.getSelectedIndex()>0) {
            jTabbedPane1.remove(jTabbedPane1.getSelectedComponent());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuQuitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFontChooser fontChooser = new JFontChooser();
        int result = fontChooser.showDialog(this);
        if (result == JFontChooser.OK_OPTION)
        {
            Font font = fontChooser.getSelectedFont();
            this.defaultFont = font;
            for (Observer src : sources)
            {
                if (src instanceof Source) {
                    ((Source)src).setFonte(this.defaultFont);
                    ((Source)src).update();
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.foreground = JColorChooser.showDialog(this, "Choisissez la couleur de votre texte", this.foreground);
        
        for (Observer src : sources)
        {
            if (src instanceof Source) {
                ((Source)src).setForeground(this.foreground);
                ((Source)src).update();
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.background = JColorChooser.showDialog(this, "Choisissez la couleur de fond du texte", this.background);
        
        for (Observer src : sources)
        {
            if (src instanceof Source) {
                ((Source)src).setBackground(this.background);
                ((Source)src).update();
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
            this.repaint();
            this.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            this.repaint();
            this.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new OnlineContent(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
    public JTree tree;
    private List<Observer> sources;
    private final Object MUTEX= new Object();
    private boolean changed;
    private Font defaultFont;
    private Color foreground = new Color(250, 250, 250), background = new Color(17, 17, 17);
    private Map<DefaultMutableTreeNode, String> mappingRowFile;
    private Map<DefaultMutableTreeNode, String> mappingRowTitle;
    private Map<DefaultMutableTreeNode, JPanel> mappingRowPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuQuit;
    private javax.swing.JMenuItem menuSave;
    // End of variables declaration//GEN-END:variables

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!sources.contains(obj)) sources.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            sources.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<Observer>(this.sources);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate() {
        return this;
    }

}
