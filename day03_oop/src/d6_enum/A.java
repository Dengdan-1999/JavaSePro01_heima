package d6_enum;

public enum A {
    //注意：枚举类的第一行必须罗列的是枚举对象的名字，
    //枚举类是一种特殊的类
    X,Y,Z;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
