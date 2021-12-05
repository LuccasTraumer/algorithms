import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Client();
        person.setAge(22);
        person.setName("Lucas");

        Person person1 = new Client();
        person1.setAge(16);
        person1.setName("David");

        Person person2 = new Client();
        person2.setAge(07);
        person2.setName("Matheus");

        Person person3 = new Client();
        person3.setAge(25);
        person3.setName("random");

        BinarySearch list = new BinarySearch();
        List<Person> lista = new ArrayList<>();
        lista.add(person);
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);

        list.setList(lista);

        try {
            System.out.println(person2.getAge());
            System.out.println(((Client) list.findElement(person2)).getAge());
        } catch (Exception e) {}
    }
}
