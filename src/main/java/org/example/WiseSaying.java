package org.example;

public class WiseSaying {
    private long id;
    private String content;
    private String author;

    WiseSaying(long id, String author,String content){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public long getId(){
        return this.id;
    }
    public String getContent(){
        return this.content;
    }
    public String getAuthor(){
        return this.author;
    }

}
