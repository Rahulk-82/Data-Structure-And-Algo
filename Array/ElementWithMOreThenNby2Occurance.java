package Data_Structure.Array;

// moore's voting algorithm.
// if a number is more then n/2 means other elements are  occure less then n/2 so if we go
// go through the array and maintain counter for elements then in end we will find the majority element.

public class ElementWithMOreThenNby2Occurance {

    public static void main(String[]args){
        int []input={7,2,5,7,3,7,7,4,7};
        int n=input.length;
        int count=0;
        int element=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count++;
                element=input[i];
            }
            else if(element==input[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(element==input[i]) count++;
        }
        int result=count>n/2? element:-1;
        System.out.println(result);

        //TC: O(3)*O(n); SC: O(1)

    }

}
