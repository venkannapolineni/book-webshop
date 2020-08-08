package com.hackathon.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

//title, author, subject_category, isbn, rack_number, availability
@Entity
@Table(name = "book")
public class Book implements java.io.Serializable {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTitle() {
        return title;
    }

    public void setTitle(long title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRack_number() {
        return rack_number;
    }

    public void setRack_number(int rack_number) {
        this.rack_number = rack_number;
    }

    public String getSubject_category() {
        return subject_category;
    }

    public void setSubject_category(String subject_category) {
        this.subject_category = subject_category;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "title", nullable = false)
    private long title;

    @NotNull
    @Column(name = "author")
    private String author;

    @NotNull
    @Column(name = "rack_number")
    private int rack_number;

    @NotNull
    @JoinColumn(name = "subject_category")
    private String subject_category;

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    @NotNull
    @OneToMany(targetEntity = com.hackathon.model.Order.class)
    @JoinColumn(name = "id", nullable = false)
    private String Order;

    public Book(long id, long title, String author, int rack_number, String subject_category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rack_number = rack_number;
        this.subject_category = subject_category;
    }

    public Book() {

    }
}
