package d1_stringbuilder;

public class RuntimeTest {
    public static void main(String[] args) {
        //1.public static Runtime getRuntime()返回与当前java应用程序关联的运行时对象
        Runtime jre=Runtime.getRuntime();

        //2.public void exit(int status) 终止当前运行的虚拟机，把参数用作状态代码；按照惯例，非零状态
        //jre.exit(0);

        //3.public int availableProcessors():获取虚拟机能够使用的处理器数
        System.out.println("处理器数量："+jre.availableProcessors());

        //4.public long totalMemory() 返回java虚拟机中的内存总量，字节数
        System.out.println("java虚拟机中的内存总数:"+jre.totalMemory()/1024.0/1024.0+"MB");

        //5.public long freeMemory()返回java虚拟机中的可用内存量
        System.out.println("java虚拟机中的可用内存量："+jre.freeMemory()/1024.0/1024.0+"MB");

    }
}
