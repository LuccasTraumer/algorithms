public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        Client lucas = new Client("lucas", 22, 10000.0);
        Client david = new Client("david", 16, 10000.0);

        queue.addClient(lucas);
        queue.addClient(david);

        System.out.println(queue.sizeQueue());
        System.out.println(queue);

        queue.removeClient();

        System.out.println(queue.sizeQueue());
        System.out.println(queue);
    }
}
