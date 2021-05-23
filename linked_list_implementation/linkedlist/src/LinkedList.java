public class LinkedList {
    private Person headPerson;

    void addPerson(Person person) {
        Person aux = person;

        if (this.headPerson == null) {
            headPerson = person;
        } else {
            Person personAux = headPerson;
            while(personAux.getNextPerson() != null) {
                personAux = personAux.getNextPerson();
            }
            this.headPerson.setNextPerson(person);
        }
    }

    void removePerson(Person person) {
        Person aux = this.headPerson;
        if (aux != null) {
            while (aux.getNextPerson() != null) {
                if (aux.equals(person)) {
                    aux = aux.getNextPerson();
                    aux.setNextPerson(null);
                }
                aux = aux.getNextPerson();
            }
        }
        this.headPerson = aux;
    }

    boolean thisPersonInList(Person person) {
        boolean inList = false;
        Person aux = this.headPerson;
        while(aux.getNextPerson() != null) {
            if (aux.equals(person))
                inList = true;
            aux = aux.getNextPerson();
        }

        return inList;
    }

    Integer sizeList() {
        int size = 1;
        Person aux = this.headPerson;
        while(aux.getNextPerson() != null) {
            size++;
            aux = aux.getNextPerson();
        }

        return size;
    }
}
