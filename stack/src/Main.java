public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Client lucas = new Client();
        Client david = new Client();

        david.setName("David");
        david.setWallet(10000.0);

        lucas.setName("Lucas");
        lucas.setWallet(100000.0);

        stack.add(lucas);
        stack.add(david);

        System.out.println(stack);
        System.out.println(stack.size());
        stack.remove();
        System.out.println(stack);
    }
}
