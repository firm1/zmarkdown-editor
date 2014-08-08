/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author firm1
 */
public class Chapter {
    String id, title, pathIntroduction, pathConclusion;
    List<Extract> extracts;

    public Chapter(String id, String title, String pathIntroduction, String pathConclusion) {
        this.id = id;
        this.title = title;
        this.pathIntroduction = pathIntroduction;
        this.pathConclusion = pathConclusion;
        this.extracts = new ArrayList<Extract>();
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

    public String getPathIntroduction() {
        return pathIntroduction;
    }

    public void setPathIntroduction(String pathIntroduction) {
        this.pathIntroduction = pathIntroduction;
    }

    public String getPathConclusion() {
        return pathConclusion;
    }

    public void setPathConclusion(String pathConclusion) {
        this.pathConclusion = pathConclusion;
    }

    public List<Extract> getExtracts() {
        return extracts;
    }

    public void setExtracts(List<Extract> extracts) {
        this.extracts = extracts;
    }

    @Override
    public String toString() {
        return "Chapter{" + "id=" + id + ", title=" + title + ", pathIntroduction=" + pathIntroduction + ", pathConclusion=" + pathConclusion + ", extracts=" + extracts + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chapter other = (Chapter) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
