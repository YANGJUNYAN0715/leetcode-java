package leetcode;

import java.util.Stack;

// 用栈实现队列
public class leetcode232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.peek());
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        System.out.println(myQueue.empty());
    }
}
class MyQueue {
    Stack<Integer> quePush;
    Stack<Integer> quePop;
    public MyQueue() {
        quePush = new Stack<>();
        quePop = new Stack<>();
    }

    public void push(int x) {
        quePush.push(x);
    }

    public int pop() {
        if (!quePush.empty()) {
            while (!quePush.empty()) {
                quePop.push(quePush.pop());
            }
        }
        return quePop.pop();
    }

    public int peek() {
        if(quePop.empty()){
            while(!quePush.empty()){
                quePop.push(quePush.pop());
            }
        }
        return quePop.peek();
    }

    public boolean empty() {
        return quePush.empty() && quePop.empty();
    }
}