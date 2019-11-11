package com.company;

import com.company.queue.MyQueue;
import com.company.stack.MyStack;

public class Main {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.enqueue(4);
        System.out.println(myQueue.dequeue());


    }
}
