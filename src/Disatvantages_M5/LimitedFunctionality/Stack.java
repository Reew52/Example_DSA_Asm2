/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.LimitedFunctionality;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> data;

    public Stack() {
        data = new ArrayList<Integer>();
    }

    public void push(int val) {
        data.add(val);
    }

    public void pop() {
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
