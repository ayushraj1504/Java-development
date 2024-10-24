package MyJava_udemy.Array_practice;
// no of row and no of column of A is must be equal to no of row and no of column of B
// then only addition is possible

public class array_2d_addition {
    public static void main(String[] args) {
        int[][] A = {{2, 3, 4}, {5, 6, 7}, {9, 5, 2}};
        int[][] B = {{5, 6, 7}, {1, 2, 2}, {3, 6, 9}};
        int[][] C = new int[3][3];
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}