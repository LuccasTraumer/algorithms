public class Main {

    public static void main(String[] args) {

        DoublyLinkedListNonCirculted doublyLinkedListNonCirculted = new DoublyLinkedListNonCirculted();

        try {
            Person lucas = new Person("Lucas", 22);
            doublyLinkedListNonCirculted.addPerson(lucas);
            doublyLinkedListNonCirculted.addPerson(new Person("David", 16));
            doublyLinkedListNonCirculted.addPerson(new Person("Matheus", 8));

            System.out.println(doublyLinkedListNonCirculted.isInclude(lucas));
            doublyLinkedListNonCirculted.removeFromTop();
            System.out.println(doublyLinkedListNonCirculted.isInclude(lucas));
            System.out.println(doublyLinkedListNonCirculted.size());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
