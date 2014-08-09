/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zmarkdown.javaeditor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author firm1
 */

public class Tutorial {
    private String path, title, description;
    private TutorialType size;
    private List<Part> parts;
    private Chapter chapter;

    public Tutorial(String path) {
        this.path = path;
        parts = new ArrayList<Part>();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TutorialType getSize() {
        return size;
    }

    public void setSize(TutorialType size) {
        this.size = size;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    
    public boolean initMetadata()
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map<String,Object> jsonData = mapper.readValue(new File(getPath()+File.separator+"manifest.json"), Map.class);
            
            // chargement des données du tutoriel
            this.title=jsonData.get("title").toString();
            this.description=jsonData.get("description").toString();
            if (jsonData.get("type").toString().equals("BIG")) {
                this.size=TutorialType.BIG;
                if (jsonData.containsKey("parts")) {
                    List parts=(ArrayList)jsonData.get("parts");
                    for (int i = 0; i < parts.size(); i++) {
                        Map p = (Map) parts.get(i);
                        Part part= new Part(p.get("pk").toString(), p.get("title").toString(), p.get("introduction").toString(), p.get("conclusion").toString());
                        if (p.containsKey("chapters")) {
                            List chapters=(ArrayList)p.get("chapters");
                            for (int j = 0; j < chapters.size(); j++) {
                                Map c = (Map) chapters.get(j);
                                Chapter chapter = new Chapter(c.get("pk").toString(), c.get("title").toString(), c.get("introduction").toString(), c.get("conclusion").toString());
                                if (c.containsKey("extracts")) {
                                    List extracts=(ArrayList)c.get("extracts");
                                    for (int k = 0; k < extracts.size(); k++)
                                    {
                                        Map extract = (Map) extracts.get(k);
                                        Extract ext = new Extract(extract.get("pk").toString(), extract.get("title").toString(), extract.get("text").toString());
                                        chapter.getExtracts().add(ext);
                                    }
                                }
                                part.getChapters().add(chapter);
                            }
                        }
                        getParts().add(part);
                    }
                }
            }
            if (jsonData.get("type").toString().equals("MINI")) {
                this.size=TutorialType.MINI;
                if (jsonData.containsKey("chapter")) {
                    Map chapter=(Map)jsonData.get("chapter");
                    Chapter c = new Chapter("", "", "", "");
                    if (chapter.containsKey("extracts")) {
                        List extracts=(ArrayList)chapter.get("extracts");
                        for (int i = 0; i < extracts.size(); i++)
                        {
                            Map extract = (Map) extracts.get(i);
                            Extract ext = new Extract(extract.get("pk").toString(), extract.get("title").toString(), extract.get("text").toString());
                            c.getExtracts().add(ext);
                        }
                    }
                    this.chapter=c;
                }
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tutorial{" + "path=" + path + ", title=" + title + ", description=" + description + ", size=" + size + ", parts=" + parts + ", chapter=" + chapter + '}';
    }

}
