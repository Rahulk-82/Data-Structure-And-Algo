package Data_Structure.Array.StriversAtoZ;

public class FindPlandrom {
    public static void main(String []args){
        int n=120219;
        int p=n;
        int result=0;
        while(n>0){
            int temp=n%10;
            result=result*10+temp;
            n/=10;
        }
        if(p==result){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
