package Data_Structure.Array.Cracking_Coding_Interview.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public static Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // for inserting elements at the end of list
    public static void insert(int n){
        Node newNode=new Node(n);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    //for printing all the elements of the list
    public static void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    // For removing all dulicate number from the List

    public static void  removeDuplicate(){
        Set<Integer> set=new HashSet<>();
        LinkedList.Node  previous=null;
        LinkedList.Node  temp=head;
        if(head==null) return;
        while(temp!=null){
            if(set.contains(temp.data)){
                previous.next=temp.next;
            }
            else{
                set.add(temp.data);
                previous=temp;
            }
            temp=temp.next;
        }

    }

    // kth element from last -- Iterative Approach
    public static int KthTotheLast(int k){

        Node p1=head;
        Node p2=head;
        int i=0;
        while(i<k){
            if(p1==null) return -1;
            p1=p1.next;
            i++;
        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2.data;

    }

    //Kth from last using recursion
    public int KthTotheLast(Node n,int k){
        if(n==null) return 0;
        int index=KthTotheLast(n.next,k)+1;
        if(index==k) System.out.println(n.data);
        return index;
    }

    // for deleting the middle node
//    public boolean DeleteMiddlenode(Node n){
//        if(n==null ||n.next==null) return true;
//        n.data=n.next.data;
//        n.next=n.next.next;
//        return true;
//
//    }
}
