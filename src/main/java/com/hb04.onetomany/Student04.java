package com.hb04.onetomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student04 {
    @Id
    private int id;
    // length:max karakter say�s�n�
    // nullable: ilgili kolonun null olup olmayaca��n� belirler. true yada false
    // olabilir
    // unique: Unique olmas� istenen alanlar bu attribute ile belirlenir. true ya da
    // false olabilir.
    // updatable: update edilebilir �ekilde yarlamak i�in kullan�l�r.true yada false
    // alabilir. Default true
    // insertable: buras�da insert edilebilir de�er yarlanabilir. true yada false
    // alabilir. Default true
    @Column(name = "std_name", length = 100, nullable = false, unique = true)
    private String name;
    private int grade;
    
    @OneToMany(mappedBy="student")
    private List<Book04> bookList = new ArrayList<>();
    
    
    
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
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public List<Book04> getBookList() {
        return bookList;
    }
    public void setBookList(List<Book04> bookList) {
        this.bookList = bookList;
    }
    @Override
    public String toString() {
        return "Student04 [id=" + id + ", name=" + name + ", grade=" + grade + ", bookList=" + bookList + "]";
    }
    
    
    
}
