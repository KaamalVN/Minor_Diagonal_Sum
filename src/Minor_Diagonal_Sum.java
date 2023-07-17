import java.util.Scanner;

public class Minor_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(diagonal_sum(matrix));
    }

    static int diagonal_sum(int[][] matrix) {
        int sum=0;
        int i=0 , j=matrix.length-1;
        while(i< matrix.length && j>=0){
            sum+=matrix[i][j];
            //System.out.println(matrix[i][j]);
            i++;
            j--;
        }
        return sum;
    }
}
