package Tools;

import java.util.Scanner;

 public class Determinantes {

    static Scanner in = new Scanner(System.in);

    public static int determinante(int matriz[][]) {

        int n = matriz.length;

        int determinante = 0;


        if(n == 1) {
            determinante = matriz[0][0];
        }else if(n == 2) {
            determinante = matriz[0][0] *  matriz[1][1] -  matriz[0][1] *  matriz[1][0];
        }else {

            for(int i = 0; i < n; i++) {
                int submatriz[][] = generar_submatriz(matriz, 0, i);
                determinante += Math.pow(-1, i) * matriz[0][i] * determinante(submatriz);
            }

        }

        return determinante;
    }

    public static int[][] generar_submatriz(int[][] matriz, int filaEliminada, int columnaEliminada) {

        int n = matriz.length;
        int fila_destino = 0;
        int columna_destino;
        int submatriz[][] = new int[n-1][n-1];

        for(int fila = 0; fila < n; fila++) {
            if(fila != filaEliminada) {
                columna_destino = 0;
                for(int columna = 0; columna < n; columna++) {
                    if(columna != columnaEliminada) {
                        submatriz[fila_destino][columna_destino] = matriz[fila][columna];
                        columna_destino++;
                    }
                }
                fila_destino++;
            }
        }

        return submatriz;
    }
}
