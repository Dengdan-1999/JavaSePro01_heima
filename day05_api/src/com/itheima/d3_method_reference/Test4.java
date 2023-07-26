package com.itheima.d3_method_reference;

public class Test4 {
    public static void main(String[] args) {
        //目标：掌握构造器引用
//        Create c=new Create() {
//            @Override
//            public Car createCar(String name) {
//                return new Car(name);
//            }
//        };

        //简化版本1.0
        Create c=name->new Car(name);

        //简化版本2.0
        Create c2=Car::new;
        Car car=c2.createCar("凯迪拉克");
    }
}

interface Create{
    Car createCar(String name);
}

class Car{
    private String name;
    public Car(){

    }

    public Car(String name){
        this.name=name;
    }
}