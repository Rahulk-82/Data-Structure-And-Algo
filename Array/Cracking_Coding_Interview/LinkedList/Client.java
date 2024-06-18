package Data_Structure.Array.Cracking_Coding_Interview.LinkedList;

public class Client {
    public static void main(String []args){
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(3);
        LinkedList.insert(7);
        LinkedList.insert(10);
        LinkedList.insert(7);
        LinkedList.insert(7);
        LinkedList.insert(9);

        //LinkedList.removeDuplicate();
        //LinkedList.printLinkedList();
        int number=LinkedList.KthTotheLast(1);
        //System.out.println(number>0?number:-1);
        LinkedList list=new LinkedList();
        int index=list.KthTotheLast(LinkedList.head,4);
    }
}
