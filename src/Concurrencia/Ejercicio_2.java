package Concurrencia;
import Tools.Determinantes;
import Tools.RandomMatrix;
import Tools.ShowMatrix;

import java.util.Random;

public class Ejercicio_2 implements  Runnable{

    Determinantes determinante = new Determinantes();

    int n;
    int [][] matrix_1 = new int[n][n];


    public Ejercicio_2(int[][]matrix_1, int n){
        this.matrix_1 = matrix_1;
        this.n = n;
    }

    static int det;

    @Override
    public void run() {


        det = determinante.determinante(matrix_1);


    }

    public static void main(String args[]){

        RandomMatrix genMatrix = new RandomMatrix();
        Random rand = new Random(System.nanoTime());
        int n = rand.nextInt(10);

        int[][] matrix = genMatrix.GenSquareMatrix(n);

        Runnable runnable = new Ejercicio_2(matrix,n);
        Thread h1 = new Thread(runnable);
        h1.start();

        ShowMatrix show = new ShowMatrix();
        show.ShowSquareMatrix(matrix);

        try{
            h1.join();
        }catch (Exception ex){}

        System.out.println("\nEl determinante de la matriz es: "+det);

    }
}
