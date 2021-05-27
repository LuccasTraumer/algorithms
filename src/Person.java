import java.util.Objects;

public abstract class Person {
    private String name;
    private Integer age;
    private Character genre;

    private Person next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGenre() {
        return genre;
    }

    public void setGenre(Character genre) {
        this.genre = genre;
    }

    public Person getNextPerson() {
        return next;
    }

    public void setNextPerson(Person next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre=" + genre +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(genre, person.genre) &&
                Objects.equals(next, person.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, genre, next);
    }
}
