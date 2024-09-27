package behavioralPattern.iterator;
import java.util.LinkedList;

//Client 코드
public class Client {
 public static void main(String[] args) {
     // ArrayBookRepository 예제
     String[] booksArray = {"The Great Gatsby", "To Kill a Mockingbird", "1984", "The Catcher in the Rye"};
     Collection arrayBookRepository = new ArrayBookRepository(booksArray);
     Iterator arrayIterator = arrayBookRepository.createIterator();
     System.out.println("ArrayBookRepository Iterator:");
     while (arrayIterator.hasNext()) {
         System.out.println(arrayIterator.getNext());
     }

     // LinkedListBookRepository 예제
     LinkedList<String> booksLinkedList = new LinkedList<>();
     booksLinkedList.add("The Great Gatsby");
     booksLinkedList.add("To Kill a Mockingbird");
     booksLinkedList.add("1984");
     booksLinkedList.add("The Catcher in the Rye");
     Collection linkedListBookRepository = new LinkedListBookRepository(booksLinkedList);
     Iterator linkedListIterator = linkedListBookRepository.createIterator();
     System.out.println("\nLinkedListBookRepository Iterator:");
     while (linkedListIterator.hasNext()) {
         System.out.println(linkedListIterator.getNext());
     }
 }
}
