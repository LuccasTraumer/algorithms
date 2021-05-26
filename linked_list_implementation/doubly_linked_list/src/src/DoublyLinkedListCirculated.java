public class DoublyLinkedListCirculated {

    private Person begin;

    public DoublyLinkedListCirculated() {
        this.begin = null;
    }

    public void addPerson(Person newPerson) throws Exception{
        Person auxPerson = new Person(newPerson.getName(), newPerson.getAge());

        if(isEmpty()) {
            this.begin = auxPerson;
            this.begin.setPrevious(auxPerson);
            this.begin.setNext(auxPerson);
        } else {
            Person tempPerson = this.begin;
            while (!tempPerson.getNext().equals(this.begin)) {
                tempPerson = tempPerson.getNext();
            }

            this.begin.setPrevious(auxPerson); // Old list set the "new" person has befour him.
            tempPerson.setNext(auxPerson); // the last element in the list set next element as "new" Person

            auxPerson.setPrevious(tempPerson); // "new" Person set befour him the last element in list
            auxPerson.setNext(this.begin); // "new" Person set the begin of list as the next element
        }
    }

    public void removeFromBegin() {
        Person auxPerson = this.begin;

        if (isEmpty())
            return;

        auxPerson.getPrevious().setNext(auxPerson.getNext());
        auxPerson.getNext().setPrevious(auxPerson.getPrevious());
    }

    public void removeEspecificPerson(Person  person) {
        Person auxPerson = this.begin;

        if(isEmpty())
            return;

        while (!auxPerson.getNext().equals(this.begin)) {
            if(auxPerson.equals(person)) {
                auxPerson.getNext().setNext(auxPerson.getPrevious());
                this.begin = auxPerson.getNext();

                return;
            }
            auxPerson = auxPerson.getNext();
        }
    }

    public Integer size() {
        if (isEmpty())
            return 0;

        Person auxPerson = this.begin;
        int size = 1;

        while (!auxPerson.getNext().equals(this.begin)) {
            size++;
            auxPerson = auxPerson.getNext();
        }

        return size;
    }

    public boolean isInclude(Person person) {
        if (isEmpty())
            return false;

        Person auxPerson = this.begin;

        while (!auxPerson.getNext().equals(this.begin)) {
            if (auxPerson.equals(person))
                return true;

            auxPerson = auxPerson.getNext();
        }

        return false;
    }

    private boolean isEmpty() {
        return this.begin == null;
    }
}
