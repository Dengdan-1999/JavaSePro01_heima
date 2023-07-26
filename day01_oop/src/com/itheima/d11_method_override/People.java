package com.itheima.d11_method_override;

public class People {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public long getWealth() {
        return wealth;
    }

    public void setWealth(long wealth) {
        this.wealth = wealth;
    }

    public long wealth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;

    @Override
    public String toString(){
        return this.name+", "+this.age+",财富有："+this.wealth+"元/人民币";
    }
}
