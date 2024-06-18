package Data_Structure.Array.Cracking_Coding_Interview.Array;

class IsUnique{
	public static void main(String []args){
		String str="abcdea";
		System.out.println(isUnique(str));
	}
	public static boolean isUnique(String str){
		int counter=0;
		int n=str.length();
		for(int i=0;i<n;i++){
			int bit=str.charAt(i)-'a';
			if((counter &(1<<bit))>0){
				return false;
			}
			counter|=1<<bit;
		}
		return true;
	}
}