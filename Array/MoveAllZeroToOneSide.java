package Data_Structure.Array;

public class MoveAllZeroToOneSide {
    public static void main(String[]args){
        int []input={2,3,0,7,5,0,0,4,6,0};
        int n=input.length;
        int count=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(input[i]>0){
                input[index]=input[i];
                index++;
            }
            else{
                count++;
            }
        }
        index=n-1;
        while(count!=0){
            input[index]=0;
            index--;
            count--;
        }
        for(int i=0;i<n;i++){
            System.out.print(input[i]+" , ");
        }

    }
}
