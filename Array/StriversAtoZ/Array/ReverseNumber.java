package Data_Structure.Array.StriversAtoZ.Array;

// extract last digit and then add the number to multiply of 10 with number.

public class ReverseNumber {
    public static void main(String []args){
        int number=10839300;
        int result=0;
        while(number>0){
            int temp=number%10;
            result=result*10+temp;
            number/=10;
        }
        System.out.println(result);

    }
}
