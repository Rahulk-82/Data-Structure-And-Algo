package Data_Structure.Array.StriversAtoZ.Array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RearrangeElementsBySign{


    public static void main(String []args){
        int [] input={1,2,-4,-5,3,3,4,-2,-8,-9};
        int n=input.length;
        varityOneMethod(input,n);
        // case -2
        int [] input1={1,2,-3,-1,2,-3,2,6,8,3,9};
        int n1=input1.length;
        varityTwo(input1,n1);

    }

    //Input:
//arr[] = {1,2,-4,-5}, N = 4
//Output: 1 -4 2 -5
    // When both positive and negative number count are same
    public static void varityOneMethod(int[]input,int n){
        List<Integer> ans=new ArrayList<>(Collections.nCopies(n,0));
        int posindex=0;
        int negindex=1;
        for(int i=0;i<n;i++){
            if(input[i]<0){
                ans.set(negindex,input[i]);
                negindex+=2;
            }
            else{
                ans.set(posindex,input[i]);
                posindex+=2;
            }
        }
        System.out.println("varityOne output : "+ans.toString());

    }

    //varity 2: number of positive and negative number are not same. and need to maintain relative order of the elements.
    // In such case
    public static void varityTwo(int [] input,int n){
            List<Integer> pos=new ArrayList<>();
            List<Integer> neg=new ArrayList<>();
            List<Integer> ans=new ArrayList<>(Collections.nCopies(n,0));

            for(int i=0;i<n;i++){
                if(input[i]<0){
                    neg.add(input[i]);
                }
                else{
                    pos.add(input[i]);
                }
            }
            if(pos.size()<neg.size()){
                for(int i=0;i<pos.size();i++){
                    ans.set(2*i,pos.get(i));
                    ans.set(2*i+1,neg.get(i));
                }
                int index=pos.size()*2;
                for(int i=pos.size();i<neg.size();i++){
                    ans.set(index,neg.get(i));
                    index++;
                }
            }
            else{
                for(int i=0;i<neg.size();i++){
                    ans.set(2*i,pos.get(i));
                    ans.set(2*i+1,neg.get(i));
                }
                int index=neg.size()*2;
                for(int i=neg.size();i<pos.size();i++){
                    ans.set(index,pos.get(i));
                    index++;
                }
            }
            System.out.println(ans.toString());
        }
}

