class OneWay{

public static void main(String []args){

	String s1="abcd";
	String s2="abef";
	int n1=s1.length();
	int n2=s2.length();
	if(n1==n2){
		System.out.println(oneEdit(s1,s2));
	}
	else if(n1+1==n2){
		System.out.println(oneDelete(s2,s1));
	}
	else if(n1==n2+1){
		System.out.println(oneDelete(s1,s2));
	}

	}

public static boolean oneEdit(String s1,String s2){

	boolean edit=false;
	for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)!=s2.charAt(i)){
			if(edit){
				return false;
			}
			edit=true;
			
		}
	}
	return true;
}

public static boolean oneDelete(String s1, String s2){
	boolean delete=false;
	int index1=0;
	int index2=0;
	while(index1<s1.length() && index2<s2.length()){
		if(s1.charAt(index1)!=s2.charAt(index2)){
			if(index1!=index2){
				return false;
			}	
			index2++;
		}
		else{
			index1++;
			index2++;
		}
		
	}
	return true;
}

}