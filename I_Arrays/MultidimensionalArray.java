package I_Arrays;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] array2D = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        //2D   { {1D},    {1D},      {1D}   }
        System.out.println("For each");
        for (int[] element2D : array2D) {
            System.out.print(Arrays.toString(element2D));
        }
        System.out.println();
        System.out.println("For i loop");
        for (int i = 0; i < array2D.length; i++) {
            System.out.print(Arrays.toString(array2D[i]));
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");

        int[][][] array3D = {{{1, 2}, {3, 4, 5}, {6}}, {{7, 8}, {9, 10, 11}, {12}}};
        //               3D {    { 2D{1D} ,  {1D} ,{1D}},2D{ {1D},   {1D} ,  {1D} }  }
        //printing
        System.out.println("For each");
        for (int[][] array_2D : array3D) {
            for (int[] element2D : array_2D) {
                System.out.print(Arrays.toString(element2D));
            }
        }
        System.out.println();
        System.out.println("Deep String: " + Arrays.deepToString(array3D));



    }
}

