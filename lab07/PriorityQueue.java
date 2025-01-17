import java.util.Optional;

/**
 * This class wraps around the class PriorityQueue from Java
 * Collection Framework.  It provides an alternative API 
 * that could be modified to support an immutable Priority
 * Queue.
 *
 * @author Ooi Wei Tsang
 * @version CS2030 AY19/20 Sem 1 Lab 7
 **/
public class PriorityQueue<T> {
  /** The actual priority queue that stores the items. */
  private final java.util.PriorityQueue<T> pq;

  /**
   * Constructor for an empty priority queue.
   **/
  public PriorityQueue() {
    pq = new java.util.PriorityQueue<>();
  }

  /**
   * Constructor for a non-empty priority queue.
   * @param array Array of items to be addded 
   **/
  public PriorityQueue(java.util.PriorityQueue<T> queue) {
      pq = new java.util.PriorityQueue<>(queue);
  }

  /**
   * Add an object into the priority queue following the
   * add() method of the JCF PriorityQueue.  Return the
   * priority queue after the object is added.
   * @param object The item to add
   **/
  public PriorityQueue<T> add(T object) {
    java.util.PriorityQueue<T> temp = new java.util.PriorityQueue<>(pq);
    temp.add(object);
    return new PriorityQueue<T>(temp);
  }

  /**
   * Return as a pair, (i) the next priortized item according 
   * to the natural order of the objects in the priority queue, 
   * and (ii) the priority queue after the item is removed.
   * @return The pair (item, priority queue)
   **/
  public Pair<Optional<T>, PriorityQueue<T>> poll() {
    java.util.PriorityQueue<T> temp = new java.util.PriorityQueue<>(pq);
    T object = temp.poll();
    Optional<T> t = Optional.ofNullable(object);
    return Pair.of(t, new PriorityQueue<T>(temp));
  }
}
