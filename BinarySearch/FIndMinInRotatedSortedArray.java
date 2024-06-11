package Data_Structure.BinarySearch;

public class FIndMinInRotatedSortedArray {
    public static void main(String [] args){
        int [] array=new int[]{8,10,20,23,6,7};
        int l=0;
        int r=array.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(array[mid]<array[mid-1]){
                System.out.println(array[mid]);
                break;
            }
            if(array[mid]>array[mid+1]){
                System.out.println(array[mid+1]);
                break;
            }
            if(array[mid]>array[0]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    }
}
