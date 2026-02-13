package LinkedList;

public class DoublyLinkedList<T> {
  private Node<T> head;
  private Node<T> tail;

  public void addToFront(T value) {
    Node<T> newNode = new Node<>(value);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.setNext(head);
    head.setPrev(newNode);
    head = newNode;
  }

  public void addToEnd(T value) {
    Node<T> newNode = new Node<>(value);

    if (tail == null) {
      head = tail = newNode;
      return;
    }

    newNode.setPrev(tail);
    tail.setNext(newNode);
    tail = newNode;
  }

  public T removeFromFront() {
    if (head == null) return null;

    T removedValue = head.getValue();

    if (head == tail) {
      head = tail = null;
      return removedValue;
    }

    head = head.getNext();
    head.setPrev(null);

    return removedValue;
  }

  public T removeFromEnd() {
    if (tail == null) return null;

    T removedValue = tail.getValue();

    if (head == tail) {
      head = tail = null;
      return removedValue;
    }

    tail = tail.getPrev();
    tail.setNext(null);

    return removedValue;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    Node<T> current = head;
    while (current != null) {
      sb.append(current.getValue());
      current = current.getNext();
      if (current != null) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
}
