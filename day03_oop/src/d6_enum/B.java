package d6_enum;

public enum B {
    //枚举中的每个常量记住的都是枚举类的一个对象
    X(){
        @Override
        public void go(){

        }
    },Y(){
        @Override
        public void go(){

        }
    };
    public abstract void go();
}
