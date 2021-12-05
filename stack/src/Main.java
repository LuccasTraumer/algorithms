public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Client lucas = new Client();
        Client david = new Client();

        david.setName("David");
        david.setWallet(10000.0);

        lucas.setName("Lucas");
        lucas.setWallet(100000.0);

        stack.addInArray(lucas);
        stack.addInArray(david);

        System.out.println(stack.toStringInArray());
        System.out.println(stack.sizeInArray());
        stack.removeInArray();
        System.out.println(stack.toStringInArray());
    }
}
