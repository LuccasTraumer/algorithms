import java.util.Objects;

public class Person {

    private String name;
    private Short age;

    private Person next;
    private Person previous;

    public Person() {}

    public Person(String name, Short age) throws Exception{
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (name.isEmpty() || name == null || name.equals(""))
            throw new PersonException("Invalid name!");
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) throws Exception{
        if (age < 0 || age > 150)
            throw new PersonException("Invalid age!");
        this.age = age;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public Person getPrevious() {
        return previous;
    }

    public void setPrevious(Person previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, next, previous);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
