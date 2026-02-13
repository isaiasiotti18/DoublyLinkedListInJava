package LinkedList;

public class Main {
  void main() {
    DoublyLinkedList<String> list = new DoublyLinkedList<>();

    list.addToFront("Ciclano");
    list.addToFront("Beltrano");
    list.addToEnd("Martelo");
    list.addToEnd("Tijolinho");

    IO.println(list.toString());

    list.removeFromEnd();
    list.removeFromFront();

    IO.println(list.toString());

    IO.println(list.isEmpty());
  }
}
