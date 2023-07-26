package com.itheima.d4_collection_travesal;

import java.util.LinkedList;

public class ListTest4 {
    public static void main(String[] args) {
        //目标：掌握LinkedList的应用
        //1.做队列
        LinkedList<String> queue=new LinkedList<>();
        queue.addFirst("第1个人");
        queue.addFirst("第2个人");
        queue.addFirst("第3个人");
        queue.addFirst("第4个人");
        queue.addFirst("第5个人");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //2.做栈：后进先出
        LinkedList<String> stack=new LinkedList<>();
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        stack.addFirst("第5颗子弹");
        System.out.println(stack);

        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        System.out.println(stack);

        stack.push("第6颗子弹");
        stack.push("第7颗子弹");
        stack.push("第8颗子弹");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


    }
}
