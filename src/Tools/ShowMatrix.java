package Tools;

public class ShowMatrix {

    public void ShowSquareMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
           for(int e = 0; e < matrix.length; e++){
               System.out.print("["+matrix[i][e]+"] ");
           }
           System.out.print("\n");
        }

    }

}
