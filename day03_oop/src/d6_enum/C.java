package d6_enum;

public enum C {
    X(){
        @Override
        public void go(){
            System.out.println("测试枚举单例设计模式~~");
        }
    };
    public abstract void go();
}
