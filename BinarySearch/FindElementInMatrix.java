package Data_Structure.BinarySearch;

public class FindElementInMatrix {
    public static void main(String []args){
        int[][] matrix=new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int N=6;
        System.out.println(searchInMatrix(matrix,N));
    }
    static boolean searchInMatrix(int[][]matrix,int N){
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0;
        int r=row*col-1;
        while(l<=r){  // condition is l<=r
            int mid=l+(r-l)/2;   // mid for all binary search
            if(matrix[mid/col][mid%col]==N){
                return true;
            }
            else if(matrix[mid/col][mid%col]<N){  //devide by col
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;

    }
}
