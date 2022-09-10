public class searchElement
{
   private Node head;
   public static class Node
   {
       private int data;
       private Node next;
       Node(int data)
       {
           this.data=data;
           this.next=null;
       }

   }
   public void print()
   {
       Node current=head;
       while(current!=null)
       {
           System.out.print(current.data + " -->");
           current=current.next;
       }
       System.out.println("null");
   }
   public boolean search(int searchKey)
   {
       Node current=head;
       while(current!=null)
       {
           if(current.data == searchKey)
           {
               return true;
           }
           current=current.next;
       }
       return false;
   }

    public static void main(String[] args)
    {
       searchElement se=new searchElement();
       se.head=new Node(1);
       Node second=new Node(2);
       Node third=new Node(3);
       Node fourth=new Node(5);
      se.head.next=second;
       second.next=third;
       third.next=fourth;
       se.print();

        System.out.println(se.search(2));
    }
}
