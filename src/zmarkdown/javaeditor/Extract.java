/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor;

import java.util.Objects;

/**
 *
 * @author firm1
 */
public class Extract {
    String id, title, pathText;

    public Extract(String id, String title, String pathText) {
        this.id = id;
        this.title = title;
        this.pathText = pathText;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPathText() {
        return pathText;
    }

    public void setPathText(String pathText) {
        this.pathText = pathText;
    }

    @Override
    public String toString() {
        return "Extract{" + "id=" + id + ", title=" + title + ", pathText=" + pathText + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Extract other = (Extract) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
