
///////////////////////
//NOT COMPLETED/WORKING   <------  // only this file
///////////////////////

class Node   
{
    int value;
    Node next;

    public Node(int value) 
    {
        this.value = value;
        this.next = null;
    }
}

class DLLHeap
{
    Node head;
    int totalNodes;

    public DLLHeap()
    {
        head = null;
        totalNodes = 0;
    }

    boolean insertion(int val) 
    {
        Node newNode = new Node(val);
        if (head == null || val < head.value)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node curr = head;
            while (curr.next != null && val > curr.next.value)
            {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        totalNodes++;
        return true;
    }

    int deletion() 
    {
        if (head == null) 
        {
            return -1;
        }
        else
        {
            int deletedValue = head.value;
            head = head.next;
            totalNodes--;
            return deletedValue;
        }
    }

    public static void main(String[] args) 
    {
        Heap heap = new Heap();

        heap.insertion(3);
        heap.insertion(1);
        heap.insertion(4);
        heap.insertion(2);

        System.out.println("Deleted: " + heap.deletion()); // Output: 1
        System.out.println("Deleted: " + heap.deletion()); //         2
        System.out.println("Deleted: " + heap.deletion()); //         3
        System.out.println("Deleted: " + heap.deletion()); //         4
    }
}
