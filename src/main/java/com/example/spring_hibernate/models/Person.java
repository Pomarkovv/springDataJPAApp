package com.example.spring_hibernate.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "birth_year")
    private int birthYear;

    @OneToMany(mappedBy = "owner")
    private List<Book> books;


    public Person() {

    }

    public Person(String name, int birthYear, List<Book> books) {
        this.name = name;
        this.birthYear = birthYear;
        this.books = books;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Book> getBooks(){
        return books;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth_year=" + birthYear +
                '}';
    }
}
