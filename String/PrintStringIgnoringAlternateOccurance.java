package Data_Structure.String;

public class PrintStringIgnoringAlternateOccurance {
    public static void main(String [] args){
        String s1="It is a long day Dear";
        String s=s1.toLowerCase();
        int n=s.length();
        int []frequency=new int[122];
        for(int i=0;i<n;i++){
            char temp=s.charAt(i);
            frequency[temp]++;
            if(frequency[temp]%2==1){
                System.out.print(s1.charAt(i));
            }
        }
    }

}
