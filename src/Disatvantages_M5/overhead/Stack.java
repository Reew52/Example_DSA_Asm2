/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.overhead;

/**
 *
 * @author Dell
 */
import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> data;

    public Stack() {
        data = new LinkedList<Integer>();
    }
    public void push(int val) {
        data.add(val);
    }
    public void pop() {
        data.removeLast();
    }
    public int top() {
        return data.getLast();
    }
    public boolean empty() {
        return data.isEmpty();
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        for(int i = 0; i < 10000000; i++) {
            s.push(i);
        }

        while(!s.empty()) {
            s.pop();
        }
    }
}
