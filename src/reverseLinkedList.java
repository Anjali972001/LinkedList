public class reverseLinkedList
{

    private Node head;
    public static class Node
    {
        private int data;
         Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;


        }
    }
    public void print()
    {
        Node n =head;
        while(n!=null)
        {
            System.out.print(n.data +" -->");
            n=n.next;
        }
        System.out.println("null");
    }
    public Node reverse()
    {
        Node current=head;
        Node previous=null;
        Node next=null;
        while (current!=null)
        {
          next=current.next;
          current.next= previous;
          previous=current;
          current=next;
        }
        return previous;
    }

    public static void main(String args[])
    {
        reverseLinkedList rll=new reverseLinkedList();
        rll.head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(40);
        Node fourth=new Node(50);
        rll.head.next=second;
        second.next=third;
        third.next=fourth;
        rll.print();
        System.out.println("reverse of the linkedList: ");




    }
}




