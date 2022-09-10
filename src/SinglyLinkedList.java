public class SinglyLinkedList
{
    private ListNode head;
    public static class ListNode
            // inner class is made static so that main can be accessed.
    {
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
  public static void main(String[] args)
  {
      SinglyLinkedList ssl=new SinglyLinkedList();
      ssl.head=new ListNode(10);
      ListNode second=new ListNode(11);
      ListNode third=new ListNode(12);
      ListNode fourth=new ListNode(13);
     ssl.head.next=second;
      second.next=third;
      third.next=fourth;
      ssl.printll();

  }
  public void printll()
  {
      ListNode n=head;
      while(n!=null)
      {
          System.out.print(n.data+" ");
          n=n.next;
      }
  }

}
