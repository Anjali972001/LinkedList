
    public class LinkedList
    {
        private ListNode head;
        public static class ListNode
        {
            private int data;
            private ListNode next;
            public ListNode(int data)
            {
                this.data=data;
                this.next=null;//by default it is null.
            }


        }
        // insert at first position of the linked list....
        public void insertFirst(int value)
        {
            ListNode newNode=new ListNode(value);
            newNode.next=head;
            head=newNode;

        }
        public void display()
        {
            ListNode n=head;
            while(n!=null)
            {
                System.out.print(n.data+"-->");
                n=n.next;
            }
            System.out.print("null");
        }

        public static void main (String[] args)
        {
            LinkedList sll=new LinkedList();
            sll.insertFirst(10);
            sll.insertFirst(20);
            sll.insertFirst(30);
            sll.insertFirst(40);

            sll.display();
        }
    }

