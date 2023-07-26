package d11_genericity;

public class Test {
    public static void main(String[] args) {
        //目标：认识泛型方法
        Student[] students=new Student[10];
        printArray(students);

        String[] names={"张三","王五"};
        printArray(names);

    }

    /*
    需求：打印任意数组的内容
    收到什么类型的数组，就打印什么类型的数
     */
    public static <T,V> void printArray(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
