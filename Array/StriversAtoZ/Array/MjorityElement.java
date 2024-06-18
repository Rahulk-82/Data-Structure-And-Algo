package Data_Structure.Array.StriversAtoZ.Array;

public class MjorityElement {

    public static void main(String [] args){
        int [] array={1,2,3,4,4,3,2,2,2,3,3,3,3,3,3,3,3,3,3};
        int counter=0;
        int element=0;
        for(int i=0;i<array.length;i++){
            if(counter==0){
                counter=1;
                element=array[i];
            }
            else if(element==array[i]) counter++;
            else counter--;
        }
        counter=0;
        for(int i=0;i<array.length;i++){
            if(element==array[i]) counter++;
        }
        System.out.println((counter>array.length/2)?element:-1);

    }
}
