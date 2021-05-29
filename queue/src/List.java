import static java.lang.String.format;

public class List {
    private Person headPerson;

    public void addClient(Person person) {
        Person aux = this.headPerson;

        if(queueIsEmpty()) {
            aux = person;
            this.headPerson = aux;
            return;
        }

        while(aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(person);
        this.headPerson = aux;
    }

    public void removeClient() {
        if(queueIsEmpty())
            return;

        Person aux = this.headPerson;
        aux = aux.getNext();
        this.headPerson = aux;
    }

    public boolean clientIsInclude(Person person) {
        boolean isInclude = false;
        if(queueIsEmpty())
            return isInclude;

        Person aux = this.headPerson;
        while(aux.getNext() != null) {
            if(aux.equals(person)) {
                isInclude = true;
                break;
            }
        }

        return isInclude;
    }

    public Integer sizeQueue() {
        int size = 0;

        if(queueIsEmpty())
            return size;

        size++;
        Person aux = this.headPerson;

        while (aux.getNext() != null) {
            size++;
            aux = aux.getNext();
        }

        return size;
    }

    public boolean queueIsEmpty() {
        return this.headPerson == null;
    }

    public String toString() {
        String ret = "";
        Person aux = this.headPerson;

        while (aux != null) {
            ret += "Client: name: " +  aux.getName() +", age: " + aux.getAge() + "\n";
            aux = aux.getNext();
        }
        return ret;
    }
}
