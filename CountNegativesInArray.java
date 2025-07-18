public class CountNegativesInArray {
    public int countNegatives(int[][] grid) {

        int r = 0;
        int c = grid[0].length-1;
        int hits = 0;
        while(r<grid.length && c >=0){
            if(grid[r][c]>=0)r++;
            else{
                hits+= grid.length - r;
                c--;
            }

        }
        return hits;

    }
}
