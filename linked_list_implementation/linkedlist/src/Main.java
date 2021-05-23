public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Person lucas = new Person("Lucas", 21);
        Person david = new Person("David", 16);

        list.addPerson(lucas);
        list.addPerson(david);

        System.out.println(list.thisPersonInList(lucas));
        list.removePerson(david);
        System.out.println(list.sizeList());
    }
}
