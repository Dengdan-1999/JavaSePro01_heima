package com.itheima.d1_thread_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //目标：多线程的创建方式2：实现Runnable接口
//        Runnable r=new MyRunnable();
//        Thread t=new Thread(r);
//        t.start();

//
//        //利用匿名内部类对象创建线程
//        Thread t2=new Thread(new MyRunnable());
//        t2.start();
//        for(int i=0;i<9;i++){
//            System.out.println("t2线程在运行，输出："+i);
//        }

//        //继续简化
//        Thread t3=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++){
//                    System.out.println("t3线程在运行，输出："+i);
//                }
//            }
//        });
//        t3.start();

        //利用函数式接口，继续简化
        new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("子线程执行输出："+i);
            }
        }).start();


        for(int i=0;i<9;i++){
            System.out.println("主线程在运行，输出："+i);
        }




    }
}
