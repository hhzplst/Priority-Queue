public class PriorityQueueTest {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(1);
    pq.add(0);
    pq.add(4);
    pq.add(2);
    pq.add(-1);

    Iterator<Integer> it = pq.getIterator();
    while(it.hasNext())
      System.out.println(pq.remove());
  }
}

/************************TEST OUTPUT************************

➜  AssignmentE git:(master) ✗ javac *.java          
➜  AssignmentE git:(master) ✗ java PriorityQueueTest
4
2
1
0
-1

***********************END TEST OUTPUT**********************/