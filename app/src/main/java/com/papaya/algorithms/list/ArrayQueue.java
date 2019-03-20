package com.papaya.algorithms.list;

/**
 * 自己实现线性表之队列
 * 与栈类似
 * 队列是只允许在表的一端进行插入，而在另一端删除元素的线性表。
 * 在队列中，允许插入的一端叫队尾（rear），允许删除的一端称为队头(front)。
 * 特点：先进先出 (FIFO)、后进后出 (LILO)
 * 同理，我们也可以调用前面两种线性表，只需要对队列的入队和出队方式进行处理即可
 */

public class ArrayQueue<E> {
    private ArrayList<E> list = new ArrayList<E>();// 用来保存数据的队列
    private int size;// 表示当前栈元素个数

    /**
     * 入队
     *
     * @param e
     */
    public void EnQueue(E e) {
        list.add(e);
        size++;
    }

    /**
     * 出队
     *
     * @return
     */
    public E DeQueue() {
        if (size > 0) {
            E e = list.get(0);
            list.delete(0);
            size--;
            return e;
        } else {
            throw new RuntimeException("已经到达队列顶部");
        }
    }
}
