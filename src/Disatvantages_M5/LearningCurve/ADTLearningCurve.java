/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.LearningCurve;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ADTLearningCurve {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    int numElements = 100000;

    long arrayListStartTime = System.nanoTime();
    for (int i = 0; i < numElements; i++) {
      arrayList.add(i);
    }
    long arrayListEndTime = System.nanoTime();

    long linkedListStartTime = System.nanoTime();
    for (int i = 0; i < numElements; i++) {
      linkedList.add(i);
    }
    long linkedListEndTime = System.nanoTime();

    long arrayListTime = arrayListEndTime - arrayListStartTime;
    long linkedListTime = linkedListEndTime - linkedListStartTime;

    System.out.println("Time taken to add " + numElements + " elements to ArrayList: " + arrayListTime);
    System.out.println("Time taken to add " + numElements + " elements to LinkedList: " + linkedListTime);
  }
}
