/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpaceComplexity;

/**
 *
 * @author Dell
 */
public class Example01_P7 {

    public static int[] doubleArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[19999999];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        int[] result = doubleArray(arr);
        long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long usedMemory = endMemory - startMemory;
        System.out.println("Used memory: " + usedMemory + " bytes");
    }
}
