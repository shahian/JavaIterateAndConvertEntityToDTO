package com.shahian;



import java.time.LocalDate;

public class BookDTO {
    private Long id;
    private String name;
    private String authorName ;
    private LocalDate publishDate;

    public BookDTO() {
    }

    public BookDTO(Long id, String name, String authorName, LocalDate publishDate) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
    @Override
    public String toString(){
        return this.id +" " +this.name+" " +this.authorName+" " +this.publishDate;
    }

}
