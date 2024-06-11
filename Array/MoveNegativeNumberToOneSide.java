package Data_Structure.Array;

// There are 4 possible combination:
// - * -  ; left ++
// + * +  ; right --
// - * +  ; right -- , left ++
// + * -  ; swap, left ++, right --;

public class MoveNegativeNumberToOneSide {
    public static void main(String []args){
        int[]input={1,4,-9,-6,7,8,-1,-10};
        int n=input.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(input[left]>0 && input[right]<0){
                swap(input,left,right);
                left++;
                right--;
            }
            else if(input[left]>0 && input[right]>0){
                right--;
            }
            else if( input[left]<0 && input[right]<0){
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(input[i]);
        }

    }
    public static void swap(int[] array ,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
