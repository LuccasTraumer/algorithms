public class Stack {
    private List list;
    private Person[] arrayPerson;
    private int index = 0;

    public Stack() {
        list = new List();
    }

    public Stack(int size) {
        this.arrayPerson = new Person[size];
    }

    public void addInList(Person person) {
        list.addPerson(person);
    }

    public void addInArray(Person person) {
        this.arrayPerson[index++] = person;
    }

    public void removeInList() {
        this.list.removePerson();
    }

    public void removeInArray() {
        this.arrayPerson[index--] = null;
    }

    public Integer sizeInList() {
        return this.list.sizeList();
    }

    public Integer sizeInArray() {
        return this.index;
    }

    public boolean clientInList(Person person) {
        return this.list.thisPersonInList(person);
    }

    public boolean clientInArray(Person person) {
        for(int ind = 0; ind < index; ind++) {
            if(this.arrayPerson[ind].equals(person))
                return true;
        }

        return false;
    }

    public String toStringInList() {
        return list.showList();
    }

    public String toStringInArray() {
        String resultado = "";
        for(int ind = 0; ind < index; ind++)
            resultado += this.arrayPerson[ind] + "\n";

        return resultado;
    }
}