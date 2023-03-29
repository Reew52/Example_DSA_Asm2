/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.LackOfTypeSafety;

/**
 *
 * @author Dell
 */
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push("Hello");
        Integer num = (Integer) myStack.pop(); // runtime error: ClassCastException
    }
}
