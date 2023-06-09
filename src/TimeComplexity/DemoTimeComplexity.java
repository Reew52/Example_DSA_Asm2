/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimeComplexity;

/**
 *
 * @author Dell
 */
 
class DemoTimeComplexity{
 
// Function to find a pair in the given
// array whose sum is equal to z
    static boolean findPair(int a[], int n, int z) {

        // Iterate through all the pairs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) // Check if the sum of the pair
            // (a[i], a[j]) is equal to z
            {
                if (i != j && a[i] + a[j] == z) {
                    return true;
                }
            }
        }

        return false;
    }

// Driver code
    public static void main(String[] args) {

        // Given Input
        int a[] = {1, -2, 1, 0, 5};
        int z = 0;
        int n = a.length;

        // Function Call
        if (findPair(a, n, z)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        
    }

    public int addScalar(int A, int B) {
        int C = A + B;
        return C;
    }

    
}
