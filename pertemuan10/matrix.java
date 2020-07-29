/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author LENOVO
 */
public class matrix {

    public static void main(String[] args) {

        int matrixA[][] = {{1, 2, 3},
                            {5, 6, 7},
                            {9, 8, 4}};
        int matrixB[][] = {{3, 6, 4},
                            {8, 0, 5},
                            {2, 1, 7}};

        System.out.println("matrixA");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("matrixB");
        for (int k = 0; k < matrixB.length; k++) {
            for (int l = 0; l < matrixB[0].length; l++) {
                System.out.print(matrixB[k][l] + " ");
            }
            System.out.println();
        }
        
        int matrixC[][] = new int [matrixA.length][matrixB.length];
        System.out.println();
        System.out.println("hasil pengurangan");
        System.out.println();
        for (int m=0; m<matrixC.length; m++){
            for (int n=0; n<matrixC[0].length; n++){
                matrixC[m][n] = matrixA[m][n] - matrixB[m][n];
                System.out.print(matrixC[m][n] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("hasil penjumlahan");
        System.out.println();
        for (int m=0; m<matrixC.length; m++){
            for (int n=0; n<matrixC[0].length; n++){
                matrixC[m][n] = matrixA[m][n] + matrixB[m][n];
                System.out.print(matrixC[m][n] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("hasil perkalian");
        System.out.println();
        for (int m=0; m<matrixC.length; m++){
            for (int n=0; n<matrixC[0].length; n++){
                matrixC[m][n] = matrixA[m][n] * matrixB[m][n];
                System.out.print(matrixC[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
