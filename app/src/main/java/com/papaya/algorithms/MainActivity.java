package com.papaya.algorithms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.papaya.algorithms.list.ArrayList;
import com.papaya.algorithms.list.LinkedList;
import com.papaya.algorithms.list2.Array;
import com.papaya.algorithms.list2.Stack;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 对比线性表和链式表
     * 前面已经说过顺序表和链式表各自的特点，这里在重申一遍
     * <p>
     * 数组操作优点：
     * 1.通过指针快速定位到下标，查询快速
     * <p>
     * 数组操作缺点：
     * 1.数组声明时即需要确定数组大小。当操作中超过容量时，则需要重新声明数组，并且复制当前所有数据
     * <p>
     * 2.当需要在中间进行插入或者删除时，则需要移动大量元素（size-index个）
     * <p>
     * 链表操作优点：
     * 1.因为每个结点记录下个结点的引用，则在进行插入和删除操作时，只需要改变对应下标下结点的引用即可
     * <p>
     * 链表操作缺点：
     * 1.要得到某个下标的数据，不能通过下标直接得到，需要遍历整个链表。
     * <p>
     * 现在，我们通过进行增删改查操作来感受一次其效率的差异
     * <p>
     * 思路：通过两个表，各进行大数据量操作（3W）条数据的操作，记录操作前系统时间，操作后系统时间，得出操作时间
     */

    /**
     * 测试数据结构
     *
     * @param view
     */
    public void testDataStructure(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //测试自己实现的ArrayList类和Linkedlist类添加30000个数据所需要的时间
                ArrayList<String> al = new ArrayList<String>();
                LinkedList<String> ll = new LinkedList<String>();
                Long aBeginTime = System.currentTimeMillis();//记录BeginTime
                for (int i = 0; i < 30000; i++) {
                    al.add("now" + i);
                }
                Long aEndTime = System.currentTimeMillis();//记录EndTime
                Log.i(TAG, "arrylist  add time--->" + (aEndTime - aBeginTime));
                Long lBeginTime = System.currentTimeMillis();//记录BeginTime
                for (int i = 0; i < 30000; i++) {
                    ll.add("now" + i);
                }
                Long lEndTime = System.currentTimeMillis();//记录EndTime
                Log.i(TAG, "linkedList add time---->" + (lEndTime - lBeginTime));

                //测试JDK提供的ArrayList类和LinkedList类添加30000个数据所需要的世界
                java.util.ArrayList<String> sal = new java.util.ArrayList<String>();
                java.util.LinkedList<String> sll = new java.util.LinkedList<String>();
                Long saBeginTime = System.currentTimeMillis();//记录BeginTime
                for (int i = 0; i < 30000; i++) {
                    sal.add("now" + i);
                }
                Long saEndTime = System.currentTimeMillis();//记录EndTime
                Log.i(TAG, "JDK arrylist  add time--->" + (saEndTime - saBeginTime));
                Long slBeginTime = System.currentTimeMillis();//记录BeginTime
                for (int i = 0; i < 30000; i++) {
                    sll.add("now" + i);
                }
                Long slEndTime = System.currentTimeMillis();//记录EndTime
                Log.i(TAG, "JDK linkedList add time---->" + (slEndTime - slBeginTime));
            }
        }).start();
    }

    /**
     * 测试数组
     *
     * @param view
     */
    public void testArray(View view) {
        Array array = new Array(10);
        array.add(6);
        array.add(3);
        array.add(8);
        array.add(2);
        array.add(11);
        array.add(5);
        array.add(7);
        array.add(4);
        array.add(9);
        array.add(10);

//        array.bubbleSort();
//        array.selectSort();
        array.insertSort();
//        array.display();
//        System.out.println(array.find(4));
//        System.out.println(array.delete(1));
//        array.display();
//        System.out.println(array.update(2,6));
//        array.display();
    }

    /**
     * 栈
     *
     * @param view
     */
    public void testStack(View view) {

//        Stack stack = new Stack(1);
//        stack.objPush("abc");
//        stack.objPush(123);
//        stack.objPush("de");
//        stack.objPush("cd");
//        stack.objPush("er");
//        stack.objPush("hello");
//        stack.objPush(666);
//        stack.objPush(545);
//        stack.objPush("word");
//
//        Log.i(TAG, "查找栈顶: " + stack.peekTop() + "");
//        while (stack.top() != -1) {
//            Log.i(TAG, "弹出: " + stack.objPop() + "");
//        }
//        Log.i(TAG, stack + "");

        Stack stack = new Stack();
        stack.nodePush("111");
        stack.nodePush("222");
        stack.nodePush("aaa");
        stack.nodePush("bbb");
        Log.i(TAG, stack + "");

        while (stack.size() >= 1) {
            Log.i(TAG, "stack.size(): " + stack.size() + " ,弹出: " + stack.nodePop() + "");
        }
        Log.i(TAG, stack + "");
    }
}
