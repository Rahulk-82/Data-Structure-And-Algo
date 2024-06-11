package Data_Structure.LinkedList;

public class AddTwoLinkedList {

    public static void main(String []args){
        LinkedList list1=new LinkedList();
        list1.insert(list1,1);
        list1.insert(list1,2);
        list1.insert(list1,5);
        list1.insert(list1,8);

        LinkedList list2=new LinkedList();
        list2.insert(list2,3);
        list2.insert(list2,3);
        list2.insert(list2,7);
        list2.insert(list2,9);
        list2.insert(list2,9);

        System.out.println(addNumbers(list1.head,list2.head));

    }

    public static int addNumbers(LinkedList.Node n1, LinkedList.Node n2){
            int first=0;
            int second=0;
            while(n1!=null){
                first=first*10+n1.data;
                n1=n1.next;
            }
            while(n2!=null){
                second=second*10+n2.data;
                n2=n2.next;
            }
            return first+second;
    }

}
