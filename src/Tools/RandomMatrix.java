package Tools;

import java.util.Random;

public class RandomMatrix {

    public int[][] GenSquareMatrix(int size){

        Random rand = new Random(System.nanoTime());

        int[][] matrix  = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int e = 0; e < size; e++){
                matrix[i][e] = rand.nextInt(9);
            }
        }

        return matrix;
    }

}
