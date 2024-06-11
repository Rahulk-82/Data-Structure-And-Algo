package Data_Structure.MinimumStepProblems;

//Algo:
// trace all zero with zero_count;
// first find the index of first odd number and also count number of zeros with it.
//if zero_count==n then means array is zero, so we can return result;
// if all elements all even then divide them by 2 and increment result by 1;
//now for all odd number subtract by 1 and increment result for each subtraction.


public class CountMinStepToGenerateArrayFromZeroArray {
    public static void main(String[]args){
        int []input={3,5};
        System.out.println(minStep(input));
    }
    public static int minStep(int [] input){
        int result=0;
        int n=input.length;
        while(true){
            int zero_count=0;
            int i;
            // index of first odd number
            for( i=0;i<n;i++){
                if(input[i]%2==1){
                    break;
                }
                else if(input[i]==0){
                    zero_count++;
                }
            }
            //if zero count is n then whole array is converted to 0 so return it
            if(zero_count==n){
                return result;
            }
            // if all elements are even then devide them by one;
            if(i==n){
                for(int j=0;j<n;j++){
                    input[j]/=2;
                }
                result++;
            }
            for(int j=i;j<n;j++){
                if(input[i]%2==1){
                    input[i]--;
                    result++;
                }
            }
        }

    }


}
