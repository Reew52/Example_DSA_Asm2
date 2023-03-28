/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.ADTIncompatibility;

/**
 *
 * @author Dell
 */
import java.util.Deque;
import java.util.LinkedList;

public class ADTIncompatibility {
  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();

    deque.push(1);
    deque.push(2);
    deque.push(3);

    System.out.println(deque.pop()); // prints 3
  }
}
