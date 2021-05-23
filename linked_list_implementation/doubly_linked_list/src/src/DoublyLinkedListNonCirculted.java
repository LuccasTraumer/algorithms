public class DoublyLinkedListNonCirculted {

    private Person begin;

    public DoublyLinkedListNonCirculted() {
        begin = null;
    }

    public void addPerson(Person person) throws Exception{
        Person newPerson = new Person(person.getName(), person.getAge());

        if(this.begin == null) {
            this.begin = newPerson;
        }
        else {
            Person aux = this.begin;
            while(aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(person);
            aux.setPrevious(this.begin);
        }
    }

    public void removeFromTop() {
        Person aux = this.begin.getNext();
        this.begin = aux;
    }

    public void removeEspecificPerson(Person person) {
        Person aux = this.begin;

        if (aux.getNext() == null)
            aux = null;

        while (aux.getNext() != null) {
            if(aux.equals(person)) {
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            aux = aux.getNext();
        }
    }

    public boolean isInclude(Person person) {
        Person aux = this.begin;
        boolean isInclude = false;

        if (this.begin == null)
            return false;

        if(aux.getNext() == null)
            isInclude = true;

        while (aux.getNext() != null) {
            if(aux.equals(person))
                isInclude = true;
            aux = aux.getNext();
        }

        return isInclude;
    }

    public Integer size() {
        int size = 1;

        if (this.begin == null)
            return 0;

        Person aux = this.begin;
        while(aux.getNext() != null) {
            size++;
            aux = aux.getNext();
        }

        return size;
    }
}
