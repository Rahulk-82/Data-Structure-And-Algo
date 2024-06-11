package Data_Structure.Array;

public class NextPermutation {
    public static void main(String[]args){
        int []input={3, 2, 1};
        int n=input.length;
        int [] result=nextPermutation(input);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+", ");
        }
    }
    public static int[] nextPermutation(int[] input){
        int n=input.length;
        if(n<=1) return new int[]{};
        int i=n-2,j=n-1;
        while(i>=0 && input[i]>input[j]){
            i--;
            j--;
        }
        if(i>=0){
            j=n-1;
            while(input[i]>=input[j]){
                j--;
            }
            swap(input,i,j);
        }
        return reverse(input,i+1,n-1);
    }
    public static void swap(int []array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static int[] reverse(int []a,int i,int j){
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }

}
