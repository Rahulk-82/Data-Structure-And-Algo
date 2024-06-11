package Data_Structure.LinkedList;

public class LinkedList{

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }


    void insert(LinkedList list,int data){
        Node newNode=new Node(data);
        if (list.head==null){
            list.head=newNode;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
    }
    void printList(Node n){
        Node node=n;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }

    Node reverseList(Node node){
        Node current=node;
        Node pre=null;
        while(current!=null){
            Node temp=current.next;
            current.next=pre;
            pre=current;
            current=temp;
        }
        return pre;
    }

    int middleELement(Node node){
        Node slow=node;
        Node fast=node;
        while(fast!=null && fast.next!=null){ // condition should be remember
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String []args){
        LinkedList list=new LinkedList();

        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,51);
        list.insert(list,6);
        list.insert(list,89);
        list.insert(list,9);
        list.insert(list,78);
        System.out.println("--------------- Print all numbers-----------");
        list.printList(list.head);
        System.out.println("--------------- reverse all numbers-----------");
        Node n=list.reverseList(list.head);
        list.printList(n);

        System.out.println("--------------- middle of all numbers-----------");
        System.out.println(list.middleELement(n));

    }
}
