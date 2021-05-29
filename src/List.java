public class List {
    private Person headPerson;

    void addPerson(Person person) {
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

    void removePerson() {
        Person aux = this.headPerson;
        if (aux != null && aux.getNextPerson() != null) {
            aux = aux.getNextPerson();
        }

        aux = null;
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

    public String showList() {
        String result = "";
        if (this.headPerson != null) {
            Person aux = this.headPerson;
            while (aux != null) {
                result += aux.getName() + "\n";
                aux = aux.getNextPerson();
            }
        }

        return result;
    }
}
