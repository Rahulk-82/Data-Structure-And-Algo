package Data_Structure.LinkedList;

public class DetectCycle {

    public static void main(String[]args){
        LinkedList list1=new LinkedList();
        list1.insert(list1,1);
        list1.insert(list1,2);
        list1.insert(list1,5);
        list1.insert(list1,8);
        list1.head.next.next.next=list1.head.next;

        LinkedList.Node slow=list1.head;
        LinkedList.Node fast=list1.head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            System.out.println("slow: "+slow.data+"fast: "+fast.data);
            if(slow==fast){
                System.out.println("Cycle start point is: " +slow.data);
                break;
            }
        }
    }

}
