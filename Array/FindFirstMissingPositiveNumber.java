package Data_Structure.Array;

public class FindFirstMissingPositiveNumber {
    public static void main(String[]args){
        int [] input={1, 3,4, 7, 6, 8, -1, -10, 15};
        int n=input.length;
        int positveIndex=0;

        // code to move all values to
        for(int i=0;i<n;i++){
            if(input[i]>0){
                input[positveIndex]=input[i];
                positveIndex++;
            }
        }
        positveIndex=positveIndex-1;
        for(int i=0;i<=positveIndex;i++){
            int index=Math.abs(input[i])-1;
            if(index<positveIndex){
                input[index]=-input[index];
            }
        }
        for(int i=0;i<n;i++){
            if(input[i]>0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
