package org.example.bai11_DSA_Stack_Queue.thuc_hanh.StackInLinkedList;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }
}
