public class Queue {
    private List list;

    public Queue() {
        this.list = new List();
    }

    public void addClient(Person person) {
        this.list.addClient(person);
    }

    public void removeClient() {
        this.list.removeClient();
    }

    public Integer sizeQueue() {
        return this.list.sizeQueue();
    }

    public boolean clientInQueue(Person person) {
        return this.list.clientIsInclude(person);
    }

    public String toString() {
        return this.list.toString();
    }
}
