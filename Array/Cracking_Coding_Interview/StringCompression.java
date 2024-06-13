package Data_Structure.Array.Cracking_Coding_Interview;

class StringCompression{

    public static void main(String []args){

        String str="aaabbbbcddee";
        int counter=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            counter++;
            if(i+1>=str.length() || str.charAt(i)<str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(counter);
                counter=0;
            }
        }
        System.out.println(sb.toString());

    }

}
