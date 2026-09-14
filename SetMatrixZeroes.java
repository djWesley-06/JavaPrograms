import java.util.Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        int[] rows = new int[matrix.length];
        Arrays.fill(rows,-1);
        int[] cols = new int[matrix[0].length];
        Arrays.fill(cols,-1);

        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            if(rows[i]==1){
                Arrays.fill(matrix[i],0);
            }
            for(int j=0;j<matrix[0].length;j++){
                if(cols[j]==1 && matrix[i][j]!=0){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
