package com.papaya.algorithms.list2;


import android.util.Log;

/**
 * 双端链表
 */
public class LinkedList {
    private String TAG = LinkedList.class.getName();
    /***
     * 链表通常由一连串节点组成，每个节点包含任意的实例数据（data fields）和一或两个用来指向上一个/或下一个节点的位置的链接（"links"）
     */
    private Node head; //链表头
    private Node tail; //链表尾
    private int size; //节点数

    /**
     * 双端链表
     */
    public class Node {
        private Object data;
        private Node prev; //上一个
        private Node next; //下一个

        public Node(Object data) {
            this.data = data;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * 向链表头添加数据
     *
     * @param object
     */
    public void addHead(Object object) {
        Node node = new Node(object);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
            size++;
        }
    }

    /**
     * 删除头
     */
    public void deleteHead() {
        //头部指向下一个，prev值为null则说明是链表的头部
        if (size != 0) {
            head.prev = null;
            head = head.next;
            size--;
        }
    }


    /**
     * 向链表尾添加数据
     *
     * @param object
     */
    public void addTail(Object object) {
        Node node = new Node(object);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    /**
     * 删除尾部
     */
    public void deleteTail() {
        //尾部指向上一个，next值为null则说明是链表的尾部
        if (size != 0) {
            tail.next = null;
            tail = tail.prev;
            size--;
        }
    }

    /**
     * 显示数据
     */
    public void display() {
        Node node = head;
        Log.d(TAG, "--------display----------");
        int temSize = size;
        while (temSize > 0) {
            Log.i(TAG, "[" + node.data + "->");
            node = node.next;
            temSize--;
        }
    }

}
