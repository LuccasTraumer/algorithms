public class Main {

    public static void main(String[] args) {

        /** Doubly Linked List non Circulated*/
        try {
            DoublyLinkedListNonCirculated doublyLinkedListNonCirculated = new DoublyLinkedListNonCirculated();

            Person lucas = new Person("Lucas", 22);
            doublyLinkedListNonCirculated.addPerson(lucas);
            doublyLinkedListNonCirculated.addPerson(new Person("David", 16));
            doublyLinkedListNonCirculated.addPerson(new Person("Matheus", 8));

            System.out.println("----------- BEGIN NON CIRCULATED ------------------------------");
            System.out.println(doublyLinkedListNonCirculated.isInclude(lucas));
            doublyLinkedListNonCirculated.removeFromTop();
            System.out.println(doublyLinkedListNonCirculated.isInclude(lucas));
            System.out.println(doublyLinkedListNonCirculated.size());
            System.out.println("----------- END NON CIRCULATED ------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /** Doubly Linked List Circulated*/
        try {
            DoublyLinkedListCirculated list = new DoublyLinkedListCirculated();
            Person lucas = new Person("Lucas", 22);
            Person david = new Person("david", 15);
            Person matheus = new Person("matheus", 8);

            list.addPerson(lucas);
            list.addPerson(david);
            list.addPerson(matheus);

            System.out.println("----------- BEGIN CIRCULATED ------------------------------");
            System.out.println(list.size());
            System.out.println(list.isInclude(lucas));
            list.removeEspecificPerson(lucas);
            System.out.println(list.isInclude(lucas));
            System.out.println("----------- END CIRCULATED ------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
