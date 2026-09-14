public class MissingAndDuplicate2 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] freq = new int[n*n+1];
        int[] res = new int[2];

        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                freq[grid[i][j]]++;
            }
        }

        for(int i =0;i<freq.length;i++){
            if(freq[i]==0)
                res[1]=i;
            if(freq[i]==2)
                res[0]=i;
        }

        return res;
    }
}
