public class Stack {
    private List list;

    public Stack() {
        list = new List();
    }

    public void add(Person person) {
        list.addPerson(person);
    }

    public void remove() {
        this.list.removePerson();
    }

    public Integer size() {
        return this.list.sizeList();
    }

    public boolean clientInStack(Person person) {
        return this.list.thisPersonInList(person);
    }

    public String toString() {
        return list.showList();
    }
}
