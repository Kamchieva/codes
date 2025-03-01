//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node {
    int data ;
    Node next ;
    Node(int data)  {
        this.data = data ;
    }
    int countNodes(Node head) {
 int count = 1;
 Node current = head;

 while(current.next != null) {
     current = current . next ;
     count += 1;

 }
        return count;
    }
}
    public static void main(String[] args) {

    }
