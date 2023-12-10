public class Heap  //working
{
    int heap[];
    int size;
    int top;

    Heap() 
    {
        size = 5;
        top = 0;
        heap = new int[size];
    }

    Heap(int size) 
    {
        this.size = size;
        top = 0;
        heap = new int[size];
    }

    public boolean insertion(int data)
    {
        if (top == size) 
        {
            System.out.println("Heap is full.");
            return false;
        }

        heap[top] = data;
        heapification(top);
        top++;        
        return true;
    }

    private boolean heapification(int current) //upHeap
    {
        if(current > 0)
        {
            if( heap[current] < heap[parent(current)] )
            {
                swap(current , parent(current));
                current = parent(current);
                heapification(current);
            }
        }
        return true;
    }

    public int deletion() 
    {
        if (top == 0) 
        {
            System.out.println("Heap is empty. Cannot delete from an empty heap.");
            return -1;
        }
        int deletedValue = heap[0];
        heap[0] = heap[top - 1];
        top--;

        int current = 0;
        reHeap(current);

        return deletedValue;
    }

    private void reHeap(int current)
    {
        int smallest = current;
        int leftChild = leftChild(current);
        int rightChild = rightChild(current);

        if (leftChild < top && heap[leftChild] < heap[smallest]) 
        {
            smallest = leftChild;
        }
        if (rightChild < top && heap[rightChild] < heap[smallest]) 
        {
            smallest = rightChild;
        }
        if (smallest != current) 
        {
            swap(current, smallest);
            current = smallest;

            reHeap(current);
        } 
    }


    private int parent(int a) 
    {
        return (a - 1) / 2;
    }

    private int leftChild(int a)
    {
        return (2 * a) + 1;
    }

    private int rightChild(int a) 
    {
        return (2 * a) + 2;
    }

    private void swap(int a, int b) 
    {
        heap[a] += heap[b];
        heap[b] = heap[a] - heap[b];
        heap[a] -= heap[b];
    }


    @Override
    public String toString()
    {
        String toReturn = "";
        for(int a = 0; a < top ; a++)
        {
            toReturn += heap[a] + " ";
        }
        return toReturn;
    }
}
