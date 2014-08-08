/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor;
import org.python.util.PythonInterpreter;
import org.python.core.*; 
/**
 *
 * @author firm1
 */
public class EMarkdown{
    PythonInterpreter interp;
    public EMarkdown() {
        interp = new PythonInterpreter();
        interp.exec("from markdown import Markdown");
        interp.exec("from markdown.extensions.zds import ZdsExtension");
        interp.exec("from smileys_definition import smileys");
    }
    
    public String html(String chaine) {
        interp.set("text", chaine);
        interp.exec("render = Markdown(extensions=(ZdsExtension({'inline': False, 'emoticons': smileys}),),safe_mode = 'escape', enable_attributes = False, tab_length = 4, output_format = 'html5', smart_emphasis = True, lazy_ol = True).convert(text)");
        PyString render = interp.get("render", PyString.class);
        return render.toString();
    }
}
