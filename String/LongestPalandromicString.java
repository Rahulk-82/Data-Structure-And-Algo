package Data_Structure.String;

public class LongestPalandromicString {
    public static void main(String []args){
        String s="babad";


        int n=s.length();
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        StringBuffer sb2;
        for(int i=0;i<n;i++){
            int length1=0;
            int left=i;
            int right=i;
            while(left>=0 && right<n){
                if(s.charAt(left)==s.charAt(right)){
                    if(s1.length()<=right-left+1){
                        length1=right-left+1;
                        s1=new StringBuffer(s.substring(left,right+1));

                    }
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }
            left=i;
            right=i+1;
            int length2=0;
            while(left>=0 && right<n){
                if(s.charAt(left)==s.charAt(right)){
                    if(s2.length()<=right-left+1){
                        length2=right-left+1;
                        s2=new StringBuffer(s.substring(left,right+1));

                    }
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }
        }
        if(s1.length()>s2.length()){
            System.out.println(s1.toString());
        }
        else{
            System.out.println(s2.toString());
        }
    }
}

