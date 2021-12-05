import java.util.ArrayList;

import java.util.List;

import static java.util.Objects.isNull;

public class BinarySearch<Person> {
    private List<Person> list;
    private int inicio = 0;
    private int meio = 0;
    private int fim = 0;

    public BinarySearch() {
        this.list = new ArrayList<>();
    }

    public Person findElement(final Person element) throws Exception {
        List<Person> orderList = sort(this.list);

        fim = this.list.size();
        meio = (inicio + fim) / 2;
        while(orderList.iterator().hasNext()) {
            if (((Client) orderList.get(meio)).compareTo((Client) element) == 0)
                return orderList.get(meio);

            if (((Client) element).compareTo(((Client) orderList.get(meio))) ==  -1) {
                System.out.println("O numero " + ((Client) orderList.get(meio)).getAge() +
                        " é maior que o numero " + ((Client) element).getAge());

                fim = meio;
                meio = (inicio + fim) / 2;
                orderList.iterator().next();
            } else if (((Client) element).compareTo(((Client) orderList.get(meio))) == 1) {
                System.out.println("O numero " + ((Client) orderList.get(meio)).getAge() +
                        " é menor que o numero " + ((Client) element).getAge());

                inicio = meio;
                meio = (inicio + fim) / 2;
                orderList.iterator().next();
            }
        }

        System.out.println(((Client) orderList.get(meio)).getAge());
        return null;
    }

    public Person findElement(final List<Person> list, final Person element) {

        return null;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public List<Person> getList() {
        return this.list;
    }

    private List<Person> sort(List<Person> list) throws Exception {
        if (isNull(list))
            throw new Exception("Empty list!");

        for(int slowIndex = 0; slowIndex < list.size(); slowIndex++) {
            for (int fastindex = slowIndex +1; fastindex < list.size(); fastindex++) {
                if(((Client) list.get(slowIndex)).getAge() > ((Client)list.get(fastindex)).getAge()) {
                    Person aux = list.get(slowIndex);
                    list.set(slowIndex, list.get(fastindex));
                    list.set(fastindex, aux);
                }
            }
        }
        return list;
    }
}
