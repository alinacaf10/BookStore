package com.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @ManyToMany
    private Set<Book> books;

    public Student() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Set<Book> getBooks() {
        return books;
    }



    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
