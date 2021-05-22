public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Person lucas = new Person("Lucas", 21);
        list.addperson(lucas);
        list.addperson(new Person("David", 16));

        System.out.println(list.thisPersonInList(lucas));
        System.out.println(list.sizeList());
    }
}
