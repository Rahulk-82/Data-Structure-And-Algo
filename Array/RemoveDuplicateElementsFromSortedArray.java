package Data_Structure.Array;

public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String [] args){
        int [] input={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n=input.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(input[i]!=input[i+1]){
                input[c]=input[i];
                c++;
            }
        }
        input[c]=input[n-1];
        c++;
        for(int i=0;i<c;i++){
            System.out.println(input[i]);
        }

    }
}
