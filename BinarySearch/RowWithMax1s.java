package Data_Structure.BinarySearch;

public class RowWithMax1s {

    public static void main(String[]args){
        int [][]input={ { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 }
                      };
        int max1s=0;
        int numberofones=0;
        int n=input.length;
        int m=input[0].length;
        int indexoffirst1=-1;
        for(int i=0;i<n;i++){
            int low=0;
            int high=m-1;
            int mid=-1;
            while(low<=high){
                mid=low+(high-low)/2;
                if(  input[i][mid]==1 &&  (mid==0 || input[i][mid-1]==0)){
                    indexoffirst1=mid;
                    break;
                }
                else if(input[i][mid]==0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            numberofones=m-mid;

            max1s=Math.max(max1s,numberofones);
            numberofones=0;

        }
        System.out.println(max1s);
    }

}
