import java.util.*;

class Node{
    int data;
    Node next;
    Node(int i){
        this.data=i;
        this.next=null;
    }
}

class CheckPalindromList{
    public static boolean isPalindrom(Node head){
        Stack<Integer> s =new Stack<>();
        Node node=head;
        while (node != null){
            s.push(node.data);
            node = node.next;
        }

        node = head;
        while (node != null){
            int top = s.pop();
            if(top != node.data){
                return false;
            }
            node = node.next;
        }
        return true;
    }

    public static void main (String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        if (isPalindrom(head)) {
            System.out.println("Linked list is a palindrom");
        }else {
            System.out.println("Linked list is not a palindrom");
        }
    }
}