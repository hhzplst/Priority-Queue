import java.util.ArrayList;

public class PriorityQueue<T extends Comparable<T>> {
  private final ArrayList<T> list = new ArrayList<>();

  public void Add(T item) {
    int insertIndex = findIndex(item);  
    list.add(insertIndex, item);
  }

  public T Remove() {
    if (list.size() > 0)
      return list.remove(0);
    else
      return null;
  }
  
  public Iterator<T> getIterator() {
    return new Iterator<T>() {
      int index = 0;
      public boolean hasNext() {
        return index < list.size();
      }
      public T getNext() {
        return list.get(index++);
      }
    };
  }

  private int findIndex(T item) {
    int index = 0;
    Iterator<T> it = getIterator();
    while(it.hasNext()) {
      index++;
      T current = it.getNext();
      if (current.compareTo(item) < 0)
        return index;
      if (current.compareTo(item) == 0)
        continue;
    }
    return 0;
  }
}