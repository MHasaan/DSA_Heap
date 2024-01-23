// ///////////////////////
// //NOT COMPLETED/WORKING   <------  // only this file
// ///////////////////////

// class Node   
// {
//     int value;
//     Node next;

//     public Node(int value) 
//     {
//         this.value = value;
//         this.next = null;
//     }
// }

// class DLLHeap
// {
//     Node head;
//     int totalNodes;

//     public DLLHeap()
//     {
//         head = null;
//         totalNodes = 0;
//     }

//     boolean insertion(int val) 
//     {
//         Node newNode = new Node(val);
//         if (head == null || val < head.value)
//         {
//             newNode.next = head;
//             head = newNode;
//         }
//         else
//         {
//             Node curr = head;
//             while (curr.next != null && val > curr.next.value)
//             {
//                 curr = curr.next;
//             }
//             newNode.next = curr.next;
//             curr.next = newNode;
//         }
//         totalNodes++;
//         return true;
//     }

//     int deletion() 
//     {
//         if (head == null) 
//         {
//             return -1;
//         }
//         else
//         {
//             int deletedValue = head.value;
//             head = head.next;
//             totalNodes--;
//             return deletedValue;
//         }
//     }

//     public static void main(String[] args) 
//     {
//         Heap heap = new Heap();

//         heap.insertion(3);
//         heap.insertion(1);
//         heap.insertion(4);
//         heap.insertion(2);

//         System.out.println("Deleted: " + heap.deletion()); // Output: 1
//         System.out.println("Deleted: " + heap.deletion()); //         2
//         System.out.println("Deleted: " + heap.deletion()); //         3
//         System.out.println("Deleted: " + heap.deletion()); //         4
//     }
// }



// public class Main 
// {
//     public static void main(String[] args)
//     {
//         Heap a = new Heap();
//         a.deleteElement();
//     }
// }
// class Heap
// {
//     int[] arr;
//     int elements;

//     Heap()
//     {
//         arr = new int[8];
//         elements = 7;
//         arr[0] = 100;
//         arr[1] = 40;
//         arr[2] = 50;
//         arr[3] = 10;
//         arr[4] = 15;
//         arr[5] = 49;
//         arr[6]=40;
//     }

//     public void addElement(int val)
//     {
//         arr[elements]= val;
//         heapify_up(elements);
//         elements++;
//     }

//     public int heapify_up(int size)
//     {
//         if(size==0)
//             return 0;
//         else
//         {
//             int parent = (size-1)/2;
//             if(arr[parent]>=arr[size])
//             {
//                 int swap = arr[parent];
//                 arr[parent] = arr[size];
//                 arr[size] = swap;
//             }
//             heapify_up(parent);
//             return 0;
//         }
//     }

//     public int deleteElement()
//     {
//         int temp = arr[0];
//         arr[0]=arr[elements-1];
//         elements--;
//         heapifyDown(0);
//         return temp;
//     }

//     void heapifyDown(int i) 
//     {
//         int largest = i; // Initialize largest as root
//         int left = 2 * i + 1; // left = 2*i + 1
//         int right = 2 * i + 2; // right = 2*i + 2

//         // If left child is larger than root
//         if (left < elements && arr[left] > arr[largest])
//             largest = left;

//         // If right child is larger than largest so far
//         if (right < elements && arr[right] > arr[largest])
//             largest = right;

//         // If largest is not root
//         if (largest != i) 
//         {
//             // Swap
//             int swap = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = swap;

//             // Recursively heapify the affected sub-tree
//             heapifyDown(largest);
//         }
//     }
// }