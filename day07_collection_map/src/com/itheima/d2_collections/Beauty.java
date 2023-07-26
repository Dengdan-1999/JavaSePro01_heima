package com.itheima.d2_collections;

import java.util.Comparator;

public class Beauty implements Comparable<Beauty> {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private String name;
    private int age;
    private double height;

    public Beauty(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Beauty b){
        if(this.height>b.height){
            return -1;
        }
        else if(this.height<b.height){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.name+", age="+this.age+", height="+this.height;
    }
}
