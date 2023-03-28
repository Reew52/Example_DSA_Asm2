/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpaceComplexity;

/**
 *
 * @author Dell
 */
public class Example02_P7 {

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5000;
        long startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        int[][] result = generateMatrix(n);
        long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long usedMemory = endMemory - startMemory;
        System.out.println("Used memory: " + usedMemory + " bytes");
    }
}
