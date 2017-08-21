import java.util.Arrays;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex13_Matrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    matrix[1][1] = 1;
    matrix[2][2] = 1;
    matrix[3][3] = 1;
    matrix[3][3] = 1;

    printer(matrix);
  }
  public static void printer (int[][] array){
    for (int[] x : array){
      for (int y : x){
        System.out.print(y + " ");
      }
      System.out.println();
    }
  }
  
  public static void printer2 (int[][] array){
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[0].length; j++){
        if (i == j){
          array[i][j] = 1;
          System.out.print(array[i][j]);
        }
        else{
          array[i][j] = 0;
          System.out.print(array[i][j]);
        }
      }
    }
      
  }
}

