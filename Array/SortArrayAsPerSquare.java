package Data_Structure.Array;

public class SortArrayAsPerSquare {
    public static void main(String[]args){
        int []input={-4,-1,0,3,10};
        int n=input.length;
        int []result=new int[n];
        int left=0;
        int right=n-1;
        int end=n-1;
        while(left<=right){
            if(Math.abs(input[left])>Math.abs(input[right])){
                result[end]=input[left]*input[left];
                end--;
                left++;
            }
            else{
                result[end]=input[right]*input[right];
                right--;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+", ");
        }
    }
}
