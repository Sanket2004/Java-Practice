package CP;

public class DiagonalOfMatrix {
    public static void printPrimaryDiagonalOfMatrix(int[][] matrix) {
        for (int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                if(i == j){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    public static void printSecondaryDiagonalOfMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i+j == matrix.length-1){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {

        int matrix [][] = {{1, 2, 3, 4},
                            {1, 2, 3, 4},
                            {1, 2, 3, 4},
                            {1, 2, 3, 4}};

        System.out.println("=======");
        for(int[] i: matrix){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("=======");

        printPrimaryDiagonalOfMatrix(matrix);
        System.out.println();
        printSecondaryDiagonalOfMatrix(matrix);
    }
}

