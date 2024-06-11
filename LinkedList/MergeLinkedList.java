package Data_Structure.LinkedList;

public class MergeLinkedList {
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
        LinkedList.Node head=MergeList(list1.head,list2.head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static LinkedList.Node MergeList(LinkedList.Node l1, LinkedList.Node l2){
        if (l1==null) return l2;
        if (l2==null) return l1;

        LinkedList.Node head;
        if(l1.data<l2.data){
            head=l1;
        }
        else{
            head=l1;
            l1=l2;
            l2=head;
        }
        while(l1.next!=null){
            if(l1.next.data>l2.data){
                LinkedList.Node temp=l1.next;
                l1.next=l2;
                l2=temp;
            }
            l1=l1.next;
        }
        l1.next=l2;
        return head;

    }
}
