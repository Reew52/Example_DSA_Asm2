/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.PerformanceLimitations;

/**
 *
 * @author Dell
 */
import java.util.HashSet;
import java.util.Set;

public class ADTPerformanceLimitations {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    int numElements = 1000000;

    long startTime = System.nanoTime();
    for (int i = 0; i < numElements; i++) {
      set.add(i);
    }
    long endTime = System.nanoTime();

    long timeTaken = endTime - startTime;
    System.out.println("Time taken to add " + numElements + " elements to HashSet: " + timeTaken);

    startTime = System.nanoTime();
    boolean contains = set.contains(numElements / 2);
    endTime = System.nanoTime();

    timeTaken = endTime - startTime;
    System.out.println("Time taken to check if HashSet contains an element: " + timeTaken);
  }
}
