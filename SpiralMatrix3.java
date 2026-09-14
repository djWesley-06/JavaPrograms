public class SpiralMatrix3 {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int total = rows*cols;
        int[][] res = new int[total][2];
        res[0]=new int[]{rStart,cStart};

        int index = 1;

        if(total==1){
            return res;
        }
        int curRow = rStart;
        int curCol = cStart;
        for(int steps = 1;;steps+=2){
            int[][] directions = new int[][]{
                    {0,1,steps},
                    {1,0,steps},
                    {0,-1,steps+1},
                    {-1,0,steps+1}
            };

            for(int[] direction : directions){
                int dr = direction[0];
                int dc = direction[1];
                int step = direction[2];

                while(step>0){
                    curRow+=dr;
                    curCol+=dc;

                    if(curRow>=0 && curRow<rows && curCol>=0 && curCol<cols){
                        res[index] = new int[]{curRow,curCol};
                        index++;

                        if(index == total)
                            return res;
                    }

                   step--;

                }

            }

        }

    }
}
