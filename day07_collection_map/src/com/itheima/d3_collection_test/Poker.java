package com.itheima.d3_collection_test;

//public class Poker implements Comparable{
public class Poker{
    private String color;  //花色
    private String size;    //点数

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;      //大小


    public Poker(String color, String size, int value) {
        this.color = color;
        this.size = size;
        this.value = value;
    }

    @Override
    public String toString(){
        return this.color+this.size;
    }

//    @Override
    public int compareTo(Poker o){
       if (this.value-o.getValue()>0){
           return 1;
       }
       else if(this.value-o.getValue()<0){
           return -1;
       }
       return 0;
    }

}
