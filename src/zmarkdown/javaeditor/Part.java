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
public class Part {
    String id, title, pathIntroduction, pathConclusion;
    List<Chapter> chapters;

    public Part(String id, String title, String pathIntroduction, String pathConclusion) {
        this.id = id;
        this.title = title;
        this.pathIntroduction = pathIntroduction;
        this.pathConclusion = pathConclusion;
        this.chapters = new ArrayList<Chapter>();
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

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Part{" + "id=" + id + ", title=" + title + ", pathIntroduction=" + pathIntroduction + ", pathConclusion=" + pathConclusion + ", chapters=" + chapters + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Part other = (Part) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
