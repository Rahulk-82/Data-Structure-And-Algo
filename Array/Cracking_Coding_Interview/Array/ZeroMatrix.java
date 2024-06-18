package Data_Structure.Array.Cracking_Coding_Interview.Array;

class ZeroMatrix{
    public static void main(String []args){
        int[][]matrix={{1,2,3},{1,6,6},{4,7,0}};
        int rows=matrix.length;
        int columns=matrix[0].length;
        boolean rowZero=false;
        boolean colZero=false;
        for(int col=0;col<columns;col++){
            if(matrix[0][col]==0){
                rowZero=true;
            }
        }
        for(int row=0;row<rows;row++){
            if(matrix[row][0]==0){
                colZero=true;
            }
        }
        for(int row=1;row<rows;row++){
            for(int col=1;col<columns;col++){
                if(matrix[row][col]==0){
                    matrix[row][0]=0;
                    matrix[0][col]=0;
                }
            }
        }
        for(int row=1;row<matrix.length;row++){
            if(matrix[row][0]==0) nullifyRow(matrix,row);
        }
        for(int col=1;col<matrix.length;col++){
            if(matrix[0][col]==0) nullifyCol(matrix,col);
        }
        if(rowZero) nullifyRow(matrix,0);
        if(colZero) nullifyCol(matrix,0);

        for(int row=0;row<rows;row++){
            for(int col=0;col<columns;col++){
                System.out.print(matrix[row][col]+",");
            }
            System.out.println();
        }

    }

    public static void nullifyRow(int [][]matrix,int rowIndex){
        for(int col=0;col<matrix[0].length;col++){
            matrix[rowIndex][col]=0;
        }
    }
    public static void nullifyCol(int [][]matrix,int colIndex){
        for(int row=0;row<matrix.length;row++){
            matrix[row][colIndex]=0;
        }
    }
}
