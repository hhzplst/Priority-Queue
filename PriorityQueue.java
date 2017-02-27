import java.util.ArrayList;

public class PriorityQueue<T extends Comparable> {
  private final ArrayList<T> list = new ArrayList<>();

  public void Add(T item) {
    int insertIndex = findIndex(item);  
    list.add(insertIndex, item);
  }

  public T Remove() {
    if (list.size() > 0) {
      list.remove(0);
    } else {
      System.out.println("No more element!");      
    }
  }
  
  public Iterator<T> getIterator() {
    return new Iterator() {
      int index = 0;
      public boolean hasNext() {
        return index < list.size();
      }
      public T next() {
        return list[index++];
      }
    }
  }

  private int findIndex(T item) {
    int index = 0;
    Iterator<T> it = getIterator();
    while(it.hasNext()) {
      index++;
      T current = it.next();
      if (current.compareTo(item) < 0)
        return index;
      if (current.compareTo(item) == 0)
        continue;
    }
  }
}