package ex05;

import java.util.List;

public class CD {

    private String title;
    private String publisher;
    private List<String> songs;
    
    
    public String getTitle() {
      
        return title;
    }
    public void setTitle(String title) {
        System.out.println("setTitle() 호출됨!");
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        System.out.println("setPublisher() 호출됨!");
        this.publisher = publisher;
    }
    public List<String> getSongs() {
        return songs;
    }
    public void setSongs(List<String> songs) {
        System.out.println("setSongs() 호출됨!");
        this.songs = songs;
    }
    
    @Override
    public String toString() {
        return "CD [title=" + title + ", publisher=" + publisher + ", songs=" + songs + "]";
    }
     
    
    
 
    
}
