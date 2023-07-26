package com.itheima.d3_collection_test;

public class Card {
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Card(int index, String color, String size) {
        this.index = index;
        this.color = color;
        this.size = size;
    }

    private int index;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String color;
    private String size;
    public Card(){

    }
    public Card(String color,String size){
        this.color=color;
        this.size=size;
    }
}
