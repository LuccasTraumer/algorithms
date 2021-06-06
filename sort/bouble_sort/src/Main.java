public class Main {

    public static void main(String[] args) {
        try {
            BoubleSort boubleSort = new BoubleSort();
            Integer[] values = new Integer[5];
            values[0] = 4;
            values[1] = 2;
            values[2] = 6;
            values[3] = 1;
            values[4] = 8;

            boubleSort.sort(values);

            for (int index=0; index < values.length; index++)
                System.out.println(values[index]);
        }catch (Exception e) {}
    }
}
