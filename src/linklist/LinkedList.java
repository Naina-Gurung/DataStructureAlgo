package linklist;

import java.util.* ;

/**
 * Created by z002gh2 on 2/26/19.
 */
public class LinkedList {

   public Node head;
   public Node tail ;

    String[] arr;
    //why are we defining this linkedList() function?
    /*public LinkedList(){
        this.head = null;
        this.tail = null;
    }*/

    public void addNodeBeginning(String data){
        if(head ==  null){
            head = new Node(data);
        }else{
            Node temp =  new Node(data);
            temp.next = head;
            head = temp;
        }
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current= current.next;
        }
    }

    public void printListReverse(){
        int index;
        ArrayList<String> names = new ArrayList<String>();
        Node current = head;
        while(current != null){
            names.add(current.data);
            current= current.next;
        }
        System.out.println(names.size());
        System.out.println("the reverse order is:");
        for(index = names.size()-1; index >=0 ; index --){
            System.out.println(names.get(index));
        }
    }

    public Node insertAtLast(String data){
        Node temp=new Node(data);
        if(null == tail){
            tail = new Node(data);
            head = tail;
        }else{

            tail.next=temp;
            tail = temp ;
        }

        return temp;
    }
//my version
    public Node insertAtLastWithoutTail(String data){
        Node temp = new Node(data);
        if(null == head){
            head = temp;
        }else{
            Node current = head;

            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
            temp.next = null;

        }
        return temp;

    }

    public void insertAfterCertainNode(String data, String newData){
        Node current = head;
        Node nextNode = null;
        Node temp = new Node(newData);
        while( current.data != data){
            current = current.next;
        }
        nextNode = current.next;
        current.next = temp;
        temp.next = nextNode;
    }

    public void deleteAtFirst(){
        if(null == head){
            System.out.println("Link list is empty.Nothing to delete!!");
        }else{
            head=head.next;
        }

    }

    //my version - deleting the last node
    public void deleteAtLast(){
        if(null == head){
            System.out.println("Nothing to delete.List is empty!!");
        }else{
            Node current = head;
            Node prev = head;
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;

        }
    }

    //sir version -deleting the last node
    public void deleteFromLast(){
        if(null == head){
            System.out.println("List is empty");
        }else{
            Node current = head;
            if(current.next == null){
                current = null;
            }else{
                while(current.next.next != null){
                    current = current.next;
                }
            }
            current.next=null;
        }
    }

    //my version delete a node after data=B
    public void deleteAfterNode(String data){
        Node current = head;
        Node deleteNode = null;
        while(current.data != data){
            current = current.next;
        }
        deleteNode= current.next;
        current.next = current.next.next;
        deleteNode = null;

    }

    //sir version delete a node b
    public void deleteAfter(String data){
        Node current = head;
        Node prev = null;
        while(current.data != data){
           prev = current;
            current = current.next;
        }
        prev.next=current.next;
    }

}
