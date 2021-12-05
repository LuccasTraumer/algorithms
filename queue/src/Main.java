public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);

        Client lucas = new Client("lucas", (short) 22, 10000.0);
        Client david = new Client("david", (short) 16, 10000.0);

        queue.addClientInArray(lucas);
        queue.addClientInArray(david);

        System.out.println(queue.sizeQueueInArray());
        System.out.println(queue.toStringInArray());

        queue.removeClientInArray();

        System.out.println(queue.sizeQueueInArray());
        System.out.println(queue.toStringInArray());
    }
}
