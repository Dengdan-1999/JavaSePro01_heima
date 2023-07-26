package com.itheima.d6_set;

import java.util.Objects;

public class Student {

    private String name;
    private int id;
    private int score;

    public Student() {
    }

    public Student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //重写该方法，只要两个对象内容一样就返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name == student.name && id == student.id && score == student.score;
    }

    //重写该方法，使得只要两个对象内容一样，返回的哈希值就也一样
    @Override
    public int hashCode(){
        return Objects.hash(name,id,score);
    }

    @Override
    public String toString(){
        return "Student{"+"name="+name+", id="+id+", score="+score+"\n";
    }

}
