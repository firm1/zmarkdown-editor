/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor.ihm;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import zmarkdown.javaeditor.EMarkdown;
import zmarkdown.javaeditor.pattern.Observable;
import zmarkdown.javaeditor.pattern.Observer;

/**
 *
 * @author firm1
 */
public class Render extends JTextPane implements Observer{
    private Observable source;
    private EMarkdown md;
     
    public Render(EMarkdown md){
        this.setEditable(false);
        this.setContentType("text/html;charset=UTF-8");
        HTMLEditorKit kit = new HTMLEditorKit();
        this.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        loadStyle(styleSheet);
        
        HTMLDocument doc = (HTMLDocument)kit.createDefaultDocument();
        try {
            ((HTMLDocument)doc).setBase(new URL("http://zestedesavoir.com"));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        this.setDocument(doc);
        this.md = md;
    }
    @Override
    public void update() {
        String msg = (String) source.getUpdate();
        this.setText(md.html(msg));
    }
 
    @Override
    public void setObservable(Observable sub) {
        this.source=sub;
    }
    
    public void loadStyle(StyleSheet css)
    {
        css.addRule("body {font-family:verdana; margin: 15px; color: #424242;}");
        css.addRule("a:hover {color: #d68707; text-decoration: none;}");
        css.addRule("a {color: #108bbf;}");
        css.addRule("h3 {font-size: 20px;font-size: 2rem;margin-bottom: 14px; color: #ee8709;}");
        css.addRule("h4 {font-size: 18px;font-size: 1.8rem;margin-bottom: 12px; color: #424242;");
        css.addRule(".codehilite .hll{background-color:#ffc} .codehilite{background:#f8f8f8}.codehilite .c{color:#408080;font-style:italic}.codehilite .k{color:green;font-weight:700}.codehilite .o{color:#666}.codehilite .cm{color:#408080;font-style:italic}.codehilite .cp{color:#BC7A00}.codehilite .c1,.codehilite .cs{color:#408080;font-style:italic}.codehilite .gd{color:#A00000}.codehilite .ge{font-style:italic}.codehilite .gr{color:red}.codehilite .gh{color:navy;font-weight:700}.codehilite .gi{color:#00A000}.codehilite .go{color:gray}.codehilite .gp{color:navy;font-weight:700}.codehilite .gs{font-weight:700}.codehilite .gu{color:purple;font-weight:700}.codehilite .gt{color:#0040D0}.codehilite .kc,.codehilite .kd,.codehilite .kn{color:green;font-weight:700}.codehilite .kp{color:green}.codehilite .kr{color:green;font-weight:700}.codehilite .kt{color:#B00040}.codehilite .m{color:#666}.codehilite .s{color:#BA2121}.codehilite .na{color:#7D9029}.codehilite .nb{color:green}.codehilite .nc{color:#00F;font-weight:700}.codehilite .no{color:#800}.codehilite .nd{color:#A2F}.codehilite .ni{color:#999;font-weight:700}.codehilite .ne{color:#D2413A;font-weight:700}.codehilite .nf{color:#00F}.codehilite .nl{color:#A0A000}.codehilite .nn{color:#00F;font-weight:700}.codehilite .nt{color:green;font-weight:700}.codehilite .nv{color:#19177C}.codehilite .ow{color:#A2F;font-weight:700}.codehilite .w{color:#bbb}.codehilite .mf,.codehilite .mh,.codehilite .mi,.codehilite .mo{color:#666}.codehilite .sb,.codehilite .sc{color:#BA2121}.codehilite .sd{color:#BA2121;font-style:italic}.codehilite .s2{color:#BA2121}.codehilite .se{color:#B62;font-weight:700}.codehilite .sh{color:#BA2121}.codehilite .si{color:#B68;font-weight:700}.codehilite .sx{color:green}.codehilite .sr{color:#B68}.codehilite .s1{color:#BA2121}.codehilite .ss{color:#19177C}.codehilite .bp{color:green}.codehilite .vc,.codehilite .vg,.codehilite .vi{color:#19177C}.codehilite .il{color:#666}.codehilitetable{width:100%!important;table-layout:fixed;border-color:rgba(0,0,0,.15)}.codehilitetable td{padding:0;vertical-align:top}.codehilitetable .linenos{background-color:#fbfbfc;border-right:1px solid #ececf0;width:46px}.codehilitetable .codehilite pre,.codehilitetable .linenos{padding-top:15px;padding-bottom:15px}.codehilitetable .linenodiv pre{text-align:right;padding-right:7px;color:#bebec5}.codehilitetable .codehilite{width:100%;height:auto;overflow:auto}.codehilitetable .codehilite pre{white-space:pre;overflow:auto;overflow:auto}.codehilitetable .code pre{overflow:auto;word-wrap:normal;padding-left:7px;padding-right:7px}");
        
    }
}
