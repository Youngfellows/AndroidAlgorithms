package com.papaya.algorithms.list;

/**
 * 自己实现线性表之栈
 * 栈是限定仅允许在表的同一端（通常为“表尾”）进行插入或删除操作的线性表。
 * 允许插入和删除的一端称为栈顶(top)，另一端称为栈底(base)
 * <p>
 * 特点：后进先出 (LIFO)或，先进后出（FILO）
 * 因为栈是限定线的线性表，所以，我们可以调用前面两种线性表，只需要对出栈和入栈操作进行设定即可
 */
public class ArrayStack<E> {
    int size = 0;
    private ArrayList<E> list = new ArrayList<E>();//用来保存数据线性表<br>    private  int size;//表示当前栈元素个数

    /**
     * 入栈操作
     *
     * @param e
     */
    public void push(E e) {
        list.add(e);
        size++;
    }

    /**
     * 出栈操作
     *
     * @return
     */
    public E pop() {
        E e = list.get(size - 1);
        size--;
        return e;
    }

    /**
     * 获取栈长度
     *
     * @return
     */
    public int size() {
        return size;
    }

}
