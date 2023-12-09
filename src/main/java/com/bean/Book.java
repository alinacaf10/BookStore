package com.bean;

import javax.persistence.*;
import java.util.Set;
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="authorId")
    private int authorId;
    private Set<Student> student;




    public Book() {
    }

    public Book(int id, String name, int authorId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Set<Student> getStudent() {
        return student;
    }
    public void setStudent(Set<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                ", student=" + student +
                '}';
    }
}
